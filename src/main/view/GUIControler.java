package main.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import main.Move;
import main.Player;
import main.Position;
import main.Ship;

public class GUIControler {

	public static NewGameGUI startingFrame;
	private static PlayerGUI frame;
	// list of positions where are players boats places
	private static LinkedList<Position> playerTerritory = new LinkedList<Position>();
	private static LinkedList<Position> enemyTerritory = new LinkedList<Position>();
	// list of players ships
	private static LinkedList<Ship> playerShips = new LinkedList<Ship>();
	private static Player thisPlayer;
	private static boolean gameHasStarted = false;
	private static Color patrolShipColor = new Color(40, 40, 40);
	private static Color destroyerShipColor = new Color(20, 20, 20);
	private static Color battleshipColor = new Color(0, 0, 0);
	private static Color selectedFieldColor = new Color(242, 242, 53);
	private static Color defaultFieldColor = new Color(15, 94, 156);
	private static Color missedColor = new Color(105, 105, 105);
	private static Color shipHitColor = new Color(204, 102, 0);
	private static Color shipDestColor = new Color(255, 0, 0);
	static BufferedReader inStreamFromClientm = null;
	static PrintStream outStreamToClientm = null;
	static ObjectInputStream inputStreamm = null;
	static ObjectOutputStream outputStreamm = null;
	static Socket communicationSocketm = null;
	static boolean end = false;
	public static boolean ignoreEvents = false;
	public static boolean begining = true;
	public static String connect;

