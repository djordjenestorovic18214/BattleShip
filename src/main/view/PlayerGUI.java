package main.view;


import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Cursor;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PlayerGUI extends JFrame{
	private JPanel panelEast;
	private JPanel panelCentar;
	private JPanel panelSouth;
	private JLabel lblName;
	private JTextField txtName;
	private static JButton btn11;
	private static JButton btn12;
	private static JButton btn13;
	private static JButton btn14;
	private static JButton btn15;
	private static JButton btn16;
	private static JButton btn17;
	private static JButton btn18;
	private static JButton btn21;
	private static JButton btn22;
	private static JButton btn23;
	private static JButton btn31;
	private static JButton btn41;
	private static JButton btn32;
	private static JButton btn42;
	private static JButton btn24;
	private static JButton btn75;
	private static JButton btn87;
	private static JButton btn78;
	private static JButton btn66;
	private static JButton btn64;
	private static JButton btn81;
	private static JButton btn71;
	private static JButton btn51;
	private static JButton btn61;
	private static JButton btn28;
	private static JButton btn27;
	private static JButton btn26;
	private static JButton btn25;
	private static JButton btn33;
	private static JButton btn52;
	private static JButton btn62;
	private static JButton btn72;
	private static JButton btn82;
	private static JButton btn83;
	private static JButton btn84;
	private static JButton btn85;
	private static JButton btn86;
	private static JButton btn88;
	private static JButton btn38;
	private static JButton btn37;
	private static JButton btn36;
	private static JButton btn35;
	private static JButton btn34;
	private static JButton btn43;
	private static JButton btn53;
	private static JButton btn63;
	private static JButton btn73;
	private static JButton btn74;
	private static JButton btn76;
	private static JButton btn77;
	private static JButton btn68;
	private static JButton btn58;
	private static JButton btn48;
	private static JButton btn47;
	private static JButton btn46;
	private static JButton btn45;
	private static JButton btn44;
	private static JButton btn54;
	private static JButton btn55;
	private static JButton btn65;
	private static JButton btn56;
	private static JButton btn57;
	private static JButton btn67;
	private JLabel lblIzborBrodova;
	@SuppressWarnings("rawtypes")
	private JComboBox cbShipSize;
	private JLabel lblOrientation;
	private JRadioButton rdbtnV;
	private JRadioButton rdbtnH;
	private static JButton btnPlaceShip;
	private LinkedList<JButton> playerTerritory = new LinkedList<JButton>();
	private JButton btnReady;
	JTextArea console;
	private JScrollPane scrollPane;
	private JMenuBar menuBar;
	private JMenu mnGame;
	private JMenu mnHelp;
	private JMenu mnAbout;
	private JMenuItem mntmNewGame;
	private JMenuItem mntmExit;
	private JMenuItem mntmHowToPlay;
	private JMenuItem mntmHistoryOfBattleships;
	private JMenuItem mntmAboutUs;
	private JLabel lblPlayerName;
	private JLabel lblVersus;
	private JLabel lblOpponentName;
	private JButton btn_11;
	private JButton btn_12;
	private JButton btn_13;
	private JButton btn_14;
	private JButton btn_15;
	private JButton btn_16;
	private JButton btn_17;
	private JButton btn_18;
	private JButton btn_21;
	private JButton btn_22;
	private JButton btn_23;
	private JButton btn_24;
	private JButton btn_25;
	private JButton btn_26;
	private JButton btn_27;
	private JButton btn_28;
	private JButton btn_31;
	private JButton btn_32;
	private JButton btn_33;
	private JButton btn_34;
	private JButton btn_35;
	private JButton btn_36;
	private JButton btn_37;
	private JButton btn_38;
	private JButton btn_41;
	private JButton btn_42;
	private JButton btn_43;
	private JButton btn_44;
	private JButton btn_45;
	private JButton btn_46;
	private JButton btn_47;
	private JButton btn_48;
	private JButton btn_51;
	private JButton btn_52;
	private JButton btn_53;
	private JButton btn_54;
	private JButton btn_55;
	private JButton btn_56;
	private JButton btn_57;
	private JButton btn_58;
	private JButton btn_61;
	private JButton btn_62;
	private JButton btn_63;
	private JButton btn_64;
	private JButton btn_65;
	private JButton btn_66;
	private JButton btn_67;
	private JButton btn_68;
	private JButton btn_71;
	private JButton btn_72;
	private JButton btn_73;
	private JButton btn_74;
	private JButton btn_75;
	private JButton btn_76;
	private JButton btn_77;
	private JButton btn_78;
	private JButton btn_81;
	private JButton btn_82;
	private JButton btn_83;
	private JButton btn_84;
	private JButton btn_85;
	private JButton btn_86;
	private JButton btn_87;
	private JButton btn_88;
	private JLabel lblLogo;
	private JLabel lblIcon;

	/**
	 * Create the application.
	 * @param playerName 
	 */
	public PlayerGUI(String playerName) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(PlayerGUI.class.getResource("/resources/iconimage.png")));
		setJMenuBar(getMenuBar_1());
		initialize(playerName);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param playerName 
	 */
	private void initialize(String playerName) {
		setFont(new Font("Monospaced", Font.BOLD, 16));
		setTitle("Naval Wars");
		setBounds(100, 100, 890, 390);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanelEast(), BorderLayout.EAST);
		getContentPane().add(getPanelCentar(), BorderLayout.CENTER);
		getContentPane().add(getPanelSouth(), BorderLayout.SOUTH);
		txtName.setText(playerName);
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnV);
		group.add(rdbtnH);
		populateListOfButtons();
		GUIControler.populateArrayOfPositions(playerTerritory);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIControler.closeApp();
			}
		});
	}
	private void populateListOfButtons() {
		playerTerritory.add(btn11);
		playerTerritory.add(btn12);
		playerTerritory.add(btn13);
		playerTerritory.add(btn14);
		playerTerritory.add(btn15);
		playerTerritory.add(btn16);
		playerTerritory.add(btn17);
		playerTerritory.add(btn18);
		playerTerritory.add(btn21);
		playerTerritory.add(btn22);
		playerTerritory.add(btn23);
		playerTerritory.add(btn24);
		playerTerritory.add(btn25);
		playerTerritory.add(btn26);
		playerTerritory.add(btn27);
		playerTerritory.add(btn28);
		playerTerritory.add(btn31);
		playerTerritory.add(btn32);
		playerTerritory.add(btn33);
		playerTerritory.add(btn34);
		playerTerritory.add(btn35);
		playerTerritory.add(btn36);
		playerTerritory.add(btn37);
		playerTerritory.add(btn38);
		playerTerritory.add(btn41);
		playerTerritory.add(btn42);
		playerTerritory.add(btn43);
		playerTerritory.add(btn44);
		playerTerritory.add(btn45);
		playerTerritory.add(btn46);
		playerTerritory.add(btn47);
		playerTerritory.add(btn48);
		playerTerritory.add(btn51);
		playerTerritory.add(btn52);
		playerTerritory.add(btn53);
		playerTerritory.add(btn54);
		playerTerritory.add(btn55);
		playerTerritory.add(btn56);
		playerTerritory.add(btn57);
		playerTerritory.add(btn58);
		playerTerritory.add(btn61);
		playerTerritory.add(btn62);
		playerTerritory.add(btn63);
		playerTerritory.add(btn64);
		playerTerritory.add(btn65);
		playerTerritory.add(btn66);
		playerTerritory.add(btn67);
		playerTerritory.add(btn68);
		playerTerritory.add(btn71);
		playerTerritory.add(btn72);
		playerTerritory.add(btn73);
		playerTerritory.add(btn74);
		playerTerritory.add(btn75);
		playerTerritory.add(btn76);
		playerTerritory.add(btn77);
		playerTerritory.add(btn78);
		playerTerritory.add(btn81);
		playerTerritory.add(btn82);
		playerTerritory.add(btn83);
		playerTerritory.add(btn84);
		playerTerritory.add(btn85);
		playerTerritory.add(btn86);
		playerTerritory.add(btn87);
		playerTerritory.add(btn88);
	}

	private JPanel getPanelEast() {
		if (panelEast == null) {
			panelEast = new JPanel();
			panelEast.setPreferredSize(new Dimension(140, 10));
			panelEast.setLayout(new MigLayout("", "[50px]", "[14px][20px][14px][20px][14px][23px][25px][grow][37px]"));
			panelEast.add(getLblName(), "cell 0 0,alignx center,growy");
			panelEast.add(getTxtName(), "cell 0 1,alignx center,growy");
			panelEast.add(getLblIzborBrodova(), "cell 0 2,alignx center,growy");
			panelEast.add(getCbShipSize(), "cell 0 3");
			panelEast.add(getLblOrientation(), "cell 0 4,alignx center,growy");
			panelEast.add(getRdbtnV(), "flowx,cell 0 5,alignx center,growy");
			panelEast.add(getButton_6_1(), "cell 0 6,alignx center,growy");
			panelEast.add(getBtnReady(), "cell 0 8,alignx center,growy");
			panelEast.add(getRdbtnH(), "cell 0 5,alignx center,growy");
		}
		return panelEast;
	}
	private JPanel getPanelCentar() {
		if (panelCentar == null) {
			panelCentar = new JPanel();
			panelCentar.setPreferredSize(new Dimension(260, 260));
			panelCentar.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][]", "[][][][][][][][]"));
			panelCentar.add(getBtn11(), "cell 0 0");
			panelCentar.add(getBtn12(), "cell 1 0");
			panelCentar.add(getBtn13(), "cell 2 0");
			panelCentar.add(getBtn14(), "cell 3 0");
			panelCentar.add(getBtn15(), "cell 4 0");
			panelCentar.add(getBtn16(), "cell 5 0");
			panelCentar.add(getBtn17(), "cell 6 0");
			panelCentar.add(getBtn18(), "cell 7 0");
			panelCentar.add(getBtn_11(), "cell 11 0,grow");
			panelCentar.add(getBtn_12(), "cell 12 0,grow");
			panelCentar.add(getBtn_13(), "cell 13 0,grow");
			panelCentar.add(getBtn_14(), "cell 14 0,grow");
			panelCentar.add(getBtn_15(), "cell 15 0,grow");
			panelCentar.add(getBtn_16(), "cell 16 0,grow");
			panelCentar.add(getBtn_17(), "cell 17 0,grow");
			panelCentar.add(getBtn_18(), "cell 18 0,grow");
			panelCentar.add(getBtn21(), "cell 0 1");
			panelCentar.add(getBtn22(), "cell 1 1");
			panelCentar.add(getBtn23(), "cell 2 1");
			panelCentar.add(getBtn24(), "cell 3 1");
			panelCentar.add(getBtn25(), "cell 4 1");
			panelCentar.add(getBtn26(), "cell 5 1");
			panelCentar.add(getBtn27(), "cell 6 1");
			panelCentar.add(getBtn28(), "cell 7 1");
			panelCentar.add(getLblPlayerName(), "cell 9 1,alignx center");
			panelCentar.add(getBtn_21(), "cell 11 1,grow");
			panelCentar.add(getBtn_22(), "cell 12 1,grow");
			panelCentar.add(getBtn_23(), "cell 13 1,grow");
			panelCentar.add(getBtn_24(), "cell 14 1,grow");
			panelCentar.add(getBtn_25(), "cell 15 1,grow");
			panelCentar.add(getBtn_26(), "cell 16 1,grow");
			panelCentar.add(getBtn_27(), "cell 17 1,grow");
			panelCentar.add(getBtn_28(), "cell 18 1,grow");
			panelCentar.add(getBtn31(), "cell 0 2");
			panelCentar.add(getBtn32(), "cell 1 2");
			panelCentar.add(getBtn33(), "cell 2 2");
			panelCentar.add(getBtn34(), "cell 3 2");
			panelCentar.add(getBtn35(), "cell 4 2");
			panelCentar.add(getBtn36(), "cell 5 2");
			panelCentar.add(getBtn37(), "cell 6 2");
			panelCentar.add(getBtn38(), "cell 7 2");
			panelCentar.add(getLblVersus(), "cell 9 2,alignx center");
			panelCentar.add(getBtn_31(), "cell 11 2,grow");
			panelCentar.add(getBtn_32(), "cell 12 2,grow");
			panelCentar.add(getBtn_33(), "cell 13 2,grow");
			panelCentar.add(getBtn_34(), "cell 14 2,grow");
			panelCentar.add(getBtn_35(), "cell 15 2,grow");
			panelCentar.add(getBtn_36(), "cell 16 2,grow");
			panelCentar.add(getBtn_37(), "cell 17 2,grow");
			panelCentar.add(getBtn_38(), "cell 18 2,grow");
			panelCentar.add(getBtn41(), "cell 0 3");
			panelCentar.add(getBtn42(), "cell 1 3");
			panelCentar.add(getBtn43(), "cell 2 3");
			panelCentar.add(getBtn44(), "cell 3 3");
			panelCentar.add(getBtn45(), "cell 4 3");
			panelCentar.add(getBtn46(), "cell 5 3");
			panelCentar.add(getBtn47(), "cell 6 3");
			panelCentar.add(getBtn48(), "cell 7 3");
			panelCentar.add(getLblOpponentName(), "cell 9 3,alignx center");
			panelCentar.add(getBtn_41(), "cell 11 3,grow");
			panelCentar.add(getBtn_42(), "cell 12 3,grow");
			panelCentar.add(getBtn_43(), "cell 13 3,grow");
			panelCentar.add(getBtn_44(), "cell 14 3,grow");
			panelCentar.add(getBtn_45(), "cell 15 3,grow");
			panelCentar.add(getBtn_46(), "cell 16 3,grow");
			panelCentar.add(getBtn_47(), "cell 17 3,grow");
			panelCentar.add(getBtn_48(), "cell 18 3,grow");
			panelCentar.add(getBtn51(), "cell 0 4");
			panelCentar.add(getBtn52(), "cell 1 4");
			panelCentar.add(getBtn53(), "cell 2 4");
			panelCentar.add(getBtn54(), "cell 3 4");
			panelCentar.add(getBtn55(), "cell 4 4");
			panelCentar.add(getBtn56(), "cell 5 4");
			panelCentar.add(getBtn57(), "cell 6 4");
			panelCentar.add(getBtn58(), "cell 7 4");
			panelCentar.add(getLblIcon(), "cell 9 4");
			panelCentar.add(getBtn_51(), "cell 11 4,grow");
			panelCentar.add(getBtn_52(), "cell 12 4,grow");
			panelCentar.add(getBtn_53(), "cell 13 4,grow");
			panelCentar.add(getBtn_54(), "cell 14 4,grow");
			panelCentar.add(getBtn_55(), "cell 15 4,grow");
			panelCentar.add(getBtn_56(), "cell 16 4,grow");
			panelCentar.add(getBtn_57(), "cell 17 4,grow");
			panelCentar.add(getBtn_58(), "cell 18 4,grow");
			panelCentar.add(getBtn61(), "cell 0 5");
			panelCentar.add(getBtn62(), "cell 1 5");
			panelCentar.add(getBtn63(), "cell 2 5");
			panelCentar.add(getBtn64(), "cell 3 5");
			panelCentar.add(getBtn65(), "cell 4 5");
			panelCentar.add(getBtn66(), "cell 5 5");
			panelCentar.add(getBtn67(), "cell 6 5");
			panelCentar.add(getBtn68(), "cell 7 5");
			panelCentar.add(getBtn_61(), "cell 11 5,grow");
			panelCentar.add(getBtn_62(), "cell 12 5,grow");
			panelCentar.add(getBtn_63(), "cell 13 5,grow");
			panelCentar.add(getBtn_64(), "cell 14 5,grow");
			panelCentar.add(getBtn_65(), "cell 15 5,grow");
			panelCentar.add(getBtn_66(), "cell 16 5,grow");
			panelCentar.add(getBtn_67(), "cell 17 5,grow");
			panelCentar.add(getBtn_68(), "cell 18 5,grow");
			panelCentar.add(getBtn71(), "cell 0 6");
			panelCentar.add(getBtn72(), "cell 1 6");
			panelCentar.add(getBtn73(), "cell 2 6");
			panelCentar.add(getBtn74(), "cell 3 6");
			panelCentar.add(getBtn75(), "cell 4 6");
			panelCentar.add(getBtn76(), "cell 5 6");
			panelCentar.add(getBtn77(), "cell 6 6");
			panelCentar.add(getBtn78(), "cell 7 6");
			panelCentar.add(getBtn_71(), "cell 11 6,grow");
			panelCentar.add(getBtn_72(), "cell 12 6,growy");
			panelCentar.add(getBtn_73(), "cell 13 6,growy");
			panelCentar.add(getBtn_74(), "cell 14 6,growy");
			panelCentar.add(getBtn_75(), "cell 15 6,growy");
			panelCentar.add(getBtn_76(), "cell 16 6,grow");
			panelCentar.add(getBtn_77(), "cell 17 6,growy");
			panelCentar.add(getBtn_78(), "cell 18 6,growy");
			panelCentar.add(getBtn81(), "cell 0 7");
			panelCentar.add(getBtn82(), "cell 1 7");
			panelCentar.add(getBtn83(), "cell 2 7");
			panelCentar.add(getBtn84(), "cell 3 7");
			panelCentar.add(getBtn85(), "cell 4 7");
			panelCentar.add(getBtn86(), "cell 5 7");
			panelCentar.add(getBtn87(), "cell 6 7");
			panelCentar.add(getBtn88(), "cell 7 7");
			panelCentar.add(getBtn_81(), "cell 11 7,growy");
			panelCentar.add(getBtn_82(), "cell 12 7,growy");
			panelCentar.add(getBtn_83(), "cell 13 7,growy");
			panelCentar.add(getBtn_84(), "cell 14 7,growy");
			panelCentar.add(getBtn_85(), "cell 15 7,growy");
			panelCentar.add(getBtn_86(), "cell 16 7,growy");
			panelCentar.add(getBtn_87(), "cell 17 7,growy");
			panelCentar.add(getBtn_88(), "cell 18 7,growy");
		}
		return panelCentar;
	}
	private JPanel getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanel();
			panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelSouth.add(getScrollPane());
			panelSouth.add(getLblLogo());
		}
		return panelSouth;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Admiral:");
			lblName.setFont(new Font("Monospaced", Font.BOLD, 12));
		}
		return lblName;
	}
	private JTextField getTxtName() {
		if (txtName == null) {
			txtName = new JTextField();
			txtName.setEditable(false);
			txtName.setColumns(10);
		}
		return txtName;
	}
	private JButton getBtn11() {
		if (btn11 == null) {
			btn11 = new JButton("");
			btn11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn11, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn11.setMinimumSize(new Dimension(10, 10));
			btn11.setPreferredSize(new Dimension(33, 33));
			btn11.setName("btn11");
		}
		return btn11;
	}
	private JButton getBtn12() {
		if (btn12 == null) {
			btn12 = new JButton("");
			btn12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn12, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}});
			btn12.setMinimumSize(new Dimension(10, 10));
			btn12.setPreferredSize(new Dimension(33, 33));
			btn12.setName("btn12");
		}
		return btn12;
	}
	private JButton getBtn13() {
		if (btn13 == null) {
			btn13 = new JButton("");
			btn13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn13, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn13.setMinimumSize(new Dimension(10, 10));
			btn13.setPreferredSize(new Dimension(33, 33));
			btn13.setName("btn13");
		}
		return btn13;
	}
	private JButton getBtn14() {
		if (btn14 == null) {
			btn14 = new JButton("");
			btn14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn14, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn14.setMinimumSize(new Dimension(10, 10));
			btn14.setPreferredSize(new Dimension(33, 33));
			btn14.setName("btn14");
		}
		return btn14;
	}
	private JButton getBtn15() {
		if (btn15 == null) {
			btn15 = new JButton("");
			btn15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn15, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn15.setMinimumSize(new Dimension(10, 10));
			btn15.setPreferredSize(new Dimension(33, 33));
			btn15.setName("btn15");
		}
		return btn15;
	}
	private JButton getBtn16() {
		if (btn16 == null) {
			btn16 = new JButton("");
			btn16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn16, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn16.setMinimumSize(new Dimension(10, 10));
			btn16.setPreferredSize(new Dimension(33, 33));
			btn16.setName("btn16");
		}
		return btn16;
	}
	private JButton getBtn17() {
		if (btn17 == null) {
			btn17 = new JButton("");
			btn17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn17, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn17.setMinimumSize(new Dimension(10, 10));
			btn17.setPreferredSize(new Dimension(33, 33));
			btn17.setName("btn17");
		}
		return btn17;
	}
	private JButton getBtn18() {
		if (btn18 == null) {
			btn18 = new JButton("");
			btn18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn18, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn18.setMinimumSize(new Dimension(1, 10));
			btn18.setPreferredSize(new Dimension(33, 33));
			btn18.setName("btn18");
		}
		return btn18;
	}
	private JButton getBtn21() {
		if (btn21 == null) {
			btn21 = new JButton("");
			btn21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn21, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn21.setPreferredSize(new Dimension(33, 33));
			btn21.setName("btn21");
		}
		return btn21;
	}
	private JButton getBtn22() {
		if (btn22 == null) {
			btn22 = new JButton("");
			btn22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn22, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn22.setPreferredSize(new Dimension(33, 33));
			btn22.setName("btn22");
		}
		return btn22;
	}
	private JButton getBtn23() {
		if (btn23 == null) {
			btn23 = new JButton("");
			btn23.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn23, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn23.setPreferredSize(new Dimension(33, 33));
			btn23.setName("btn23");
		}
		return btn23;
	}
	private JButton getBtn31() {
		if (btn31 == null) {
			btn31 = new JButton("");
			btn31.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn31, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn31.setPreferredSize(new Dimension(33, 33));
			btn31.setName("btn31");
		}
		return btn31;
	}
	private JButton getBtn41() {
		if (btn41 == null) {
			btn41 = new JButton("");
			btn41.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn41, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn41.setPreferredSize(new Dimension(33, 33));
			btn41.setName("btn41");
		}
		return btn41;
	}
	private JButton getBtn32() {
		if (btn32 == null) {
			btn32 = new JButton("");
			btn32.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn32, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn32.setPreferredSize(new Dimension(33, 33));
			btn32.setName("btn32");
		}
		return btn32;
	}
	private JButton getBtn42() {
		if (btn42 == null) {
			btn42 = new JButton("");
			btn42.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn42, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn42.setPreferredSize(new Dimension(33, 33));
			btn42.setName("btn42");
		}
		return btn42;
	}
	private JButton getBtn24() {
		if (btn24 == null) {
			btn24 = new JButton("");
			btn24.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn24, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn24.setPreferredSize(new Dimension(33, 33));
			btn24.setName("btn24");
		}
		return btn24;
	}
	private JButton getBtn75() {
		if (btn75 == null) {
			btn75 = new JButton("");
			btn75.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn75, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn75.setPreferredSize(new Dimension(33, 33));
			btn75.setName("btn75");
		}
		return btn75;
	}
	private JButton getBtn87() {
		if (btn87 == null) {
			btn87 = new JButton("");
			btn87.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn87, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn87.setPreferredSize(new Dimension(33, 33));
			btn87.setName("btn87");
		}
		return btn87;
	}
	private JButton getBtn78() {
		if (btn78 == null) {
			btn78 = new JButton("");
			btn78.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn78, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn78.setPreferredSize(new Dimension(33, 33));
			btn78.setName("btn78");
		}
		return btn78;
	}
	private JButton getBtn66() {
		if (btn66 == null) {
			btn66 = new JButton("");
			btn66.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn66, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn66.setPreferredSize(new Dimension(33, 33));
			btn66.setName("btn66");
		}
		return btn66;
	}
	private JButton getBtn64() {
		if (btn64 == null) {
			btn64 = new JButton("");
			btn64.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn64, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn64.setPreferredSize(new Dimension(33, 33));
			btn64.setName("btn64");
		}
		return btn64;
	}
	private JButton getBtn81() {
		if (btn81 == null) {
			btn81 = new JButton("");
			btn81.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn81, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn81.setPreferredSize(new Dimension(33, 33));
			btn81.setName("btn81");
		}
		return btn81;
	}
	private JButton getBtn71() {
		if (btn71 == null) {
			btn71 = new JButton("");
			btn71.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn71, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn71.setPreferredSize(new Dimension(33, 33));
			btn71.setName("btn71");
		}
		return btn71;
	}
	private JButton getBtn51() {
		if (btn51 == null) {
			btn51 = new JButton("");
			btn51.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn51, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn51.setPreferredSize(new Dimension(33, 33));
			btn51.setName("btn51");
		}
		return btn51;
	}
	private JButton getBtn61() {
		if (btn61 == null) {
			btn61 = new JButton("");
			btn61.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn61, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn61.setPreferredSize(new Dimension(33, 33));
			btn61.setName("btn61");
		}
		return btn61;
	}
	private JButton getBtn28() {
		if (btn28 == null) {
			btn28 = new JButton("");
			btn28.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn28, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn28.setPreferredSize(new Dimension(33, 33));
			btn28.setName("btn28");
		}
		return btn28;
	}
	private JButton getBtn27() {
		if (btn27 == null) {
			btn27 = new JButton("");
			btn27.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn27, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn27.setPreferredSize(new Dimension(33, 33));
			btn27.setName("btn27");
		}
		return btn27;
	}
	private JButton getBtn26() {
		if (btn26 == null) {
			btn26 = new JButton("");
			btn26.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn26, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn26.setPreferredSize(new Dimension(33, 33));
			btn26.setName("btn26");
		}
		return btn26;
	}
	private JButton getBtn25() {
		if (btn25 == null) {
			btn25 = new JButton("");
			btn25.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn25, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn25.setPreferredSize(new Dimension(33, 33));
			btn25.setName("btn25");
		}
		return btn25;
	}
	private JButton getBtn33() {
		if (btn33 == null) {
			btn33 = new JButton("");
			btn33.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn33, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn33.setPreferredSize(new Dimension(33, 33));
			btn33.setName("btn33");
		}
		return btn33;
	}
	private JButton getBtn52() {
		if (btn52 == null) {
			btn52 = new JButton("");
			btn52.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn52, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn52.setPreferredSize(new Dimension(33, 33));
			btn52.setName("btn52");
		}
		return btn52;
	}
	private JButton getBtn62() {
		if (btn62 == null) {
			btn62 = new JButton("");
			btn62.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn62, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn62.setPreferredSize(new Dimension(33, 33));
			btn62.setName("btn62");
		}
		return btn62;
	}
	private JButton getBtn72() {
		if (btn72 == null) {
			btn72 = new JButton("");
			btn72.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn72, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn72.setPreferredSize(new Dimension(33, 33));
			btn72.setName("btn72");
		}
		return btn72;
	}
	private JButton getBtn82() {
		if (btn82 == null) {
			btn82 = new JButton("");
			btn82.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn82, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn82.setPreferredSize(new Dimension(33, 33));
			btn82.setName("btn82");
		}
		return btn82;
	}
	private JButton getBtn83() {
		if (btn83 == null) {
			btn83 = new JButton("");
			btn83.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn83, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn83.setPreferredSize(new Dimension(33, 33));
			btn83.setName("btn83");
		}
		return btn83;
	}
	private JButton getBtn84() {
		if (btn84 == null) {
			btn84 = new JButton("");
			btn84.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn84, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn84.setPreferredSize(new Dimension(33, 33));
			btn84.setName("btn84");
		}
		return btn84;
	}
	private JButton getBtn85() {
		if (btn85 == null) {
			btn85 = new JButton("");
			btn85.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn85, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn85.setPreferredSize(new Dimension(33, 33));
			btn85.setName("btn85");
		}
		return btn85;
	}
	private JButton getBtn86() {
		if (btn86 == null) {
			btn86 = new JButton("");
			btn86.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn86, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn86.setPreferredSize(new Dimension(33, 33));
			btn86.setName("btn86");
		}
		return btn86;
	}
	private JButton getBtn88() {
		if (btn88 == null) {
			btn88 = new JButton("");
			btn88.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn88, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn88.setPreferredSize(new Dimension(33, 33));
			btn88.setName("btn88");
		}
		return btn88;
	}
	private JButton getBtn38() {
		if (btn38 == null) {
			btn38 = new JButton("");
			btn38.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn38, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn38.setPreferredSize(new Dimension(33, 33));
			btn38.setName("btn38");
		}
		return btn38;
	}
	private JButton getBtn37() {
		if (btn37 == null) {
			btn37 = new JButton("");
			btn37.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn37, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn37.setPreferredSize(new Dimension(33, 33));
			btn37.setName("btn37");
		}
		return btn37;
	}
	private JButton getBtn36() {
		if (btn36 == null) {
			btn36 = new JButton("");
			btn36.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn36, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn36.setPreferredSize(new Dimension(33, 33));
			btn36.setName("btn36");
		}
		return btn36;
	}
	private JButton getBtn35() {
		if (btn35 == null) {
			btn35 = new JButton("");
			btn35.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn35, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn35.setPreferredSize(new Dimension(33, 33));
			btn35.setName("btn35");
		}
		return btn35;
	}
	private JButton getBtn34() {
		if (btn34 == null) {
			btn34 = new JButton("");
			btn34.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn34, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn34.setPreferredSize(new Dimension(33, 33));
			btn34.setName("btn34");
		}
		return btn34;
	}
	private JButton getBtn43() {
		if (btn43 == null) {
			btn43 = new JButton("");
			btn43.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn43, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn43.setPreferredSize(new Dimension(33, 33));
			btn43.setName("btn43");
		}
		return btn43;
	}
	private JButton getBtn53() {
		if (btn53 == null) {
			btn53 = new JButton("");
			btn53.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn53, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn53.setPreferredSize(new Dimension(33, 33));
			btn53.setName("btn53");
		}
		return btn53;
	}
	private JButton getBtn63() {
		if (btn63 == null) {
			btn63 = new JButton("");
			btn63.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn63, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn63.setPreferredSize(new Dimension(33, 33));
			btn63.setName("btn63");
		}
		return btn63;
	}
	private JButton getBtn73() {
		if (btn73 == null) {
			btn73 = new JButton("");
			btn73.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn73, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn73.setPreferredSize(new Dimension(33, 33));
			btn73.setName("btn73");
		}
		return btn73;
	}
	private JButton getBtn74() {
		if (btn74 == null) {
			btn74 = new JButton("");
			btn74.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn74, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn74.setPreferredSize(new Dimension(33, 33));
			btn74.setName("btn74");
		}
		return btn74;
	}
	private JButton getBtn76() {
		if (btn76 == null) {
			btn76 = new JButton("");
			btn76.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn76, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn76.setPreferredSize(new Dimension(33, 33));
			btn76.setName("btn76");
		}
		return btn76;
	}
	private JButton getBtn77() {
		if (btn77 == null) {
			btn77 = new JButton("");
			btn77.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn77, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn77.setPreferredSize(new Dimension(33, 33));
			btn77.setName("btn77");
		}
		return btn77;
	}
	private JButton getBtn68() {
		if (btn68 == null) {
			btn68 = new JButton("");
			btn68.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn68, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn68.setPreferredSize(new Dimension(33, 33));
			btn68.setName("btn68");
		}
		return btn68;
	}
	private JButton getBtn58() {
		if (btn58 == null) {
			btn58 = new JButton("");
			btn58.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn58, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn58.setPreferredSize(new Dimension(33, 33));
			btn58.setName("btn58");
		}
		return btn58;
	}
	private JButton getBtn48() {
		if (btn48 == null) {
			btn48 = new JButton("");
			btn48.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn48, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn48.setPreferredSize(new Dimension(33, 33));
			btn48.setName("btn48");
		}
		return btn48;
	}
	private JButton getBtn47() {
		if (btn47 == null) {
			btn47 = new JButton("");
			btn47.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn47, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn47.setPreferredSize(new Dimension(33, 33));
			btn47.setName("btn47");
		}
		return btn47;
	}
	private JButton getBtn46() {
		if (btn46 == null) {
			btn46 = new JButton("");
			btn46.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn46, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn46.setPreferredSize(new Dimension(33, 33));
			btn46.setName("btn46");
		}
		return btn46;
	}
	private JButton getBtn45() {
		if (btn45 == null) {
			btn45 = new JButton("");
			btn45.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn45, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn45.setPreferredSize(new Dimension(33, 33));
			btn45.setName("btn45");
		}
		return btn45;
	}
	private JButton getBtn44() {
		if (btn44 == null) {
			btn44 = new JButton("");
			btn44.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn44, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn44.setPreferredSize(new Dimension(33, 33));
			btn44.setName("btn44");
		}
		return btn44;
	}
	private JButton getBtn54() {
		if (btn54 == null) {
			btn54 = new JButton("");
			btn54.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn54, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn54.setPreferredSize(new Dimension(33, 33));
			btn54.setName("btn54");
		}
		return btn54;
	}
	private JButton getBtn55() {
		if (btn55 == null) {
			btn55 = new JButton("");
			btn55.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn55, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn55.setPreferredSize(new Dimension(33, 33));
			btn55.setName("btn55");
		}
		return btn55;
	}
	private JButton getBtn65() {
		if (btn65 == null) {
			btn65 = new JButton("");
			btn65.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn65, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn65.setPreferredSize(new Dimension(33, 33));
			btn65.setName("btn65");
		}
		return btn65;
	}
	private JButton getBtn56() {
		if (btn56 == null) {
			btn56 = new JButton("");
			btn56.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn56, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn56.setPreferredSize(new Dimension(33, 33));
			btn56.setName("btn56");
		}
		return btn56;
	}
	private JButton getBtn57() {
		if (btn57 == null) {
			btn57 = new JButton("");
			btn57.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn57, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn57.setPreferredSize(new Dimension(33, 33));
			btn57.setName("btn57");
		}
		return btn57;
	}
	private JButton getBtn67() {
		if (btn67 == null) {
			btn67 = new JButton("");
			btn67.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn67, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString());
				}
			});
			btn67.setPreferredSize(new Dimension(33, 33));
			btn67.setName("btn67");
		}
		return btn67;
	}
	private JLabel getLblIzborBrodova() {
		if (lblIzborBrodova == null) {
			lblIzborBrodova = new JLabel("Ship(size):");
			lblIzborBrodova.setFont(new Font("Monospaced", Font.BOLD, 12));
		}
		return lblIzborBrodova;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox getCbShipSize() {
		if (cbShipSize == null) {
			cbShipSize = new JComboBox();
			cbShipSize.setFont(new Font("Monospaced", Font.BOLD, 12));
			cbShipSize.addItem("Patrol(2)");
			cbShipSize.addItem("Patrol(2)");
			cbShipSize.addItem("Patrol(2)");
			cbShipSize.addItem("Patrol(2)");
			cbShipSize.addItem("Frigate(3)");
			cbShipSize.addItem("Frigate(3)");
			cbShipSize.addItem("Destroyer(4)");
			cbShipSize.addItem("Battleship(5)");
		}
		return cbShipSize;
	}
	private JLabel getLblOrientation() {
		if (lblOrientation == null) {
			lblOrientation = new JLabel("Ship orientation:");
			lblOrientation.setFont(new Font("Monospaced", Font.BOLD, 12));
		}
		return lblOrientation;
	}
	private JRadioButton getRdbtnV() {
		if (rdbtnV == null) {
			rdbtnV = new JRadioButton("V");
			rdbtnV.setFont(new Font("Monospaced", Font.BOLD, 12));
			rdbtnV.setSelected(true);
		}
		return rdbtnV;
	}
	private JRadioButton getRdbtnH() {
		if (rdbtnH == null) {
			rdbtnH = new JRadioButton("H");
			rdbtnH.setFont(new Font("Monospaced", Font.BOLD, 12));
		}
		return rdbtnH;
	}
	private JButton getButton_6_1() {
		if (btnPlaceShip == null) {
			btnPlaceShip = new JButton("Place Ship");
			btnPlaceShip.setEnabled(false);
			btnPlaceShip.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.placeTheShip(cbShipSize.getSelectedItem().toString(), rdbtnV.isSelected());
					cbShipSize.removeItem(cbShipSize.getSelectedItem());
					btnPlaceShip.setEnabled(false);
				}
			});
			btnPlaceShip.setFont(new Font("Monospaced", Font.BOLD, 12));
		}
		return btnPlaceShip;
	}

	private JButton getBtnReady() {
		if (btnReady == null) {
			btnReady = new JButton("READY");
			btnReady.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panelEast.setVisible(false);
					lblPlayerName.setText(txtName.getText());
					GUIControler.readyForTheGame();
				}
			});
			btnReady.setFont(new Font("Monospaced", Font.BOLD, 17));
			btnReady.setMaximumSize(new Dimension(85, 50));
			btnReady.setPreferredSize(new Dimension(85, 50));
			btnReady.setMinimumSize(new Dimension(85, 50));
		}
		return btnReady;
	}
	private JTextArea getConsole() {
		if (console == null) {
			console = new JTextArea();
			console.setEditable(false);
			console.setBorder(null);
			console.setRows(4);
			console.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			console.setWrapStyleWord(true);
			console.setLineWrap(true);
		}
		return console;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(430, 70));
			scrollPane.setMinimumSize(new Dimension(460, 70));
			scrollPane.setSize(460, 70);
			scrollPane.setFont(new Font("Monospaced", Font.BOLD, 11));
			scrollPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Console", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			scrollPane.setViewportView(getConsole());
		}
		return scrollPane;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnGame());
			menuBar.add(getMnHelp());
			menuBar.add(getMnAbout());
		}
		return menuBar;
	}
	private JMenu getMnGame() {
		if (mnGame == null) {
			mnGame = new JMenu("Game");
			mnGame.setFont(new Font("Monospaced", Font.BOLD, 13));
			mnGame.add(getMntmNewGame());
			mnGame.add(getMntmExit());
		}
		return mnGame;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.setFont(new Font("Monospaced", Font.BOLD, 13));
			mnHelp.add(getMntmHowToPlay());
		}
		return mnHelp;
	}
	private JMenu getMnAbout() {
		if (mnAbout == null) {
			mnAbout = new JMenu("About");
			mnAbout.setFont(new Font("Monospaced", Font.BOLD, 13));
			mnAbout.add(getMntmHistoryOfBattleships());
			mnAbout.add(getMntmAboutUs());
		}
		return mnAbout;
	}
	private JMenuItem getMntmNewGame() {
		if (mntmNewGame == null) {
			mntmNewGame = new JMenuItem("New Game");
			mntmNewGame.setFont(new Font("Monospaced", Font.PLAIN, 12));
		}
		return mntmNewGame;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.closeApp();
				}
			});
			mntmExit.setFont(new Font("Monospaced", Font.PLAIN, 12));
		}
		return mntmExit;
	}
	private JMenuItem getMntmHowToPlay() {
		if (mntmHowToPlay == null) {
			mntmHowToPlay = new JMenuItem("How To Play");
			mntmHowToPlay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(getContentPane(),
							GUIControler.getTextFromFile("C:\\Users\\HP\\git\\BattleShip-Client-\\src\\resources\\instructions.txt"), "How To Play", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			mntmHowToPlay.setFont(new Font("Monospaced", Font.PLAIN, 12));
		}
		return mntmHowToPlay;
	}
	private JMenuItem getMntmHistoryOfBattleships() {
		if (mntmHistoryOfBattleships == null) {
			mntmHistoryOfBattleships = new JMenuItem("History of Battleships");
			mntmHistoryOfBattleships.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(getContentPane(),
							GUIControler.getTextFromFile("C:\\Users\\HP\\git\\BattleShip-Client-\\src\\resources\\history.txt"), "History of Battleships", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			mntmHistoryOfBattleships.setFont(new Font("Monospaced", Font.PLAIN, 12));
		}
		return mntmHistoryOfBattleships;
	}
	private JMenuItem getMntmAboutUs() {
		if (mntmAboutUs == null) {
			mntmAboutUs = new JMenuItem("About Us");
			mntmAboutUs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(getContentPane(),
							"This game was developed by \n•Djordje Nestorovic\n•Matija Milekic\n•Ivan Prlic\n"
							+ "We are studying at University of Belgrade, Faculty of Organizational Sciences.\n"
							+ "This game was our project for subject Computer networks and telecommunications.", "About Developers", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			mntmAboutUs.setFont(new Font("Monospaced", Font.PLAIN, 12));
		}
		return mntmAboutUs;
	}
	private JLabel getLblPlayerName() {
		if (lblPlayerName == null) {
			lblPlayerName = new JLabel("Player Name");
			lblPlayerName.setFont(new Font("Monospaced", Font.BOLD, 13));
		}
		return lblPlayerName;
	}
	private JLabel getLblVersus() {
		if (lblVersus == null) {
			lblVersus = new JLabel("VS");
			lblVersus.setFont(new Font("Monospaced", Font.BOLD, 13));
		}
		return lblVersus;
	}
	private JLabel getLblOpponentName() {
		if (lblOpponentName == null) {
			lblOpponentName = new JLabel("Opponent Name");
			lblOpponentName.setFont(new Font("Monospaced", Font.BOLD, 13));
		}
		return lblOpponentName;
	}
	private JButton getBtn_11() {
		if (btn_11 == null) {
			btn_11 = new JButton("");
			btn_11.setName("btn_11");
		}
		return btn_11;
	}
	private JButton getBtn_12() {
		if (btn_12 == null) {
			btn_12 = new JButton("");
			btn_12.setName("btn_12");
		}
		return btn_12;
	}
	private JButton getBtn_13() {
		if (btn_13 == null) {
			btn_13 = new JButton("");
			btn_13.setName("btn_13");
		}
		return btn_13;
	}
	private JButton getBtn_14() {
		if (btn_14 == null) {
			btn_14 = new JButton("");
			btn_14.setName("btn_14");
		}
		return btn_14;
	}
	private JButton getBtn_15() {
		if (btn_15 == null) {
			btn_15 = new JButton("");
			btn_15.setName("btn_15");
		}
		return btn_15;
	}
	private JButton getBtn_16() {
		if (btn_16 == null) {
			btn_16 = new JButton("");
			btn_16.setName("btn_16");
		}
		return btn_16;
	}
	private JButton getBtn_17() {
		if (btn_17 == null) {
			btn_17 = new JButton("");
			btn_17.setName("btn_17");
		}
		return btn_17;
	}
	private JButton getBtn_18() {
		if (btn_18 == null) {
			btn_18 = new JButton("");
			btn_18.setName("btn_18");
		}
		return btn_18;
	}
	private JButton getBtn_21() {
		if (btn_21 == null) {
			btn_21 = new JButton("");
			btn_21.setName("btn_21");
		}
		return btn_21;
	}
	private JButton getBtn_22() {
		if (btn_22 == null) {
			btn_22 = new JButton("");
			btn_22.setName("btn_22");
		}
		return btn_22;
	}
	private JButton getBtn_23() {
		if (btn_23 == null) {
			btn_23 = new JButton("");
			btn_23.setName("btn_23");
		}
		return btn_23;
	}
	private JButton getBtn_24() {
		if (btn_24 == null) {
			btn_24 = new JButton("");
			btn_24.setName("btn_24");
		}
		return btn_24;
	}
	private JButton getBtn_25() {
		if (btn_25 == null) {
			btn_25 = new JButton("");
			btn_25.setName("btn_25");
		}
		return btn_25;
	}
	private JButton getBtn_26() {
		if (btn_26 == null) {
			btn_26 = new JButton("");
			btn_26.setName("btn_26");
		}
		return btn_26;
	}
	private JButton getBtn_27() {
		if (btn_27 == null) {
			btn_27 = new JButton("");
			btn_27.setName("btn_27");
		}
		return btn_27;
	}
	private JButton getBtn_28() {
		if (btn_28 == null) {
			btn_28 = new JButton("");
			btn_28.setName("btn_28");
		}
		return btn_28;
	}
	private JButton getBtn_31() {
		if (btn_31 == null) {
			btn_31 = new JButton("");
			btn_31.setName("btn_31");
		}
		return btn_31;
	}
	private JButton getBtn_32() {
		if (btn_32 == null) {
			btn_32 = new JButton("");
			btn_32.setName("btn_32");
		}
		return btn_32;
	}
	private JButton getBtn_33() {
		if (btn_33 == null) {
			btn_33 = new JButton("");
			btn_33.setName("btn_33");
		}
		return btn_33;
	}
	private JButton getBtn_34() {
		if (btn_34 == null) {
			btn_34 = new JButton("");
			btn_34.setName("btn_34");
		}
		return btn_34;
	}
	private JButton getBtn_35() {
		if (btn_35 == null) {
			btn_35 = new JButton("");
			btn_35.setName("btn_35");
		}
		return btn_35;
	}
	private JButton getBtn_36() {
		if (btn_36 == null) {
			btn_36 = new JButton("");
			btn_36.setName("btn_36");
		}
		return btn_36;
	}
	private JButton getBtn_37() {
		if (btn_37 == null) {
			btn_37 = new JButton("");
			btn_37.setName("btn_37");
		}
		return btn_37;
	}
	private JButton getBtn_38() {
		if (btn_38 == null) {
			btn_38 = new JButton("");
			btn_38.setName("btn_38");
		}
		return btn_38;
	}
	private JButton getBtn_41() {
		if (btn_41 == null) {
			btn_41 = new JButton("");
			btn_41.setName("btn_41");
		}
		return btn_41;
	}
	private JButton getBtn_42() {
		if (btn_42 == null) {
			btn_42 = new JButton("");
			btn_42.setName("btn_42");
		}
		return btn_42;
	}
	private JButton getBtn_43() {
		if (btn_43 == null) {
			btn_43 = new JButton("");
			btn_43.setName("btn_43");
		}
		return btn_43;
	}
	private JButton getBtn_44() {
		if (btn_44 == null) {
			btn_44 = new JButton("");
			btn_44.setName("btn_44");
		}
		return btn_44;
	}
	private JButton getBtn_45() {
		if (btn_45 == null) {
			btn_45 = new JButton("");
			btn_45.setName("btn_45");
		}
		return btn_45;
	}
	private JButton getBtn_46() {
		if (btn_46 == null) {
			btn_46 = new JButton("");
			btn_46.setName("btn_46");
		}
		return btn_46;
	}
	private JButton getBtn_47() {
		if (btn_47 == null) {
			btn_47 = new JButton("");
			btn_47.setName("btn_47");
		}
		return btn_47;
	}
	private JButton getBtn_48() {
		if (btn_48 == null) {
			btn_48 = new JButton("");
			btn_48.setName("btn_48");
		}
		return btn_48;
	}
	private JButton getBtn_51() {
		if (btn_51 == null) {
			btn_51 = new JButton("");
			btn_51.setName("btn_51");
		}
		return btn_51;
	}
	private JButton getBtn_52() {
		if (btn_52 == null) {
			btn_52 = new JButton("");
			btn_52.setName("btn_52");
		}
		return btn_52;
	}
	private JButton getBtn_53() {
		if (btn_53 == null) {
			btn_53 = new JButton("");
			btn_53.setName("btn_53");
		}
		return btn_53;
	}
	private JButton getBtn_54() {
		if (btn_54 == null) {
			btn_54 = new JButton("");
			btn_54.setName("btn_54");
		}
		return btn_54;
	}
	private JButton getBtn_55() {
		if (btn_55 == null) {
			btn_55 = new JButton("");
			btn_55.setName("btn_55");
		}
		return btn_55;
	}
	private JButton getBtn_56() {
		if (btn_56 == null) {
			btn_56 = new JButton("");
			btn_56.setName("btn_56");
		}
		return btn_56;
	}
	private JButton getBtn_57() {
		if (btn_57 == null) {
			btn_57 = new JButton("");
			btn_57.setName("btn_57");
		}
		return btn_57;
	}
	private JButton getBtn_58() {
		if (btn_58 == null) {
			btn_58 = new JButton("");
			btn_58.setName("btn_58");
		}
		return btn_58;
	}
	private JButton getBtn_61() {
		if (btn_61 == null) {
			btn_61 = new JButton("");
			btn_61.setName("btn_61");
		}
		return btn_61;
	}
	private JButton getBtn_62() {
		if (btn_62 == null) {
			btn_62 = new JButton("");
			btn_62.setName("btn_62");
		}
		return btn_62;
	}
	private JButton getBtn_63() {
		if (btn_63 == null) {
			btn_63 = new JButton("");
			btn_63.setName("btn_63");
		}
		return btn_63;
	}
	private JButton getBtn_64() {
		if (btn_64 == null) {
			btn_64 = new JButton("");
			btn_64.setName("btn_64");
		}
		return btn_64;
	}
	private JButton getBtn_65() {
		if (btn_65 == null) {
			btn_65 = new JButton("");
			btn_65.setName("btn_65");
		}
		return btn_65;
	}
	private JButton getBtn_66() {
		if (btn_66 == null) {
			btn_66 = new JButton("");
			btn_66.setName("btn_66");
		}
		return btn_66;
	}
	private JButton getBtn_67() {
		if (btn_67 == null) {
			btn_67 = new JButton("");
			btn_67.setName("btn_67");
		}
		return btn_67;
	}
	private JButton getBtn_68() {
		if (btn_68 == null) {
			btn_68 = new JButton("");
			btn_68.setName("btn_68");
		}
		return btn_68;
	}
	private JButton getBtn_71() {
		if (btn_71 == null) {
			btn_71 = new JButton("");
			btn_71.setName("btn_71");
		}
		return btn_71;
	}
	private JButton getBtn_72() {
		if (btn_72 == null) {
			btn_72 = new JButton("");
			btn_72.setName("btn_72");
		}
		return btn_72;
	}
	private JButton getBtn_73() {
		if (btn_73 == null) {
			btn_73 = new JButton("");
			btn_73.setName("btn_73");
		}
		return btn_73;
	}
	private JButton getBtn_74() {
		if (btn_74 == null) {
			btn_74 = new JButton("");
			btn_74.setName("btn_74");
		}
		return btn_74;
	}
	private JButton getBtn_75() {
		if (btn_75 == null) {
			btn_75 = new JButton("");
			btn_75.setName("btn_75");
		}
		return btn_75;
	}
	private JButton getBtn_76() {
		if (btn_76 == null) {
			btn_76 = new JButton("");
			btn_76.setName("btn_76");
		}
		return btn_76;
	}
	private JButton getBtn_77() {
		if (btn_77 == null) {
			btn_77 = new JButton("");
			btn_77.setName("btn_77");
		}
		return btn_77;
	}
	private JButton getBtn_78() {
		if (btn_78 == null) {
			btn_78 = new JButton("");
			btn_78.setName("btn_78");
		}
		return btn_78;
	}
	private JButton getBtn_81() {
		if (btn_81 == null) {
			btn_81 = new JButton("");
			btn_81.setName("btn_81");
		}
		return btn_81;
	}
	private JButton getBtn_82() {
		if (btn_82 == null) {
			btn_82 = new JButton("");
			btn_82.setName("btn_82");
		}
		return btn_82;
	}
	private JButton getBtn_83() {
		if (btn_83 == null) {
			btn_83 = new JButton("");
			btn_83.setName("btn_83");
		}
		return btn_83;
	}
	private JButton getBtn_84() {
		if (btn_84 == null) {
			btn_84 = new JButton("");
			btn_84.setName("btn_84");
		}
		return btn_84;
	}
	private JButton getBtn_85() {
		if (btn_85 == null) {
			btn_85 = new JButton("");
			btn_85.setName("btn_85");
		}
		return btn_85;
	}
	private JButton getBtn_86() {
		if (btn_86 == null) {
			btn_86 = new JButton("");
			btn_86.setName("btn_86");
		}
		return btn_86;
	}
	private JButton getBtn_87() {
		if (btn_87 == null) {
			btn_87 = new JButton("");
			btn_87.setName("btn_87");
		}
		return btn_87;
	}
	private JButton getBtn_88() {
		if (btn_88 == null) {
			btn_88 = new JButton("");
			btn_88.setName("btn_88");
		}
		return btn_88;
	}
	private JLabel getLblLogo() {
		if (lblLogo == null) {
			lblLogo = new JLabel("");
			lblLogo.setHorizontalAlignment(SwingConstants.RIGHT);
			lblLogo.setIcon(new ImageIcon(PlayerGUI.class.getResource("/resources/logo.png")));
		}
		return lblLogo;
	}
	private JLabel getLblIcon() {
		if (lblIcon == null) {
			lblIcon = new JLabel("");
		}
		return lblIcon;
	}
	
	static void setNextShipButtonEnable(boolean isEnabled) {
		btnPlaceShip.setEnabled(isEnabled);		
	}
}
