package main.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import main.Player;
import main.Position;
import main.Ship;

public class GUIControler {
	
	private static NewGameGUI startingFrame;
	private static PlayerGUI frame;
	//list of positions where are players boats places 
	private static LinkedList<Position> playerTerritory = new LinkedList<Position>();
	//list of players ships
	private static LinkedList<Ship> playerShips = new LinkedList<Ship>();
	private static Player thisPlayer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startingFrame = new NewGameGUI();
					startingFrame.setVisible(true);
					startingFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//method for exit dialog
	public static void closeApp() {
		int option = JOptionPane.showConfirmDialog(startingFrame.getContentPane(), "Are you sure you want to surrender?",
				"Closing application...", JOptionPane.YES_NO_CANCEL_OPTION);
		if (option == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	//method for calling main window
	public static void startGame(String playerName) {
		thisPlayer = new Player(playerName);
		
		frame = new PlayerGUI(thisPlayer.getName());
		frame.setVisible(true);
		frame.setLocationRelativeTo(startingFrame.getContentPane());
		frame.setSize(460, 390);
		startingFrame.setVisible(false);

		frame.console.setText("•••" + thisPlayer.getName() + " joined the game!•••\n•Place your ships in battle area!");
	}
	
	public static void findOpponent(String playerName) {
		if(!playerName.isEmpty() && playerName != null) {
			NewGameGUI.changeStatusText(playerName);
			makeConnection();
		} else {
			GUIControler.errorMessage("You must type your name!");
		}
	}
	
	private static void makeConnection() {
		
	}

	//method that writes message in console
	public static void consoleMessage(String message) {
		frame.console.append("\n" + message);
	}

	//method for pulling text from files for menubar items
	public static String getTextFromFile(String path) {
		String text = "";
		 File file = new File(path);
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			boolean end = false;
			
			while(!end) {
				String sec = in.readLine();
				if(sec == null)
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

	public static void readyForTheGame() {
		frame.setSize(740, 390);
		consoleMessage("•••The game has started!•••");
		thisPlayer.setStartingPosition(playerShips);
		for (Ship ship : playerShips) {
			for (Position pos : ship.getPositions()) {
				System.out.println(pos.getName());
			}
			System.out.println();
		}
	}
	
	public static void errorMessage(String message) {
		JOptionPane.showMessageDialog(startingFrame.getContentPane(),
			message, "Error", JOptionPane.ERROR_MESSAGE);	
	}

	public static void populateArrayOfPositions(LinkedList<JButton> listOfButtons) {
		for (JButton btn : listOfButtons) {
			Position p = new Position(btn);
			playerTerritory.add(p);
		}
	}
	
	public static void activateButton(JButton btn, boolean isVertical, String shipType) {
		boolean outOfTerritory = true;
		PlayerGUI.setNextShipButtonEnable(false);
		Position selectedField = new Position(btn);
		
		for (Position pos : playerTerritory) {
			if(pos.getField() == btn)
				selectedField = pos;
			if(pos.isBusy() == true && pos.isPlaced() == false) {
				pos.getField().setBackground(null);
				pos.setBusy(false);
				}
			}
		
		int shipSize = 0;
		if(shipType.equals("Patrol(2)"))
			shipSize = 2;
		else if(shipType.equals("Frigate(3)")) 
			shipSize = 3;
		else if(shipType.equals("Destroyer(4)")) 
			shipSize = 4;
		else if(shipType.equals("Battleship(5)"))
			shipSize = 5;
		
		selectedField.getField().setBackground(Color.YELLOW);
		selectedField.setBusy(true);
		int i = selectedField.getColumn();
		int j = selectedField.getRow();

		try {
			for (int k = 1; k < shipSize; k++) {
				if(isVertical) {
					for (Position pos : playerTerritory) {
						outOfTerritory = true;
						if(pos.getColumn() == i && pos.getRow() == (j + 1)) {
							if(pos.isPlaced())
								throw new Exception("There is already your ship on that position!");
							pos.getField().setBackground(Color.YELLOW);
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
						if(pos.getColumn() == (i + 1) && pos.getRow() == j) {
							if(pos.isPlaced())
								throw new Exception("There is already your ship on that position!");
							pos.getField().setBackground(Color.YELLOW);
							pos.setBusy(true);
							PlayerGUI.setNextShipButtonEnable(true);
							i++;
							outOfTerritory = false;
							break;
							}
						}
					}	
				}
			if(outOfTerritory) {
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
			if(pos.isBusy() && !pos.isPlaced()) {
				pos.getField().setBackground(Color.GREEN);
				pos.setPlaced(true);
				selectedPositions.add(pos);
			}
		}
 		
 		Ship newShip = new Ship(selectedPositions, selectedPositions.size(), isVertical);
 		playerShips.add(newShip);
 		
 		if(shipType.equals("Battleship(5)"))
 			consoleMessage("•You placed your " + shipType.substring(0, shipType.length() - 3));
 		else 
 			consoleMessage("•You placed your " + shipType.substring(0, shipType.length() - 3) + " ship");
	}
}