	/**
	 * Launch the application.
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startingFrame = new NewGameGUI();
					startingFrame.setVisible(true);
					NewGameGUI.btnStartGame.setEnabled(false);
					startingFrame.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	// method for exit dialog
	public static void closeApp() {
		int option = JOptionPane.showConfirmDialog(startingFrame.getContentPane(),
				"Are you sure you want to surrender?", "Closing application...", JOptionPane.YES_NO_CANCEL_OPTION);
		if (option == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	// method for calling main window
	public static void startGame(String playerName) {
		thisPlayer = new Player(playerName);

		frame = new PlayerGUI(thisPlayer.getName());
		frame.setVisible(true);
		frame.setLocationRelativeTo(startingFrame.getContentPane());
		frame.setSize(490, 475);
		startingFrame.setVisible(false);

		frame.console.setText("•••" + thisPlayer.getName() + " joined the game!•••\n•Place your ships in battle area!");
	}

	public static void findOpponent(String playerName) throws IOException {
		if (!playerName.isEmpty() && playerName != null) {
			NewGameGUI.changeStatusText("Searching...");
			makeConnection();
			connect = inStreamFromClientm.readLine();
			if (connect.startsWith("FIRST")) {
				notificationMessageWithTimer("Wait for opponent!!",1000);
				String waitOpponent = inStreamFromClientm.readLine();
				if (waitOpponent.startsWith("NOW")) {
					NewGameGUI.changeStatusText("Opponent found!");
					NewGameGUI.btnStartGame.setEnabled(true);
				}
			} else {
				NewGameGUI.changeStatusText("Opponent found!");
				NewGameGUI.btnStartGame.setEnabled(true);
			}

		} else if (playerName.length() > 12) {
			GUIControler.errorMessage("Your name is too long!");
		} else {
			GUIControler.errorMessage("You must type your name!");
		}
	}

	private static void makeConnection() {
		int port = 5533;
		
//"172.20.10.2"
		try {
			communicationSocketm = new Socket("localhost", port);

			outStreamToClientm = new PrintStream(communicationSocketm.getOutputStream());
			inStreamFromClientm = new BufferedReader(new InputStreamReader(communicationSocketm.getInputStream()));

			outputStreamm = new ObjectOutputStream(communicationSocketm.getOutputStream());
			inputStreamm = new ObjectInputStream(communicationSocketm.getInputStream());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			notificationMessageWithTimer("Server is down or opponent quit !!!",1000);
			System.exit(0);
			
			
			
		}

	}

	// method that writes message in console
	public static void consoleMessage(String message) {
		frame.console.append("\n" + message);
	}

	// method for pulling text from files for menubar items
	public static String getTextFromFile(String path) {
		String text = "";
		File file = new File(path);
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			boolean end = false;

			while (!end) {
				String sec = in.readLine();
				if (sec == null)
					end = true;
				else
					text += sec + "\n";
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return text;
	}

	public static void readyForTheGame() throws IOException, ClassNotFoundException {
		frame.setSize(810, 475);
		consoleMessage("•••The game has started!•••");
		thisPlayer.setStartingPosition(playerShips);
		outputStreamm.writeObject(thisPlayer);
		outStreamToClientm.println("Ready");
		String opponentName = null;
		String ready = inStreamFromClientm.readLine();
		if (ready.startsWith("Not")) {
			notificationMessageWithTimer("Game will begin when opponent is ready!",1000);
			opponentName = inStreamFromClientm.readLine();
			// if(ready2.startsWith("Ready"))notificationMessage("Game has
			// started! ");

		}
		if (ready.startsWith("Ready")) {
			opponentName = inStreamFromClientm.readLine();
		}
		PlayerGUI.lblOpponentName.setText(opponentName);
		gameHasStarted = true;

	}

	public static void errorMessage(String message) {
		JOptionPane.showMessageDialog(startingFrame.getContentPane(), message, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public static void notificationMessage(String message) {
		JOptionPane.showMessageDialog(startingFrame.getContentPane(), message, "Notification !",
				JOptionPane.ERROR_MESSAGE);
	}

	public static void notificationMessageWithTimer(String message, int seconds) {
		JOptionPane opt = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new Object[] {}); // no buttons
		final JDialog dlg = opt.createDialog("Error");
		new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(seconds);
					dlg.dispose();
				} catch (Throwable th) {
					th.getMessage();
				}
			}
		}).start();
		dlg.setVisible(true);
	}

	

	public static void populateArrayOfPositions(LinkedList<JButton> listOfButtons) {
		for (JButton btn : listOfButtons) {
			Position p = new Position(btn);
			playerTerritory.add(p);
			btn.setBackground(defaultFieldColor);
		}
	}

	public static void populateArrayOfEnemyPositions(LinkedList<JButton> listOfButtons) {
		for (JButton btn : listOfButtons) {
			Position p = new Position(btn);
			enemyTerritory.add(p);
			btn.setBackground(defaultFieldColor);
		}
	}

	public static void activateButton(JButton btn, boolean isVertical, String shipType, int numOfShipsNotPlaced) {
		if (gameHasStarted)
			return;
		if (shipType.equals("Choose ship")) {
			if (numOfShipsNotPlaced == 1)
				errorMessage("You placed all your ships. Click Ready to start the game!");
			else
				errorMessage("You must choose type of ship!");
			return;
		}

		boolean outOfTerritory = true;
		PlayerGUI.setNextShipButtonEnable(false);
		Position selectedField = new Position(btn);

		if (selectedField.getField().getBackground().equals(defaultFieldColor) == false) {

			return;
		}

		for (Position pos : playerTerritory) {
			if (pos.getField() == btn)
				selectedField = pos;
			if (pos.isBusy() == true && pos.isPlaced() == false) {
				pos.getField().setBackground(defaultFieldColor);
				pos.setBusy(false);
			}
		}

		int shipSize = returnSizeOfShip(shipType);

		selectedField.getField().setBackground(selectedFieldColor);
		selectedField.setBusy(true);
		int i = selectedField.getColumn();
		int j = selectedField.getRow();

		try {
			for (int k = 1; k < shipSize; k++) {
				if (isVertical) {
					for (Position pos : playerTerritory) {
						outOfTerritory = true;
						if (pos.getColumn() == i && pos.getRow() == (j + 1)) {
							if (pos.isPlaced())
								throw new Exception("There is already your ship on that position!");
							pos.getField().setBackground(selectedFieldColor);
							pos.setBusy(true);
							PlayerGUI.setNextShipButtonEnable(true);
							j++;
							outOfTerritory = false;
							break;
						}
					}
				} else {
					for (Position pos : playerTerritory) {
						outOfTerritory = true;
						if (pos.getColumn() == (i + 1) && pos.getRow() == j) {
							if (pos.isPlaced())
								throw new Exception("There is already your ship on that position!");
							pos.getField().setBackground(selectedFieldColor);
							pos.setBusy(true);
							PlayerGUI.setNextShipButtonEnable(true);
							i++;
							outOfTerritory = false;
							break;
						}
					}
				}
			}
			if (outOfTerritory) {
				errorMessage("You must place your ship inside your territory!");
				PlayerGUI.setNextShipButtonEnable(false);
			}
		} catch (Exception e) {
			PlayerGUI.setNextShipButtonEnable(false);
			errorMessage(e.getMessage());
		}
	}

	public static void placeTheShip(String shipType, boolean isVertical) {
		LinkedList<Position> selectedPositions = new LinkedList<Position>();
		for (Position pos : playerTerritory) {
			if (pos.isBusy() && !pos.isPlaced()) {
				switch (returnSizeOfShip(shipType)) {
				case 2:
					pos.getField().setBackground(patrolShipColor);
					break;
				case 3:
					pos.getField().setBackground(destroyerShipColor);
					break;
				case 4:
					pos.getField().setBackground(battleshipColor);
					break;
				}
				pos.setPlaced(true);
				selectedPositions.add(pos);
			}
		}

		Ship newShip = new Ship(selectedPositions, selectedPositions.size(), isVertical);
		playerShips.add(newShip);

		if (shipType.contains("Battleship")) {
			consoleMessage("•You placed your Battleship");
		} else {
			consoleMessage("•You placed your " + shipType.substring(0, shipType.length() - 3) + " ship");
		}
	}

	public static void attackOponent(JButton btn) throws IOException, ClassNotFoundException {

		try {
			for (Position position : enemyTerritory) {
				if (position.getField() == btn) {
					if (position.getField().getBackground().equals(shipHitColor)
							|| position.getField().getBackground().equals(missedColor)
							|| position.getField().getBackground().equals(shipDestColor)) {
						errorMessage("You already hit that field!");
					} else {
						break;
					}
				}
			}

			for (Position position : enemyTerritory) {
				if (position.getField() == btn) {

					Move m = new Move(position);

					outputStreamm.writeObject(m);
					outputStreamm.flush();

					String response = inStreamFromClientm.readLine();

					if (response.startsWith("HIT")) {
						position.getField().setBackground(shipHitColor);
						consoleMessage("Good shot!!!");

					}
					if (response.startsWith("NOTH")) {

						String response2 = inStreamFromClientm.readLine();
						String response3 = inStreamFromClientm.readLine();
						position.getField().setBackground(missedColor);
						notificationMessageWithTimer("You missed! Wait for your opponent's turn!",500);
						consoleMessage("You missed! Wait for your opponent's turn!");
						waitMove();
						return;
					}
					String response2 = inStreamFromClientm.readLine();

					if (response2.startsWith("DEST")) {
						outStreamToClientm.println("receive");
						outStreamToClientm.flush();
						Object ob = inputStreamm.readObject();
						Ship ship = (Ship) ob;

						for (Position p : ship.positions) {
							for (Position po : enemyTerritory) {
								if (po.getColumn() == p.getColumn() && po.getRow() == p.getRow())
									po.getField().setBackground(shipDestColor);
							}
						}

						consoleMessage("You destroyed opponents ship!");
						notificationMessageWithTimer("You destroyed opponents ship!",500);
					}
					String response3 = inStreamFromClientm.readLine();

					if (response3.startsWith("END")) {
						notificationMessage("END ! YOU HAVE WON !!");
						communicationSocketm.close();
						System.exit(0);
					}
					return;

				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			notificationMessageWithTimer("Server is down or opponent quit !!!",1000);
			System.exit(0);
		}

	}

	static void waitMove() throws ClassNotFoundException, IOException {

		boolean wait = true;

		while (wait) {
			Object oo = inputStreamm.readObject();
			Move move = (Move) oo;
			Position p = getTargetedPosition(move);
			String res = inStreamFromClientm.readLine();

			if (res.startsWith("HIT")) {

				p.getField().setBackground(shipHitColor);
				notificationMessageWithTimer("Opponent hit you!", 500);

			}
			if (res.startsWith("NOTH")) {
				String response2 = inStreamFromClientm.readLine();
				String response3 = inStreamFromClientm.readLine();

				p.getField().setBackground(missedColor);

				notificationMessageWithTimer("Opponent missed! Now it's your turn!",500);
				consoleMessage("Opponent missed! Now it's your turn!");
				wait = false;
				return;
			}
			String response2 = inStreamFromClientm.readLine();

			if (response2.startsWith("DEST")) {

				Ship ship = destroyedShip(move);

				for (Position pos : ship.positions) {
					pos.getField().setBackground(shipDestColor);
				}
				notificationMessageWithTimer("Your ship is destroyed!",500);
				consoleMessage("Your ship is destroyed!");
			}
			String response3 = inStreamFromClientm.readLine();
			if (response3.startsWith("END")) {
				notificationMessage("END ! YOU HAVE LOST !!");
				communicationSocketm.close();
				System.exit(0);
			}
		}
	}

	// enable all buttons
	// ignoreEvents = false;

	private static Ship destroyedShip(Move move) {
		for (Ship ship : thisPlayer.startingPosition) {
			for (Position p : ship.positions) {
				if (p.getColumn() == move.getIndexKolona() && p.getRow() == move.getIndexRed())
					return ship;
			}
		}
		return null;
	}

	private static Position getTargetedPosition(Move move) {
		for (Position p : playerTerritory) {
			if (p.getColumn() == move.getIndexKolona() && p.getRow() == move.getIndexRed())
				return p;
		}

		return null;
	}

	public static int returnSizeOfShip(String shipType) {
		return Integer.parseInt((shipType.split("[()]"))[1]);
	}
}
