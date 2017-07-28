package main.view;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


public class GUIControler {
	
	private static NewGameGUI startingFrame;
	private static PlayerGUI frame;
	
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
	
	public static void closeApp() {
		int option = JOptionPane.showConfirmDialog(startingFrame.getContentPane(), "Are you sure you want to surrender?",
				"Closing application...", JOptionPane.YES_NO_CANCEL_OPTION);
		if (option == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	public static void startGame(String playerName) {
		
		frame = new PlayerGUI(playerName);
		frame.setVisible(true);
		frame.setLocationRelativeTo(startingFrame.getContentPane());
		frame.setSize(460, 390);
		startingFrame.setVisible(false);

		frame.console.setText("•••" + playerName + " joined the game!•••\n•Place your ships in battle area!");
	}
	
	public static void invalidPlayerName() {
		JOptionPane.showMessageDialog(startingFrame.getContentPane(),
				"You must type your name!", "Error", JOptionPane.ERROR_MESSAGE);
	}

	public static void findOpponent() {
		
		
		
	}
	
	public static void consoleMessage(String message) {
		frame.console.append("\n" + message);
	}

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

}
