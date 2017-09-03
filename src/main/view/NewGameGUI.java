package main.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class NewGameGUI extends JFrame {

	private JPanel contentPane;
	private JPanel centerPanel;
	private JPanel eastPanel;
	private JLabel lblImageLabel;
	private JLabel lblTypeYourName;
	private JTextField txtPlayerName;
	private JButton btnFindOpponent;
	private JLabel lblStatus;
	private static JTextField txtStatus;
	public static JButton btnStartGame;

	/**
	 * Create the frame.
	 */
	public NewGameGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewGameGUI.class.getResource("/resources/iconimage.png")));
		setTitle("Naval Wars");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 586, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getCenterPanel(), BorderLayout.CENTER);
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIControler.closeApp();
			}
		});
	}
	private JPanel getCenterPanel() {
		if (centerPanel == null) {
			centerPanel = new JPanel();
			centerPanel.setLayout(null);
			centerPanel.add(getLblImageLabel());
		}
		return centerPanel;
	}
	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setLayout(new MigLayout("", "[grow]", "[][][grow][][][][grow][grow]"));
			eastPanel.add(getLblTypeYourName(), "cell 0 0,alignx left,aligny center");
			eastPanel.add(getTxtPlayerName(), "cell 0 1,grow");
			eastPanel.add(getBtnFindOpponent(), "cell 0 3,alignx center,aligny center");
			eastPanel.add(getLblStatus(), "cell 0 4");
			eastPanel.add(getTxtStatus(), "cell 0 5,growx");
			eastPanel.add(getBtnStartGame(), "cell 0 7,grow");
		}
		return eastPanel;
	}
	private JLabel getLblImageLabel() {
		if (lblImageLabel == null) {
			lblImageLabel = new JLabel(new ImageIcon(NewGameGUI.class.getResource("/resources/NewGameImage.jpg")));
			lblImageLabel.setBounds(0, 0, 414, 251);
		}
		return lblImageLabel;
	}
	private JLabel getLblTypeYourName() {
		if (lblTypeYourName == null) {
			lblTypeYourName = new JLabel("Type your name:");
			lblTypeYourName.setFont(new Font("Monospaced", Font.BOLD, 13));
		}
		return lblTypeYourName;
	}
	private JTextField getTxtPlayerName() {
		if (txtPlayerName == null) {
			txtPlayerName = new JTextField();
			txtPlayerName.setFont(new Font("Monospaced", Font.BOLD, 13));
			txtPlayerName.setColumns(10);
		}
		return txtPlayerName;
	}
	private JButton getBtnFindOpponent() {
		if (btnFindOpponent == null) {
			btnFindOpponent = new JButton("Find opponent");
			btnFindOpponent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
						try {
							GUIControler.findOpponent(txtPlayerName.getText());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			});
			btnFindOpponent.setFont(new Font("Monospaced", Font.BOLD, 13));
		}
		return btnFindOpponent;
	}
	private JLabel getLblStatus() {
		if (lblStatus == null) {
			lblStatus = new JLabel("Status:");
			lblStatus.setFont(new Font("Monospaced", Font.BOLD, 13));
		}
		return lblStatus;
	}
	private JTextField getTxtStatus() {
		if (txtStatus == null) {
			txtStatus = new JTextField();
			txtStatus.setEditable(false);
			txtStatus.setFont(new Font("Monospaced", Font.BOLD, 13));
			txtStatus.setColumns(10);
		}
		return txtStatus;
	}
	private JButton getBtnStartGame() {
		if (btnStartGame == null) {
			btnStartGame = new JButton("START GAME");
			btnStartGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
						GUIControler.startGame(txtPlayerName.getText());							
				}
			});
			btnStartGame.setFont(new Font("Monospaced", Font.BOLD, 15));
		}
		return btnStartGame;
	}
	
	static void changeStatusText(String status) {
		txtStatus.setText(status);
	}
}
