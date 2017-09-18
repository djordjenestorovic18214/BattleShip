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
import java.io.IOException;
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
	private LinkedList<JButton> enemyTerritory = new LinkedList<JButton>();
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
	static JLabel lblOpponentName;
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
	private JButton btn19;
	private JButton btn29;
	private JButton btn39;
	private JButton btn49;
	private JButton btn59;
	private JButton btn69;
	private JButton btn79;
	private JButton btn89;
	private JButton btn91;
	private JButton btn92;
	private JButton btn93;
	private JButton btn94;
	private JButton btn95;
	private JButton btn96;
	private JButton btn97;
	private JButton btn98;
	private JButton btn99;
	private JButton btn00;
	private JButton btn01;
	private JButton btn02;
	private JButton btn03;
	private JButton btn04;
	private JButton btn05;
	private JButton btn06;
	private JButton btn07;
	private JButton btn08;
	private JButton btn09;
	private JButton btn10;
	private JButton btn20;
	private JButton btn30;
	private JButton btn40;
	private JButton btn50;
	private JButton btn60;
	private JButton btn70;
	private JButton btn80;
	private JButton btn90;
	private JButton btn_00;
	private JButton btn_01;
	private JButton btn_02;
	private JButton btn_03;
	private JButton btn_04;
	private JButton btn_05;
	private JButton btn_06;
	private JButton btn_07;
	private JButton btn_08;
	private JButton btn_09;
	private JButton btn_10;
	private JButton btn_20;
	private JButton btn_30;
	private JButton btn_40;
	private JButton btn_50;
	private JButton btn_60;
	private JButton btn_70;
	private JButton btn_80;
	private JButton btn_90;
	private JButton btn_91;
	private JButton btn_92;
	private JButton btn_93;
	private JButton btn_94;
	private JButton btn_95;
	private JButton btn_96;
	private JButton btn_97;
	private JButton btn_98;
	private JButton btn_19;
	private JButton btn_29;
	private JButton btn_39;
	private JButton btn_49;
	private JButton btn_59;
	private JButton btn_69;
	private JButton btn_79;
	private JButton btn_89;
	private JButton btn_99;

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
		setBounds(100, 100, 890, 465);
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
		populateListOfEnemyButtons();
		GUIControler.populateArrayOfPositions(playerTerritory);
		GUIControler.populateArrayOfEnemyPositions(enemyTerritory);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIControler.closeApp();
			}
		});
	}
	private void populateListOfButtons() {
		playerTerritory.add(btn00);
		playerTerritory.add(btn01);
		playerTerritory.add(btn02);
		playerTerritory.add(btn03);
		playerTerritory.add(btn04);
		playerTerritory.add(btn05);
		playerTerritory.add(btn06);
		playerTerritory.add(btn07);
		playerTerritory.add(btn08);
		playerTerritory.add(btn09);
		playerTerritory.add(btn10);
		playerTerritory.add(btn11);
		playerTerritory.add(btn12);
		playerTerritory.add(btn13);
		playerTerritory.add(btn14);
		playerTerritory.add(btn15);
		playerTerritory.add(btn16);
		playerTerritory.add(btn17);
		playerTerritory.add(btn18);
		playerTerritory.add(btn19);
		playerTerritory.add(btn20);
		playerTerritory.add(btn21);
		playerTerritory.add(btn22);
		playerTerritory.add(btn23);
		playerTerritory.add(btn24);
		playerTerritory.add(btn25);
		playerTerritory.add(btn26);
		playerTerritory.add(btn27);
		playerTerritory.add(btn28);
		playerTerritory.add(btn29);
		playerTerritory.add(btn30);
		playerTerritory.add(btn31);
		playerTerritory.add(btn32);
		playerTerritory.add(btn33);
		playerTerritory.add(btn34);
		playerTerritory.add(btn35);
		playerTerritory.add(btn36);
		playerTerritory.add(btn37);
		playerTerritory.add(btn38);
		playerTerritory.add(btn39);
		playerTerritory.add(btn40);
		playerTerritory.add(btn41);
		playerTerritory.add(btn42);
		playerTerritory.add(btn43);
		playerTerritory.add(btn44);
		playerTerritory.add(btn45);
		playerTerritory.add(btn46);
		playerTerritory.add(btn47);
		playerTerritory.add(btn48);
		playerTerritory.add(btn49);
		playerTerritory.add(btn50);
		playerTerritory.add(btn51);
		playerTerritory.add(btn52);
		playerTerritory.add(btn53);
		playerTerritory.add(btn54);
		playerTerritory.add(btn55);
		playerTerritory.add(btn56);
		playerTerritory.add(btn57);
		playerTerritory.add(btn58);
		playerTerritory.add(btn59);
		playerTerritory.add(btn60);
		playerTerritory.add(btn61);
		playerTerritory.add(btn62);
		playerTerritory.add(btn63);
		playerTerritory.add(btn64);
		playerTerritory.add(btn65);
		playerTerritory.add(btn66);
		playerTerritory.add(btn67);
		playerTerritory.add(btn68);
		playerTerritory.add(btn69);
		playerTerritory.add(btn70);
		playerTerritory.add(btn71);
		playerTerritory.add(btn72);
		playerTerritory.add(btn73);
		playerTerritory.add(btn74);
		playerTerritory.add(btn75);
		playerTerritory.add(btn76);
		playerTerritory.add(btn77);
		playerTerritory.add(btn78);
		playerTerritory.add(btn78);
		playerTerritory.add(btn79);
		playerTerritory.add(btn80);
		playerTerritory.add(btn81);
		playerTerritory.add(btn82);
		playerTerritory.add(btn83);
		playerTerritory.add(btn84);
		playerTerritory.add(btn85);
		playerTerritory.add(btn86);
		playerTerritory.add(btn87);
		playerTerritory.add(btn88);
		playerTerritory.add(btn89);
		playerTerritory.add(btn90);
		playerTerritory.add(btn91);
		playerTerritory.add(btn92);
		playerTerritory.add(btn93);
		playerTerritory.add(btn94);
		playerTerritory.add(btn95);
		playerTerritory.add(btn96);
		playerTerritory.add(btn97);
		playerTerritory.add(btn98);
		playerTerritory.add(btn99);
	}
	
	private void populateListOfEnemyButtons() {
		enemyTerritory.add(btn_00);
		enemyTerritory.add(btn_01);
		enemyTerritory.add(btn_02);
		enemyTerritory.add(btn_03);
		enemyTerritory.add(btn_04);
		enemyTerritory.add(btn_05);
		enemyTerritory.add(btn_06);
		enemyTerritory.add(btn_07);
		enemyTerritory.add(btn_08);
		enemyTerritory.add(btn_09);
		enemyTerritory.add(btn_10);
		enemyTerritory.add(btn_11);
		enemyTerritory.add(btn_12);
		enemyTerritory.add(btn_13);
		enemyTerritory.add(btn_14);
		enemyTerritory.add(btn_15);
		enemyTerritory.add(btn_16);
		enemyTerritory.add(btn_17);
		enemyTerritory.add(btn_18);
		enemyTerritory.add(btn_19);
		enemyTerritory.add(btn_20);
		enemyTerritory.add(btn_21);
		enemyTerritory.add(btn_22);
		enemyTerritory.add(btn_23);
		enemyTerritory.add(btn_24);
		enemyTerritory.add(btn_25);
		enemyTerritory.add(btn_26);
		enemyTerritory.add(btn_27);
		enemyTerritory.add(btn_28);
		enemyTerritory.add(btn_29);
		enemyTerritory.add(btn_30);
		enemyTerritory.add(btn_31);
		enemyTerritory.add(btn_32);
		enemyTerritory.add(btn_33);
		enemyTerritory.add(btn_34);
		enemyTerritory.add(btn_35);
		enemyTerritory.add(btn_36);
		enemyTerritory.add(btn_37);
		enemyTerritory.add(btn_38);
		enemyTerritory.add(btn_39);
		enemyTerritory.add(btn_40);
		enemyTerritory.add(btn_41);
		enemyTerritory.add(btn_42);
		enemyTerritory.add(btn_43);
		enemyTerritory.add(btn_44);
		enemyTerritory.add(btn_45);
		enemyTerritory.add(btn_46);
		enemyTerritory.add(btn_47);
		enemyTerritory.add(btn_48);
		enemyTerritory.add(btn_49);
		enemyTerritory.add(btn_50);
		enemyTerritory.add(btn_51);
		enemyTerritory.add(btn_52);
		enemyTerritory.add(btn_53);
		enemyTerritory.add(btn_54);
		enemyTerritory.add(btn_55);
		enemyTerritory.add(btn_56);
		enemyTerritory.add(btn_57);
		enemyTerritory.add(btn_58);
		enemyTerritory.add(btn_59);
		enemyTerritory.add(btn_60);
		enemyTerritory.add(btn_61);
		enemyTerritory.add(btn_62);
		enemyTerritory.add(btn_63);
		enemyTerritory.add(btn_64);
		enemyTerritory.add(btn_65);
		enemyTerritory.add(btn_66);
		enemyTerritory.add(btn_67);
		enemyTerritory.add(btn_68);
		enemyTerritory.add(btn_69);
		enemyTerritory.add(btn_70);
		enemyTerritory.add(btn_71);
		enemyTerritory.add(btn_72);
		enemyTerritory.add(btn_73);
		enemyTerritory.add(btn_74);
		enemyTerritory.add(btn_75);
		enemyTerritory.add(btn_76);
		enemyTerritory.add(btn_77);
		enemyTerritory.add(btn_78);
		enemyTerritory.add(btn_79);
		enemyTerritory.add(btn_80);
		enemyTerritory.add(btn_81);
		enemyTerritory.add(btn_82);
		enemyTerritory.add(btn_83);
		enemyTerritory.add(btn_84);
		enemyTerritory.add(btn_85);
		enemyTerritory.add(btn_86);
		enemyTerritory.add(btn_87);
		enemyTerritory.add(btn_88);
		enemyTerritory.add(btn_89);
		enemyTerritory.add(btn_90);
		enemyTerritory.add(btn_91);
		enemyTerritory.add(btn_92);
		enemyTerritory.add(btn_93);
		enemyTerritory.add(btn_94);
		enemyTerritory.add(btn_95);
		enemyTerritory.add(btn_96);
		enemyTerritory.add(btn_97);
		enemyTerritory.add(btn_98);
		enemyTerritory.add(btn_99);
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
			panelCentar.setLayout(new MigLayout("gap -3px -3px", "[][][][][][][][][][][130px:n][][][][][][][][][][]", "[][][][][][][][][][][]"));
			panelCentar.add(getBtn00(), "cell 0 0");
			panelCentar.add(getBtn01(), "cell 1 0");
			panelCentar.add(getBtn02(), "cell 2 0");
			panelCentar.add(getBtn03(), "cell 3 0");
			panelCentar.add(getBtn04(), "cell 4 0");
			panelCentar.add(getBtn05(), "cell 5 0");
			panelCentar.add(getBtn06(), "cell 6 0");
			panelCentar.add(getBtn07(), "cell 7 0");
			panelCentar.add(getBtn08(), "cell 8 0");
			panelCentar.add(getBtn09(), "cell 9 0");
			panelCentar.add(getBtn_00(), "cell 11 0");
			panelCentar.add(getBtn_01(), "cell 12 0");
			panelCentar.add(getBtn_02(), "cell 13 0");
			panelCentar.add(getBtn_03(), "cell 14 0");
			panelCentar.add(getBtn_04(), "cell 15 0");
			panelCentar.add(getBtn_05(), "cell 16 0");
			panelCentar.add(getBtn_06(), "cell 17 0");
			panelCentar.add(getBtn_07(), "cell 18 0");
			panelCentar.add(getBtn_08(), "cell 19 0");
			panelCentar.add(getBtn_09(), "cell 20 0");
			panelCentar.add(getBtn10(), "cell 0 1");
			//panelCentar.setBackground(new Color(15, 94, 156));
			panelCentar.add(getBtn11(), "cell 1 1,grow");
			panelCentar.add(getBtn12(), "cell 2 1");
			panelCentar.add(getBtn13(), "cell 3 1");
			panelCentar.add(getBtn14(), "cell 4 1");
			panelCentar.add(getBtn15(), "cell 5 1");
			panelCentar.add(getBtn16(), "cell 6 1");
			panelCentar.add(getBtn17(), "cell 7 1");
			panelCentar.add(getBtn18(), "cell 8 1");
			panelCentar.add(getBtn19(), "cell 9 1");
			panelCentar.add(getBtn_10(), "cell 11 1");
			panelCentar.add(getBtn_11(), "cell 12 1,grow");
			panelCentar.add(getBtn_12(), "cell 13 1,grow");
			panelCentar.add(getBtn_13(), "cell 14 1,grow");
			panelCentar.add(getBtn_14(), "cell 15 1,grow");
			panelCentar.add(getBtn_15(), "cell 16 1,grow");
			panelCentar.add(getBtn_16(), "cell 17 1,grow");
			panelCentar.add(getBtn_17(), "cell 18 1,grow");
			panelCentar.add(getBtn_18(), "cell 19 1,grow");
			panelCentar.add(getBtn_19(), "cell 20 1");
			panelCentar.add(getBtn20(), "cell 0 2");
			panelCentar.add(getBtn21(), "cell 1 2");
			panelCentar.add(getBtn22(), "cell 2 2");
			panelCentar.add(getBtn23(), "cell 3 2");
			panelCentar.add(getBtn24(), "cell 4 2");
			panelCentar.add(getBtn25(), "cell 5 2");
			panelCentar.add(getBtn26(), "cell 6 2");
			panelCentar.add(getBtn27(), "cell 7 2");
			panelCentar.add(getBtn28(), "cell 8 2");
			panelCentar.add(getBtn29(), "cell 9 2");
			panelCentar.add(getLblPlayerName(), "cell 10 2,alignx center");
			panelCentar.add(getBtn_20(), "cell 11 2");
			panelCentar.add(getBtn_21(), "cell 12 2,grow");
			panelCentar.add(getBtn_22(), "cell 13 2,grow");
			panelCentar.add(getBtn_23(), "cell 14 2,grow");
			panelCentar.add(getBtn_24(), "cell 15 2,grow");
			panelCentar.add(getBtn_25(), "cell 16 2,grow");
			panelCentar.add(getBtn_26(), "cell 17 2,grow");
			panelCentar.add(getBtn_27(), "cell 18 2,grow");
			panelCentar.add(getBtn_28(), "cell 19 2,grow");
			panelCentar.add(getBtn_29(), "cell 20 2");
			panelCentar.add(getBtn30(), "cell 0 3");
			panelCentar.add(getBtn31(), "cell 1 3");
			panelCentar.add(getBtn32(), "cell 2 3");
			panelCentar.add(getBtn33(), "cell 3 3");
			panelCentar.add(getBtn34(), "cell 4 3");
			panelCentar.add(getBtn35(), "cell 5 3");
			panelCentar.add(getBtn36(), "cell 6 3");
			panelCentar.add(getBtn37(), "cell 7 3");
			panelCentar.add(getBtn38(), "cell 8 3");
			panelCentar.add(getBtn39(), "cell 9 3");
			panelCentar.add(getLblVersus(), "cell 10 3,alignx center");
			panelCentar.add(getBtn_30(), "cell 11 3");
			panelCentar.add(getBtn_31(), "cell 12 3,grow");
			panelCentar.add(getBtn_32(), "cell 13 3,grow");
			panelCentar.add(getBtn_33(), "cell 14 3,grow");
			panelCentar.add(getBtn_34(), "cell 15 3,grow");
			panelCentar.add(getBtn_35(), "cell 16 3,grow");
			panelCentar.add(getBtn_36(), "cell 17 3,grow");
			panelCentar.add(getBtn_37(), "cell 18 3,grow");
			panelCentar.add(getBtn_38(), "cell 19 3,grow");
			panelCentar.add(getBtn_39(), "cell 20 3");
			panelCentar.add(getBtn40(), "cell 0 4");
			panelCentar.add(getBtn41(), "cell 1 4");
			panelCentar.add(getBtn42(), "cell 2 4");
			panelCentar.add(getBtn43(), "cell 3 4");
			panelCentar.add(getBtn44(), "cell 4 4");
			panelCentar.add(getBtn45(), "cell 5 4");
			panelCentar.add(getBtn46(), "cell 6 4");
			panelCentar.add(getBtn47(), "cell 7 4");
			panelCentar.add(getBtn48(), "cell 8 4");
			panelCentar.add(getBtn49(), "cell 9 4");
			panelCentar.add(getLblOpponentName(), "cell 10 4,alignx center,aligny center");
			panelCentar.add(getBtn_40(), "cell 11 4");
			panelCentar.add(getBtn_41(), "cell 12 4,grow");
			panelCentar.add(getBtn_42(), "cell 13 4,grow");
			panelCentar.add(getBtn_43(), "cell 14 4,grow");
			panelCentar.add(getBtn_44(), "cell 15 4,grow");
			panelCentar.add(getBtn_45(), "cell 16 4,grow");
			panelCentar.add(getBtn_46(), "cell 17 4,grow");
			panelCentar.add(getBtn_47(), "cell 18 4,grow");
			panelCentar.add(getBtn_48(), "cell 19 4,grow");
			panelCentar.add(getBtn_49(), "cell 20 4");
			panelCentar.add(getBtn50(), "cell 0 5");
			panelCentar.add(getBtn51(), "cell 1 5");
			panelCentar.add(getBtn52(), "cell 2 5");
			panelCentar.add(getBtn53(), "cell 3 5");
			panelCentar.add(getBtn54(), "cell 4 5");
			panelCentar.add(getBtn55(), "cell 5 5");
			panelCentar.add(getBtn56(), "cell 6 5");
			panelCentar.add(getBtn57(), "cell 7 5");
			panelCentar.add(getBtn58(), "cell 8 5");
			panelCentar.add(getBtn59(), "cell 9 5");
			panelCentar.add(getLblIcon(), "cell 10 5");
			panelCentar.add(getBtn_50(), "cell 11 5");
			panelCentar.add(getBtn_51(), "cell 12 5,grow");
			panelCentar.add(getBtn_52(), "cell 13 5,grow");
			panelCentar.add(getBtn_53(), "cell 14 5,grow");
			panelCentar.add(getBtn_54(), "cell 15 5,grow");
			panelCentar.add(getBtn_55(), "cell 16 5,grow");
			panelCentar.add(getBtn_56(), "cell 17 5,grow");
			panelCentar.add(getBtn_57(), "cell 18 5,grow");
			panelCentar.add(getBtn_58(), "cell 19 5,grow");
			panelCentar.add(getBtn_59(), "cell 20 5");
			panelCentar.add(getBtn60(), "cell 0 6");
			panelCentar.add(getBtn61(), "cell 1 6");
			panelCentar.add(getBtn62(), "cell 2 6");
			panelCentar.add(getBtn63(), "cell 3 6");
			panelCentar.add(getBtn64(), "cell 4 6");
			panelCentar.add(getBtn65(), "cell 5 6");
			panelCentar.add(getBtn66(), "cell 6 6");
			panelCentar.add(getBtn67(), "cell 7 6");
			panelCentar.add(getBtn68(), "cell 8 6");
			panelCentar.add(getBtn69(), "cell 9 6");
			panelCentar.add(getBtn_60(), "cell 11 6");
			panelCentar.add(getBtn_61(), "cell 12 6,grow");
			panelCentar.add(getBtn_62(), "cell 13 6,grow");
			panelCentar.add(getBtn_63(), "cell 14 6,grow");
			panelCentar.add(getBtn_64(), "cell 15 6,grow");
			panelCentar.add(getBtn_65(), "cell 16 6,grow");
			panelCentar.add(getBtn_66(), "cell 17 6,grow");
			panelCentar.add(getBtn_67(), "cell 18 6,grow");
			panelCentar.add(getBtn_68(), "cell 19 6,grow");
			panelCentar.add(getBtn_69(), "cell 20 6");
			panelCentar.add(getBtn70(), "cell 0 7");
			panelCentar.add(getBtn71(), "cell 1 7");
			panelCentar.add(getBtn72(), "cell 2 7");
			panelCentar.add(getBtn73(), "cell 3 7");
			panelCentar.add(getBtn74(), "cell 4 7");
			panelCentar.add(getBtn75(), "cell 5 7");
			panelCentar.add(getBtn76(), "cell 6 7");
			panelCentar.add(getBtn77(), "cell 7 7");
			panelCentar.add(getBtn78(), "cell 8 7");
			panelCentar.add(getBtn79(), "cell 9 7");
			panelCentar.add(getBtn_70(), "cell 11 7");
			panelCentar.add(getBtn_71(), "cell 12 7,grow");
			panelCentar.add(getBtn_72(), "cell 13 7,growy");
			panelCentar.add(getBtn_73(), "cell 14 7,growy");
			panelCentar.add(getBtn_74(), "cell 15 7,growy");
			panelCentar.add(getBtn_75(), "cell 16 7,growy");
			panelCentar.add(getBtn_76(), "cell 17 7,grow");
			panelCentar.add(getBtn_77(), "cell 18 7,growy");
			panelCentar.add(getBtn_78(), "cell 19 7,growy");
			panelCentar.add(getBtn_79(), "cell 20 7");
			panelCentar.add(getBtn80(), "cell 0 8");
			panelCentar.add(getBtn81(), "cell 1 8");
			panelCentar.add(getBtn82(), "cell 2 8");
			panelCentar.add(getBtn83(), "cell 3 8");
			panelCentar.add(getBtn84(), "cell 4 8");
			panelCentar.add(getBtn85(), "cell 5 8");
			panelCentar.add(getBtn86(), "cell 6 8");
			panelCentar.add(getBtn87(), "cell 7 8");
			panelCentar.add(getBtn88(), "cell 8 8");
			panelCentar.add(getBtn89(), "cell 9 8");
			panelCentar.add(getBtn_80(), "cell 11 8");
			panelCentar.add(getBtn_81(), "cell 12 8,growy");
			panelCentar.add(getBtn_82(), "cell 13 8,growy");
			panelCentar.add(getBtn_83(), "cell 14 8,growy");
			panelCentar.add(getBtn_84(), "cell 15 8,growy");
			panelCentar.add(getBtn_85(), "cell 16 8,growy");
			panelCentar.add(getBtn_86(), "cell 17 8,growy");
			panelCentar.add(getBtn_87(), "cell 18 8,growy");
			panelCentar.add(getBtn_88(), "cell 19 8,growy");
			panelCentar.add(getBtn_89(), "cell 20 8");
			panelCentar.add(getBtn90(), "cell 0 9");
			panelCentar.add(getBtn91(), "cell 1 9");
			panelCentar.add(getBtn92(), "cell 2 9");
			panelCentar.add(getBtn93(), "cell 3 9");
			panelCentar.add(getBtn94(), "cell 4 9");
			panelCentar.add(getBtn95(), "cell 5 9");
			panelCentar.add(getBtn96(), "cell 6 9");
			panelCentar.add(getBtn97(), "cell 7 9");
			panelCentar.add(getBtn98(), "cell 8 9");
			panelCentar.add(getBtn99(), "cell 9 9");
			panelCentar.add(getBtn_90(), "cell 11 9");
			panelCentar.add(getBtn_91(), "cell 12 9");
			panelCentar.add(getBtn_92(), "cell 13 9");
			panelCentar.add(getBtn_93(), "cell 14 9");
			panelCentar.add(getBtn_94(), "cell 15 9");
			panelCentar.add(getBtn_95(), "cell 16 9");
			panelCentar.add(getBtn_96(), "cell 17 9");
			panelCentar.add(getBtn_97(), "cell 18 9");
			panelCentar.add(getBtn_98(), "cell 19 9");
			panelCentar.add(getBtn_99(), "cell 20 9");
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
					GUIControler.activateButton(btn11, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn11.setMinimumSize(new Dimension(36, 36));
			btn11.setPreferredSize(new Dimension(36, 36));
			btn11.setName("btn11");
		}
		return btn11;
	}
	private JButton getBtn12() {
		if (btn12 == null) {
			btn12 = new JButton("");
			btn12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn12, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}});
			btn12.setMinimumSize(new Dimension(36, 36));
			btn12.setPreferredSize(new Dimension(36, 36));
			btn12.setName("btn12");
		}
		return btn12;
	}
	private JButton getBtn13() {
		if (btn13 == null) {
			btn13 = new JButton("");
			btn13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn13, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn13.setMinimumSize(new Dimension(36, 36));
			btn13.setPreferredSize(new Dimension(36, 36));
			btn13.setName("btn13");
		}
		return btn13;
	}
	private JButton getBtn14() {
		if (btn14 == null) {
			btn14 = new JButton("");
			btn14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn14, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn14.setMinimumSize(new Dimension(36, 36));
			btn14.setPreferredSize(new Dimension(36, 36));
			btn14.setName("btn14");
		}
		return btn14;
	}
	private JButton getBtn15() {
		if (btn15 == null) {
			btn15 = new JButton("");
			btn15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn15, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn15.setMinimumSize(new Dimension(36, 36));
			btn15.setPreferredSize(new Dimension(36, 36));
			btn15.setName("btn15");
		}
		return btn15;
	}
	private JButton getBtn16() {
		if (btn16 == null) {
			btn16 = new JButton("");
			btn16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn16, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn16.setMinimumSize(new Dimension(36, 36));
			btn16.setPreferredSize(new Dimension(36, 36));
			btn16.setName("btn16");
		}
		return btn16;
	}
	private JButton getBtn17() {
		if (btn17 == null) {
			btn17 = new JButton("");
			btn17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn17, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn17.setMinimumSize(new Dimension(36, 36));
			btn17.setPreferredSize(new Dimension(36, 36));
			btn17.setName("btn17");
		}
		return btn17;
	}
	private JButton getBtn18() {
		if (btn18 == null) {
			btn18 = new JButton("");
			btn18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn18, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn18.setMinimumSize(new Dimension(36, 36));
			btn18.setPreferredSize(new Dimension(36, 36));
			btn18.setName("btn18");
		}
		return btn18;
	}
	private JButton getBtn21() {
		if (btn21 == null) {
			btn21 = new JButton("");
			btn21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn21, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn21.setMinimumSize(new Dimension(36, 36));
			btn21.setPreferredSize(new Dimension(36, 36));
			btn21.setName("btn21");
		}
		return btn21;
	}
	private JButton getBtn22() {
		if (btn22 == null) {
			btn22 = new JButton("");
			btn22.setBorder(null);
			btn22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn22, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn22.setMinimumSize(new Dimension(36, 36));
			btn22.setPreferredSize(new Dimension(36, 36));
			btn22.setName("btn22");
		}
		return btn22;
	}
	private JButton getBtn23() {
		if (btn23 == null) {
			btn23 = new JButton("");
			btn23.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn23, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn23.setMinimumSize(new Dimension(36, 36));
			btn23.setPreferredSize(new Dimension(36, 36));
			btn23.setName("btn23");
		}
		return btn23;
	}
	private JButton getBtn31() {
		if (btn31 == null) {
			btn31 = new JButton("");
			btn31.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn31, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn31.setMinimumSize(new Dimension(36, 36));
			btn31.setPreferredSize(new Dimension(36, 36));
			btn31.setName("btn31");
		}
		return btn31;
	}
	private JButton getBtn41() {
		if (btn41 == null) {
			btn41 = new JButton("");
			btn41.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn41, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn41.setMinimumSize(new Dimension(36, 36));
			btn41.setPreferredSize(new Dimension(36, 36));
			btn41.setName("btn41");
		}
		return btn41;
	}
	private JButton getBtn32() {
		if (btn32 == null) {
			btn32 = new JButton("");
			btn32.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn32, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn32.setMinimumSize(new Dimension(36, 36));
			btn32.setPreferredSize(new Dimension(36, 36));
			btn32.setName("btn32");
		}
		return btn32;
	}
	private JButton getBtn42() {
		if (btn42 == null) {
			btn42 = new JButton("");
			btn42.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn42, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn42.setMinimumSize(new Dimension(36, 36));
			btn42.setPreferredSize(new Dimension(36, 36));
			btn42.setName("btn42");
		}
		return btn42;
	}
	private JButton getBtn24() {
		if (btn24 == null) {
			btn24 = new JButton("");
			btn24.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn24, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn24.setMinimumSize(new Dimension(36, 36));
			btn24.setPreferredSize(new Dimension(36, 36));
			btn24.setName("btn24");
		}
		return btn24;
	}
	private JButton getBtn75() {
		if (btn75 == null) {
			btn75 = new JButton("");
			btn75.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn75, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn75.setMinimumSize(new Dimension(36, 36));
			btn75.setPreferredSize(new Dimension(36, 36));
			btn75.setName("btn75");
		}
		return btn75;
	}
	private JButton getBtn87() {
		if (btn87 == null) {
			btn87 = new JButton("");
			btn87.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn87, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn87.setMinimumSize(new Dimension(36, 36));
			btn87.setPreferredSize(new Dimension(36, 36));
			btn87.setName("btn87");
		}
		return btn87;
	}
	private JButton getBtn78() {
		if (btn78 == null) {
			btn78 = new JButton("");
			btn78.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn78, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn78.setMinimumSize(new Dimension(36, 36));
			btn78.setPreferredSize(new Dimension(36, 36));
			btn78.setName("btn78");
		}
		return btn78;
	}
	private JButton getBtn66() {
		if (btn66 == null) {
			btn66 = new JButton("");
			btn66.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn66, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn66.setMinimumSize(new Dimension(36, 36));
			btn66.setPreferredSize(new Dimension(36, 36));
			btn66.setName("btn66");
		}
		return btn66;
	}
	private JButton getBtn64() {
		if (btn64 == null) {
			btn64 = new JButton("");
			btn64.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn64, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn64.setMinimumSize(new Dimension(36, 36));
			btn64.setPreferredSize(new Dimension(36, 36));
			btn64.setName("btn64");
		}
		return btn64;
	}
	private JButton getBtn81() {
		if (btn81 == null) {
			btn81 = new JButton("");
			btn81.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn81, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn81.setMinimumSize(new Dimension(36, 36));
			btn81.setPreferredSize(new Dimension(36, 36));
			btn81.setName("btn81");
		}
		return btn81;
	}
	private JButton getBtn71() {
		if (btn71 == null) {
			btn71 = new JButton("");
			btn71.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn71, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn71.setMinimumSize(new Dimension(36, 36));
			btn71.setPreferredSize(new Dimension(36, 36));
			btn71.setName("btn71");
		}
		return btn71;
	}
	private JButton getBtn51() {
		if (btn51 == null) {
			btn51 = new JButton("");
			btn51.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn51, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn51.setMinimumSize(new Dimension(36, 36));
			btn51.setPreferredSize(new Dimension(36, 36));
			btn51.setName("btn51");
		}
		return btn51;
	}
	private JButton getBtn61() {
		if (btn61 == null) {
			btn61 = new JButton("");
			btn61.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn61, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn61.setMinimumSize(new Dimension(36, 36));
			btn61.setPreferredSize(new Dimension(36, 36));
			btn61.setName("btn61");
		}
		return btn61;
	}
	private JButton getBtn28() {
		if (btn28 == null) {
			btn28 = new JButton("");
			btn28.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn28, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn28.setMinimumSize(new Dimension(36, 36));
			btn28.setPreferredSize(new Dimension(36, 36));
			btn28.setName("btn28");
		}
		return btn28;
	}
	private JButton getBtn27() {
		if (btn27 == null) {
			btn27 = new JButton("");
			btn27.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn27, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn27.setMinimumSize(new Dimension(36, 36));
			btn27.setPreferredSize(new Dimension(36, 36));
			btn27.setName("btn27");
		}
		return btn27;
	}
	private JButton getBtn26() {
		if (btn26 == null) {
			btn26 = new JButton("");
			btn26.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn26, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn26.setMinimumSize(new Dimension(36, 36));
			btn26.setPreferredSize(new Dimension(36, 36));
			btn26.setName("btn26");
		}
		return btn26;
	}
	private JButton getBtn25() {
		if (btn25 == null) {
			btn25 = new JButton("");
			btn25.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn25, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn25.setMinimumSize(new Dimension(36, 36));
			btn25.setPreferredSize(new Dimension(36, 36));
			btn25.setName("btn25");
		}
		return btn25;
	}
	private JButton getBtn33() {
		if (btn33 == null) {
			btn33 = new JButton("");
			btn33.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn33, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn33.setMinimumSize(new Dimension(36, 36));
			btn33.setPreferredSize(new Dimension(36, 36));
			btn33.setName("btn33");
		}
		return btn33;
	}
	private JButton getBtn52() {
		if (btn52 == null) {
			btn52 = new JButton("");
			btn52.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn52, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn52.setMinimumSize(new Dimension(36, 36));
			btn52.setPreferredSize(new Dimension(36, 36));
			btn52.setName("btn52");
		}
		return btn52;
	}
	private JButton getBtn62() {
		if (btn62 == null) {
			btn62 = new JButton("");
			btn62.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn62, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn62.setMinimumSize(new Dimension(36, 36));
			btn62.setPreferredSize(new Dimension(36, 36));
			btn62.setName("btn62");
		}
		return btn62;
	}
	private JButton getBtn72() {
		if (btn72 == null) {
			btn72 = new JButton("");
			btn72.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn72, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn72.setMinimumSize(new Dimension(36, 36));
			btn72.setPreferredSize(new Dimension(36, 36));
			btn72.setName("btn72");
		}
		return btn72;
	}
	private JButton getBtn82() {
		if (btn82 == null) {
			btn82 = new JButton("");
			btn82.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn82, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn82.setMinimumSize(new Dimension(36, 36));
			btn82.setPreferredSize(new Dimension(36, 36));
			btn82.setName("btn82");
		}
		return btn82;
	}
	private JButton getBtn83() {
		if (btn83 == null) {
			btn83 = new JButton("");
			btn83.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn83, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn83.setMinimumSize(new Dimension(36, 36));
			btn83.setPreferredSize(new Dimension(36, 36));
			btn83.setName("btn83");
		}
		return btn83;
	}
	private JButton getBtn84() {
		if (btn84 == null) {
			btn84 = new JButton("");
			btn84.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn84, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn84.setMinimumSize(new Dimension(36, 36));
			btn84.setPreferredSize(new Dimension(36, 36));
			btn84.setName("btn84");
		}
		return btn84;
	}
	private JButton getBtn85() {
		if (btn85 == null) {
			btn85 = new JButton("");
			btn85.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn85, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn85.setMinimumSize(new Dimension(36, 36));
			btn85.setPreferredSize(new Dimension(36, 36));
			btn85.setName("btn85");
		}
		return btn85;
	}
	private JButton getBtn86() {
		if (btn86 == null) {
			btn86 = new JButton("");
			btn86.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn86, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn86.setMinimumSize(new Dimension(36, 36));
			btn86.setPreferredSize(new Dimension(36, 36));
			btn86.setName("btn86");
		}
		return btn86;
	}
	private JButton getBtn88() {
		if (btn88 == null) {
			btn88 = new JButton("");
			btn88.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn88, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn88.setMinimumSize(new Dimension(36, 36));
			btn88.setPreferredSize(new Dimension(36, 36));
			btn88.setName("btn88");
		}
		return btn88;
	}
	private JButton getBtn38() {
		if (btn38 == null) {
			btn38 = new JButton("");
			btn38.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn38, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn38.setMinimumSize(new Dimension(36, 36));
			btn38.setPreferredSize(new Dimension(36, 36));
			btn38.setName("btn38");
		}
		return btn38;
	}
	private JButton getBtn37() {
		if (btn37 == null) {
			btn37 = new JButton("");
			btn37.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn37, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn37.setMinimumSize(new Dimension(36, 36));
			btn37.setPreferredSize(new Dimension(36, 36));
			btn37.setName("btn37");
		}
		return btn37;
	}
	private JButton getBtn36() {
		if (btn36 == null) {
			btn36 = new JButton("");
			btn36.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn36, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn36.setMinimumSize(new Dimension(36, 36));
			btn36.setPreferredSize(new Dimension(36, 36));
			btn36.setName("btn36");
		}
		return btn36;
	}
	private JButton getBtn35() {
		if (btn35 == null) {
			btn35 = new JButton("");
			btn35.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn35, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn35.setMinimumSize(new Dimension(36, 36));
			btn35.setPreferredSize(new Dimension(36, 36));
			btn35.setName("btn35");
		}
		return btn35;
	}
	private JButton getBtn34() {
		if (btn34 == null) {
			btn34 = new JButton("");
			btn34.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn34, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn34.setMinimumSize(new Dimension(36, 36));
			btn34.setPreferredSize(new Dimension(36, 36));
			btn34.setName("btn34");
		}
		return btn34;
	}
	private JButton getBtn43() {
		if (btn43 == null) {
			btn43 = new JButton("");
			btn43.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn43, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn43.setMinimumSize(new Dimension(36, 36));
			btn43.setPreferredSize(new Dimension(36, 36));
			btn43.setName("btn43");
		}
		return btn43;
	}
	private JButton getBtn53() {
		if (btn53 == null) {
			btn53 = new JButton("");
			btn53.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn53, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn53.setMinimumSize(new Dimension(36, 36));
			btn53.setPreferredSize(new Dimension(36, 36));
			btn53.setName("btn53");
		}
		return btn53;
	}
	private JButton getBtn63() {
		if (btn63 == null) {
			btn63 = new JButton("");
			btn63.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn63, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn63.setMinimumSize(new Dimension(36, 36));
			btn63.setPreferredSize(new Dimension(36, 36));
			btn63.setName("btn63");
		}
		return btn63;
	}
	private JButton getBtn73() {
		if (btn73 == null) {
			btn73 = new JButton("");
			btn73.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn73, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn73.setMinimumSize(new Dimension(36, 36));
			btn73.setPreferredSize(new Dimension(36, 36));
			btn73.setName("btn73");
		}
		return btn73;
	}
	private JButton getBtn74() {
		if (btn74 == null) {
			btn74 = new JButton("");
			btn74.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn74, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn74.setMinimumSize(new Dimension(36, 36));
			btn74.setPreferredSize(new Dimension(36, 36));
			btn74.setName("btn74");
		}
		return btn74;
	}
	private JButton getBtn76() {
		if (btn76 == null) {
			btn76 = new JButton("");
			btn76.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn76, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn76.setMinimumSize(new Dimension(36, 36));
			btn76.setPreferredSize(new Dimension(36, 36));
			btn76.setName("btn76");
		}
		return btn76;
	}
	private JButton getBtn77() {
		if (btn77 == null) {
			btn77 = new JButton("");
			btn77.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn77, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn77.setMinimumSize(new Dimension(36, 36));
			btn77.setPreferredSize(new Dimension(36, 36));
			btn77.setName("btn77");
		}
		return btn77;
	}
	private JButton getBtn68() {
		if (btn68 == null) {
			btn68 = new JButton("");
			btn68.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn68, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn68.setMinimumSize(new Dimension(36, 36));
			btn68.setPreferredSize(new Dimension(36, 36));
			btn68.setName("btn68");
		}
		return btn68;
	}
	private JButton getBtn58() {
		if (btn58 == null) {
			btn58 = new JButton("");
			btn58.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn58, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn58.setMinimumSize(new Dimension(36, 36));
			btn58.setPreferredSize(new Dimension(36, 36));
			btn58.setName("btn58");
		}
		return btn58;
	}
	private JButton getBtn48() {
		if (btn48 == null) {
			btn48 = new JButton("");
			btn48.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn48, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn48.setMinimumSize(new Dimension(36, 36));
			btn48.setPreferredSize(new Dimension(36, 36));
			btn48.setName("btn48");
		}
		return btn48;
	}
	private JButton getBtn47() {
		if (btn47 == null) {
			btn47 = new JButton("");
			btn47.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn47, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn47.setMinimumSize(new Dimension(36, 36));
			btn47.setPreferredSize(new Dimension(36, 36));
			btn47.setName("btn47");
		}
		return btn47;
	}
	private JButton getBtn46() {
		if (btn46 == null) {
			btn46 = new JButton("");
			btn46.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn46, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn46.setMinimumSize(new Dimension(36, 36));
			btn46.setPreferredSize(new Dimension(36, 36));
			btn46.setName("btn46");
		}
		return btn46;
	}
	private JButton getBtn45() {
		if (btn45 == null) {
			btn45 = new JButton("");
			btn45.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn45, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn45.setMinimumSize(new Dimension(36, 36));
			btn45.setPreferredSize(new Dimension(36, 36));
			btn45.setName("btn45");
		}
		return btn45;
	}
	private JButton getBtn44() {
		if (btn44 == null) {
			btn44 = new JButton("");
			btn44.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn44, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn44.setMinimumSize(new Dimension(36, 36));
			btn44.setPreferredSize(new Dimension(36, 36));
			btn44.setName("btn44");
		}
		return btn44;
	}
	private JButton getBtn54() {
		if (btn54 == null) {
			btn54 = new JButton("");
			btn54.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn54, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn54.setMinimumSize(new Dimension(36, 36));
			btn54.setPreferredSize(new Dimension(36, 36));
			btn54.setName("btn54");
		}
		return btn54;
	}
	private JButton getBtn55() {
		if (btn55 == null) {
			btn55 = new JButton("");
			btn55.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn55, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn55.setMinimumSize(new Dimension(36, 36));
			btn55.setPreferredSize(new Dimension(36, 36));
			btn55.setName("btn55");
		}
		return btn55;
	}
	private JButton getBtn65() {
		if (btn65 == null) {
			btn65 = new JButton("");
			btn65.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn65, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn65.setMinimumSize(new Dimension(36, 36));
			btn65.setPreferredSize(new Dimension(36, 36));
			btn65.setName("btn65");
		}
		return btn65;
	}
	private JButton getBtn56() {
		if (btn56 == null) {
			btn56 = new JButton("");
			btn56.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn56, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn56.setMinimumSize(new Dimension(36, 36));
			btn56.setPreferredSize(new Dimension(36, 36));
			btn56.setName("btn56");
		}
		return btn56;
	}
	private JButton getBtn57() {
		if (btn57 == null) {
			btn57 = new JButton("");
			btn57.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn57, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn57.setMinimumSize(new Dimension(36, 36));
			btn57.setPreferredSize(new Dimension(36, 36));
			btn57.setName("btn57");
		}
		return btn57;
	}
	private JButton getBtn67() {
		if (btn67 == null) {
			btn67 = new JButton("");
			btn67.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIControler.activateButton(btn67, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn67.setMinimumSize(new Dimension(36, 36));
			btn67.setPreferredSize(new Dimension(36, 36));
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
			cbShipSize.addItem("Choose ship");
			cbShipSize.addItem("Patrol(2)");
			cbShipSize.addItem("Patrol(2)");
			cbShipSize.addItem("Patrol(2)");
			cbShipSize.addItem("Destroyer(3)");
			cbShipSize.addItem("Destroyer(3)");
			cbShipSize.addItem("Battleship(4)");
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
					if(cbShipSize.getItemCount()==1){
						panelEast.setVisible(false);
						lblPlayerName.setText(txtName.getText());
						scrollPane.setSize(200, 70);
						try {
							GUIControler.readyForTheGame();
							GUIControler.notificationMessageWithTimer("Game has started! ",500);
							
							
						   // String oponentName = first.split("_")[1];
							
						  //  lblOpponentName.setText(oponentName);
						    
						if(GUIControler.connect.startsWith("SEC")){
							GUIControler.notificationMessageWithTimer("You play second! Wait !",500);
							GUIControler.waitMove();
						}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else{
						GUIControler.notificationMessageWithTimer("You haven't placed all of your ships!", 2000);
					}
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
			console.setPreferredSize(new Dimension(4, 20));
			console.setMinimumSize(new Dimension(4, 20));
			console.setEditable(false);
			console.setBorder(null);
			console.setRows(100);
			console.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			console.setWrapStyleWord(true);
			console.setLineWrap(true);
		}
		return console;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(400, 70));
			scrollPane.setMinimumSize(new Dimension(400, 70));
			scrollPane.setSize(400, 70);
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
			lblOpponentName = new JLabel("Opponent");
			lblOpponentName.setFont(new Font("Monospaced", Font.BOLD, 13));
		}
		return lblOpponentName;
	}
	private JButton getBtn_11() {
		if (btn_11 == null) {
			btn_11 = new JButton("");
			btn_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_11);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_11.setMinimumSize(new Dimension(36, 36));btn_11.setPreferredSize(new Dimension(36, 36));

			btn_11.setName("btn_11");
		}
		return btn_11;
	}
	private JButton getBtn_12() {
		if (btn_12 == null) {
			btn_12 = new JButton("");
			btn_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_12);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_12.setName("btn_12");
			btn_12.setMinimumSize(new Dimension(36, 36));btn_12.setPreferredSize(new Dimension(36, 36));
		}
		return btn_12;
	}
	private JButton getBtn_13() {
		if (btn_13 == null) {
			btn_13 = new JButton("");
			btn_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_13);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_13.setName("btn_13");
			btn_13.setMinimumSize(new Dimension(36, 36));btn_13.setPreferredSize(new Dimension(36, 36));
		}
		return btn_13;
	}
	private JButton getBtn_14() {
		if (btn_14 == null) {
			btn_14 = new JButton("");
			btn_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_14);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_14.setName("btn_14");
			btn_14.setMinimumSize(new Dimension(36, 36));btn_14.setPreferredSize(new Dimension(36, 36));
		}
		return btn_14;
	}
	private JButton getBtn_15() {
		if (btn_15 == null) {
			btn_15 = new JButton("");
			btn_15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_15);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_15.setName("btn_15");
			btn_15.setMinimumSize(new Dimension(36, 36));btn_15.setPreferredSize(new Dimension(36, 36));
		}
		return btn_15;
	}
	private JButton getBtn_16() {
		if (btn_16 == null) {
			btn_16 = new JButton("");
			btn_16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_16);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_16.setName("btn_16");
			btn_16.setMinimumSize(new Dimension(36, 36));btn_16.setPreferredSize(new Dimension(36, 36));
		}
		return btn_16;
	}
	private JButton getBtn_17() {
		if (btn_17 == null) {
			btn_17 = new JButton("");
			btn_17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_17);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_17.setName("btn_17");
			btn_17.setMinimumSize(new Dimension(36, 36));btn_17.setPreferredSize(new Dimension(36, 36));
		}
		return btn_17;
	}
	private JButton getBtn_18() {
		if (btn_18 == null) {
			btn_18 = new JButton("");
			btn_18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_18);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_18.setName("btn_18");
			btn_18.setMinimumSize(new Dimension(36, 36));btn_18.setPreferredSize(new Dimension(36, 36));
		}
		return btn_18;
	}
	private JButton getBtn_21() {
		if (btn_21 == null) {
			btn_21 = new JButton("");
			btn_21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_21);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_21.setName("btn_21");
			btn_21.setMinimumSize(new Dimension(36, 36));btn_21.setPreferredSize(new Dimension(36, 36));
		}
		return btn_21;
	}
	private JButton getBtn_22() {
		if (btn_22 == null) {
			btn_22 = new JButton("");
			btn_22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_22);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_22.setName("btn_22");
			btn_22.setMinimumSize(new Dimension(36, 36));btn_22.setPreferredSize(new Dimension(36, 36));
		}
		return btn_22;
	}
	private JButton getBtn_23() {
		if (btn_23 == null) {
			btn_23 = new JButton("");
			btn_23.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_23);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_23.setName("btn_23");
			btn_23.setMinimumSize(new Dimension(36, 36));btn_23.setPreferredSize(new Dimension(36, 36));
		}
		return btn_23;
	}
	private JButton getBtn_24() {
		if (btn_24 == null) {
			btn_24 = new JButton("");
			btn_24.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_24);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_24.setName("btn_24");
			btn_24.setMinimumSize(new Dimension(36, 36));btn_24.setPreferredSize(new Dimension(36, 36));
		}
		return btn_24;
	}
	private JButton getBtn_25() {
		if (btn_25 == null) {
			btn_25 = new JButton("");
			btn_25.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_25);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_25.setName("btn_25");
			btn_25.setMinimumSize(new Dimension(36, 36));btn_25.setPreferredSize(new Dimension(36, 36));
		}
		return btn_25;
	}
	private JButton getBtn_26() {
		if (btn_26 == null) {
			btn_26 = new JButton("");
			btn_26.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_26);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_26.setName("btn_26");
			btn_26.setMinimumSize(new Dimension(36, 36));btn_26.setPreferredSize(new Dimension(36, 36));
		}
		return btn_26;
	}
	private JButton getBtn_27() {
		if (btn_27 == null) {
			btn_27 = new JButton("");
			btn_27.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_27);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_27.setName("btn_27");
			btn_27.setMinimumSize(new Dimension(36, 36));btn_27.setPreferredSize(new Dimension(36, 36));
		}
		return btn_27;
	}
	private JButton getBtn_28() {
		if (btn_28 == null) {
			btn_28 = new JButton("");
			btn_28.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_28);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_28.setName("btn_28");
			btn_28.setMinimumSize(new Dimension(36, 36));btn_28.setPreferredSize(new Dimension(36, 36));
		}
		return btn_28;
	}
	private JButton getBtn_31() {
		if (btn_31 == null) {
			btn_31 = new JButton("");
			btn_31.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_31);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_31.setName("btn_31");
			btn_31.setMinimumSize(new Dimension(36, 36));btn_31.setPreferredSize(new Dimension(36, 36));
		}
		return btn_31;
	}
	private JButton getBtn_32() {
		if (btn_32 == null) {
			btn_32 = new JButton("");
			btn_32.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_32);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_32.setName("btn_32");
			btn_32.setMinimumSize(new Dimension(36, 36));btn_32.setPreferredSize(new Dimension(36, 36));
		}
		return btn_32;
	}
	private JButton getBtn_33() {
		if (btn_33 == null) {
			btn_33 = new JButton("");
			btn_33.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_33);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_33.setName("btn_33");
			btn_33.setMinimumSize(new Dimension(36, 36));btn_33.setPreferredSize(new Dimension(36, 36));
		}
		return btn_33;
	}
	private JButton getBtn_34() {
		if (btn_34 == null) {
			btn_34 = new JButton("");
			btn_34.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_34);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_34.setName("btn_34");
			btn_34.setMinimumSize(new Dimension(36, 36));btn_34.setPreferredSize(new Dimension(36, 36));
		}
		return btn_34;
	}
	private JButton getBtn_35() {
		if (btn_35 == null) {
			btn_35 = new JButton("");
			btn_35.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_35);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_35.setName("btn_35");
			btn_35.setMinimumSize(new Dimension(36, 36));btn_35.setPreferredSize(new Dimension(36, 36));
		}
		return btn_35;
	}
	private JButton getBtn_36() {
		if (btn_36 == null) {
			btn_36 = new JButton("");
			btn_36.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_36);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_36.setName("btn_36");
			btn_36.setMinimumSize(new Dimension(36, 36));btn_36.setPreferredSize(new Dimension(36, 36));
		}
		return btn_36;
	}
	private JButton getBtn_37() {
		if (btn_37 == null) {
			btn_37 = new JButton("");
			btn_37.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_37);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_37.setName("btn_37");
			btn_37.setMinimumSize(new Dimension(36, 36));btn_37.setPreferredSize(new Dimension(36, 36));
		}
		return btn_37;
	}
	private JButton getBtn_38() {
		if (btn_38 == null) {
			btn_38 = new JButton("");
			btn_38.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_38);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_38.setName("btn_38");
			btn_38.setMinimumSize(new Dimension(36, 36));btn_38.setPreferredSize(new Dimension(36, 36));
		}
		return btn_38;
	}
	private JButton getBtn_41() {
		if (btn_41 == null) {
			btn_41 = new JButton("");
			btn_41.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_41);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_41.setName("btn_41");
			btn_41.setMinimumSize(new Dimension(36, 36));btn_41.setPreferredSize(new Dimension(36, 36));
		}
		return btn_41;
	}
	private JButton getBtn_42() {
		if (btn_42 == null) {
			btn_42 = new JButton("");
			btn_42.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_42);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_42.setName("btn_42");
			btn_42.setMinimumSize(new Dimension(36, 36));btn_42.setPreferredSize(new Dimension(36, 36));
		}
		return btn_42;
	}
	private JButton getBtn_43() {
		if (btn_43 == null) {
			btn_43 = new JButton("");
			btn_43.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_43);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_43.setName("btn_43");
			btn_43.setMinimumSize(new Dimension(36, 36));btn_43.setPreferredSize(new Dimension(36, 36));
		}
		return btn_43;
	}
	private JButton getBtn_44() {
		if (btn_44 == null) {
			btn_44 = new JButton("");
			btn_44.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_44);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_44.setName("btn_44");
			btn_44.setMinimumSize(new Dimension(36, 36));btn_44.setPreferredSize(new Dimension(36, 36));
		}
		return btn_44;
	}
	private JButton getBtn_45() {
		if (btn_45 == null) {
			btn_45 = new JButton("");
			btn_45.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_45);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_45.setName("btn_45");
			btn_45.setMinimumSize(new Dimension(36, 36));btn_45.setPreferredSize(new Dimension(36, 36));
		}
		return btn_45;
	}
	private JButton getBtn_46() {
		if (btn_46 == null) {
			btn_46 = new JButton("");
			btn_46.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_46);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_46.setName("btn_46");
			btn_46.setMinimumSize(new Dimension(36, 36));btn_46.setPreferredSize(new Dimension(36, 36));
		}
		return btn_46;
	}
	private JButton getBtn_47() {
		if (btn_47 == null) {
			btn_47 = new JButton("");
			btn_47.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_47);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_47.setName("btn_47");
			btn_47.setMinimumSize(new Dimension(36, 36));btn_47.setPreferredSize(new Dimension(36, 36));
		}
		return btn_47;
	}
	private JButton getBtn_48() {
		if (btn_48 == null) {
			btn_48 = new JButton("");
			btn_48.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_48);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_48.setName("btn_48");
			btn_48.setMinimumSize(new Dimension(36, 36));btn_48.setPreferredSize(new Dimension(36, 36));
		}
		return btn_48;
	}
	private JButton getBtn_51() {
		if (btn_51 == null) {
			btn_51 = new JButton("");
			btn_51.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_51);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_51.setName("btn_51");
			btn_51.setMinimumSize(new Dimension(36, 36));btn_51.setPreferredSize(new Dimension(36, 36));
		}
		return btn_51;
	}
	private JButton getBtn_52() {
		if (btn_52 == null) {
			btn_52 = new JButton("");
			btn_52.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_52);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_52.setName("btn_52");
			btn_52.setMinimumSize(new Dimension(36, 36));btn_52.setPreferredSize(new Dimension(36, 36));
		}
		return btn_52;
	}
	private JButton getBtn_53() {
		if (btn_53 == null) {
			btn_53 = new JButton("");
			btn_53.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_53);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_53.setName("btn_53");
			btn_53.setMinimumSize(new Dimension(36, 36));btn_53.setPreferredSize(new Dimension(36, 36));
		}
		return btn_53;
	}
	private JButton getBtn_54() {
		if (btn_54 == null) {
			btn_54 = new JButton("");
			btn_54.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_54);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_54.setName("btn_54");
			btn_54.setMinimumSize(new Dimension(36, 36));btn_54.setPreferredSize(new Dimension(36, 36));
		}
		return btn_54;
	}
	private JButton getBtn_55() {
		if (btn_55 == null) {
			btn_55 = new JButton("");
			btn_55.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_55);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_55.setName("btn_55");
			btn_55.setMinimumSize(new Dimension(36, 36));btn_55.setPreferredSize(new Dimension(36, 36));
		}
		return btn_55;
	}
	private JButton getBtn_56() {
		if (btn_56 == null) {
			btn_56 = new JButton("");
			btn_56.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_56);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_56.setName("btn_56");
			btn_56.setMinimumSize(new Dimension(36, 36));btn_56.setPreferredSize(new Dimension(36, 36));
		}
		return btn_56;
	}
	private JButton getBtn_57() {
		if (btn_57 == null) {
			btn_57 = new JButton("");
			btn_57.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_57);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_57.setName("btn_57");
			btn_57.setMinimumSize(new Dimension(36, 36));btn_57.setPreferredSize(new Dimension(36, 36));
		}
		return btn_57;
	}
	private JButton getBtn_58() {
		if (btn_58 == null) {
			btn_58 = new JButton("");
			btn_58.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_58);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_58.setName("btn_58");
			btn_58.setMinimumSize(new Dimension(36, 36));btn_58.setPreferredSize(new Dimension(36, 36));
		}
		return btn_58;
	}
	private JButton getBtn_61() {
		if (btn_61 == null) {
			btn_61 = new JButton("");
			btn_61.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_61);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_61.setName("btn_61");
			btn_61.setMinimumSize(new Dimension(36, 36));btn_61.setPreferredSize(new Dimension(36, 36));
		}
		return btn_61;
	}
	private JButton getBtn_62() {
		if (btn_62 == null) {
			btn_62 = new JButton("");
			btn_62.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_62);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_62.setName("btn_62");
			btn_62.setMinimumSize(new Dimension(36, 36));btn_62.setPreferredSize(new Dimension(36, 36));
		}
		return btn_62;
	}
	private JButton getBtn_63() {
		if (btn_63 == null) {
			btn_63 = new JButton("");
			btn_63.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_63);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_63.setName("btn_63");
			btn_63.setMinimumSize(new Dimension(36, 36));btn_63.setPreferredSize(new Dimension(36, 36));
		}
		return btn_63;
	}
	private JButton getBtn_64() {
		if (btn_64 == null) {
			btn_64 = new JButton("");
			btn_64.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_64);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_64.setName("btn_64");
			btn_64.setMinimumSize(new Dimension(36, 36));btn_64.setPreferredSize(new Dimension(36, 36));
		}
		return btn_64;
	}
	private JButton getBtn_65() {
		if (btn_65 == null) {
			btn_65 = new JButton("");
			btn_65.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_65);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_65.setName("btn_65");
			btn_65.setMinimumSize(new Dimension(36, 36));btn_65.setPreferredSize(new Dimension(36, 36));
		}
		return btn_65;
	}
	private JButton getBtn_66() {
		if (btn_66 == null) {
			btn_66 = new JButton("");
			btn_66.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_66);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_66.setName("btn_66");
			btn_66.setMinimumSize(new Dimension(36, 36));btn_66.setPreferredSize(new Dimension(36, 36));
		}
		return btn_66;
	}
	private JButton getBtn_67() {
		if (btn_67 == null) {
			btn_67 = new JButton("");
			btn_67.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_67);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_67.setName("btn_67");
			btn_67.setMinimumSize(new Dimension(36, 36));btn_67.setPreferredSize(new Dimension(36, 36));
		}
		return btn_67;
	}
	private JButton getBtn_68() {
		if (btn_68 == null) {
			btn_68 = new JButton("");
			btn_68.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_68);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_68.setName("btn_68");
			btn_68.setMinimumSize(new Dimension(36, 36));btn_68.setPreferredSize(new Dimension(36, 36));
		}
		return btn_68;
	}
	private JButton getBtn_71() {
		if (btn_71 == null) {
			btn_71 = new JButton("");
			btn_71.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_71);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_71.setName("btn_71");
			btn_71.setMinimumSize(new Dimension(36, 36));btn_71.setPreferredSize(new Dimension(36, 36));
		}
		return btn_71;
	}
	private JButton getBtn_72() {
		if (btn_72 == null) {
			btn_72 = new JButton("");
			btn_72.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_72);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_72.setName("btn_72");
			btn_72.setMinimumSize(new Dimension(36, 36));btn_72.setPreferredSize(new Dimension(36, 36));
		}
		return btn_72;
	}
	private JButton getBtn_73() {
		if (btn_73 == null) {
			btn_73 = new JButton("");
			btn_73.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_73);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_73.setName("btn_73");
			btn_73.setMinimumSize(new Dimension(36, 36));btn_73.setPreferredSize(new Dimension(36, 36));
		}
		return btn_73;
	}
	private JButton getBtn_74() {
		if (btn_74 == null) {
			btn_74 = new JButton("");
			btn_74.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_74);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_74.setName("btn_74");
			btn_74.setMinimumSize(new Dimension(36, 36));btn_74.setPreferredSize(new Dimension(36, 36));
		}
		return btn_74;
	}
	private JButton getBtn_75() {
		if (btn_75 == null) {
			btn_75 = new JButton("");
			btn_75.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_75);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_75.setName("btn_75");
			btn_75.setMinimumSize(new Dimension(36, 36));btn_75.setPreferredSize(new Dimension(36, 36));
		}
		return btn_75;
	}
	private JButton getBtn_76() {
		if (btn_76 == null) {
			btn_76 = new JButton("");
			btn_76.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_76);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_76.setName("btn_76");
			btn_76.setMinimumSize(new Dimension(36, 36));btn_76.setPreferredSize(new Dimension(36, 36));
		}
		return btn_76;
	}
	private JButton getBtn_77() {
		if (btn_77 == null) {
			btn_77 = new JButton("");
			btn_77.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_77);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_77.setName("btn_77");
			btn_77.setMinimumSize(new Dimension(36, 36));btn_77.setPreferredSize(new Dimension(36, 36));
		}
		return btn_77;
	}
	private JButton getBtn_78() {
		if (btn_78 == null) {
			btn_78 = new JButton("");
			btn_78.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_78);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_78.setName("btn_78");
			btn_78.setMinimumSize(new Dimension(36, 36));btn_78.setPreferredSize(new Dimension(36, 36));
		}
		return btn_78;
	}
	private JButton getBtn_81() {
		if (btn_81 == null) {
			btn_81 = new JButton("");
			btn_81.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_81);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_81.setName("btn_81");
			btn_81.setMinimumSize(new Dimension(36, 36));btn_81.setPreferredSize(new Dimension(36, 36));
		}
		return btn_81;
	}
	private JButton getBtn_82() {
		if (btn_82 == null) {
			btn_82 = new JButton("");
			btn_82.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_82);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_82.setName("btn_82");
			btn_82.setMinimumSize(new Dimension(36, 36));btn_82.setPreferredSize(new Dimension(36, 36));
		}
		return btn_82;
	}
	private JButton getBtn_83() {
		if (btn_83 == null) {
			btn_83 = new JButton("");
			btn_83.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_83);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_83.setName("btn_83");
			btn_83.setMinimumSize(new Dimension(36, 36));btn_83.setPreferredSize(new Dimension(36, 36));
		}
		return btn_83;
	}
	private JButton getBtn_84() {
		if (btn_84 == null) {
			btn_84 = new JButton("");
			btn_84.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_84);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_84.setName("btn_84");
			btn_84.setMinimumSize(new Dimension(36, 36));btn_84.setPreferredSize(new Dimension(36, 36));
		}
		return btn_84;
	}
	private JButton getBtn_85() {
		if (btn_85 == null) {
			btn_85 = new JButton("");
			btn_85.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_85);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_85.setName("btn_85");
			btn_85.setMinimumSize(new Dimension(36, 36));btn_85.setPreferredSize(new Dimension(36, 36));
		}
		return btn_85;
	}
	private JButton getBtn_86() {
		if (btn_86 == null) {
			btn_86 = new JButton("");
			btn_86.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_86);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_86.setName("btn_86");
			btn_86.setMinimumSize(new Dimension(36, 36));btn_86.setPreferredSize(new Dimension(36, 36));
		}
		return btn_86;
	}
	private JButton getBtn_87() {
		if (btn_87 == null) {
			btn_87 = new JButton("");
			btn_87.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_87);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_87.setName("btn_87");
			btn_87.setMinimumSize(new Dimension(36, 36));btn_87.setPreferredSize(new Dimension(36, 36));
		}
		return btn_87;
	}
	private JButton getBtn_88() {
		if (btn_88 == null) {
			btn_88 = new JButton("");
			btn_88.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_88);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_88.setName("btn_88");
			btn_88.setMinimumSize(new Dimension(36, 36));btn_88.setPreferredSize(new Dimension(36, 36));
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
	private JButton getBtn19() {
		if (btn19 == null) {
			btn19 = new JButton("");
			btn19.setName("btn19");
			btn19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn19, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn19.setMinimumSize(new Dimension(36, 36));
			btn19.setPreferredSize(new Dimension(36, 36));
		}
		return btn19;
	}
	private JButton getBtn29() {
		if (btn29 == null) {
			btn29 = new JButton("");
			btn29.setName("btn29");
			btn29.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn29, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn29.setMinimumSize(new Dimension(36, 36));
			btn29.setPreferredSize(new Dimension(36, 36));
		}
		return btn29;
	}
	private JButton getBtn39() {
		if (btn39 == null) {
			btn39 = new JButton("");
			btn39.setName("btn39");
			btn39.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn39, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn39.setMinimumSize(new Dimension(36, 36));
			btn39.setPreferredSize(new Dimension(36, 36));
		}
		return btn39;
	}
	private JButton getBtn49() {
		if (btn49 == null) {
			btn49 = new JButton("");
			btn49.setName("btn49");
			btn49.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn49, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn49.setMinimumSize(new Dimension(36, 36));
			btn49.setPreferredSize(new Dimension(36, 36));
		}
		return btn49;
	}
	private JButton getBtn59() {
		if (btn59 == null) {
			btn59 = new JButton("");
			btn59.setName("btn59");
			btn59.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn59, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn59.setMinimumSize(new Dimension(36, 36));
			btn59.setPreferredSize(new Dimension(36, 36));
		}
		return btn59;
	}
	private JButton getBtn69() {
		if (btn69 == null) {
			btn69 = new JButton("");
			btn69.setName("btn69");
			btn69.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn69, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn69.setMinimumSize(new Dimension(36, 36));
			btn69.setPreferredSize(new Dimension(36, 36));
		}
		return btn69;
	}
	private JButton getBtn79() {
		if (btn79 == null) {
			btn79 = new JButton("");
			btn79.setName("btn79");
			btn79.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn79, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn79.setMinimumSize(new Dimension(36, 36));
			btn79.setPreferredSize(new Dimension(36, 36));
		}
		return btn79;
	}
	private JButton getBtn89() {
		if (btn89 == null) {
			btn89 = new JButton("");
			btn89.setName("btn89");
			btn89.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn89, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn89.setMinimumSize(new Dimension(36, 36));
			btn89.setPreferredSize(new Dimension(36, 36));
		}
		return btn89;
	}
	private JButton getBtn91() {
		if (btn91 == null) {
			btn91 = new JButton("");
			btn91.setName("btn91");
			btn91.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn91, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn91.setMinimumSize(new Dimension(36, 36));
			btn91.setPreferredSize(new Dimension(36, 36));
		}
		return btn91;
	}
	private JButton getBtn92() {
		if (btn92 == null) {
			btn92 = new JButton("");
			btn92.setName("btn92");
			btn92.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn92, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn92.setMinimumSize(new Dimension(36, 36));
			btn92.setPreferredSize(new Dimension(36, 36));
		}
		return btn92;
	}
	private JButton getBtn93() {
		if (btn93 == null) {
			btn93 = new JButton("");
			btn93.setName("btn93");
			btn93.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn93, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn93.setMinimumSize(new Dimension(36, 36));
			btn93.setPreferredSize(new Dimension(36, 36));
		}
		return btn93;
	}
	private JButton getBtn94() {
		if (btn94 == null) {
			btn94 = new JButton("");
			btn94.setName("btn94");
			btn94.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn94, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn94.setMinimumSize(new Dimension(36, 36));
			btn94.setPreferredSize(new Dimension(36, 36));
		}
		return btn94;
	}
	private JButton getBtn95() {
		if (btn95 == null) {
			btn95 = new JButton("");
			btn95.setName("btn95");
			btn95.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn95, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn95.setMinimumSize(new Dimension(36, 36));
			btn95.setPreferredSize(new Dimension(36, 36));
		}
		return btn95;
	}
	private JButton getBtn96() {
		if (btn96 == null) {
			btn96 = new JButton("");
			btn96.setName("btn96");
			btn96.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn96, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn96.setMinimumSize(new Dimension(36, 36));
			btn96.setPreferredSize(new Dimension(36, 36));
		}
		return btn96;
	}
	private JButton getBtn97() {
		if (btn97 == null) {
			btn97 = new JButton("");
			btn97.setName("btn97");
			btn97.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn97, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn97.setMinimumSize(new Dimension(36, 36));
			btn97.setPreferredSize(new Dimension(36, 36));
		}
		return btn97;
	}
	private JButton getBtn98() {
		if (btn98 == null) {
			btn98 = new JButton("");
			btn98.setName("btn98");
			btn98.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn98, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn98.setMinimumSize(new Dimension(36, 36));
			btn98.setPreferredSize(new Dimension(36, 36));
		}
		return btn98;
	}
	private JButton getBtn99() {
		if (btn99 == null) {
			btn99 = new JButton("");
			btn99.setName("btn99");
			btn99.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn99, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn99.setMinimumSize(new Dimension(36, 36));
			btn99.setPreferredSize(new Dimension(36, 36));
		}
		return btn99;
	}
	private JButton getBtn00() {
		if (btn00 == null) {
			btn00 = new JButton("");
			btn00.setName("btn00");
			btn00.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn00, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn00.setMinimumSize(new Dimension(36, 36));
			btn00.setPreferredSize(new Dimension(36, 36));
		}
		return btn00;
	}
	private JButton getBtn01() {
		if (btn01 == null) {
			btn01 = new JButton("");
			btn01.setName("btn01");
			btn01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn01, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn01.setMinimumSize(new Dimension(36, 36));
			btn01.setPreferredSize(new Dimension(36, 36));
		}
		return btn01;
	}
	private JButton getBtn02() {
		if (btn02 == null) {
			btn02 = new JButton("");
			btn02.setName("btn02");
			btn02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn02, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn02.setMinimumSize(new Dimension(36, 36));
			btn02.setPreferredSize(new Dimension(36, 36));
		}
		return btn02;
	}
	private JButton getBtn03() {
		if (btn03 == null) {
			btn03 = new JButton("");
			btn03.setName("btn03");
			btn03.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn03, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn03.setMinimumSize(new Dimension(36, 36));
			btn03.setPreferredSize(new Dimension(36, 36));
		}
		return btn03;
	}
	private JButton getBtn04() {
		if (btn04 == null) {
			btn04 = new JButton("");
			btn04.setName("btn04");
			btn04.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn04, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn04.setMinimumSize(new Dimension(36, 36));
			btn04.setPreferredSize(new Dimension(36, 36));
		}
		return btn04;
	}
	private JButton getBtn05() {
		if (btn05 == null) {
			btn05 = new JButton("");
			btn05.setName("btn05");
			btn05.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn05, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn05.setMinimumSize(new Dimension(36, 36));
			btn05.setPreferredSize(new Dimension(36, 36));
		}
		return btn05;
	}
	private JButton getBtn06() {
		if (btn06 == null) {
			btn06 = new JButton("");
			btn06.setName("btn06");
			btn06.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn06, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn06.setMinimumSize(new Dimension(36, 36));
			btn06.setPreferredSize(new Dimension(36, 36));
		}
		return btn06;
	}
	private JButton getBtn07() {
		if (btn07 == null) {
			btn07 = new JButton("");
			btn07.setName("btn07");
			btn07.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn07, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn07.setMinimumSize(new Dimension(36, 36));
			btn07.setPreferredSize(new Dimension(36, 36));
		}
		return btn07;
	}
	private JButton getBtn08() {
		if (btn08 == null) {
			btn08 = new JButton("");
			btn08.setName("btn08");
			btn08.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn08, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn08.setMinimumSize(new Dimension(36, 36));
			btn08.setPreferredSize(new Dimension(36, 36));
		}
		return btn08;
	}
	private JButton getBtn09() {
		if (btn09 == null) {
			btn09 = new JButton("");
			btn09.setName("btn09");
			btn09.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn09, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn09.setMinimumSize(new Dimension(36, 36));
			btn09.setPreferredSize(new Dimension(36, 36));
		}
		return btn09;
	}
	private JButton getBtn10() {
		if (btn10 == null) {
			btn10 = new JButton("");
			btn10.setName("btn10");
			btn10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn10, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn10.setMinimumSize(new Dimension(36, 36));
			btn10.setPreferredSize(new Dimension(36, 36));
		}
		return btn10;
	}
	private JButton getBtn20() {
		if (btn20 == null) {
			btn20 = new JButton("");
			btn20.setName("btn20");
			btn20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn20, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn20.setMinimumSize(new Dimension(36, 36));
			btn20.setPreferredSize(new Dimension(36, 36));
		}
		return btn20;
	}
	private JButton getBtn30() {
		if (btn30 == null) {
			btn30 = new JButton("");
			btn30.setName("btn30");
			btn30.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn30, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn30.setMinimumSize(new Dimension(36, 36));
			btn30.setPreferredSize(new Dimension(36, 36));
		}
		return btn30;
	}
	private JButton getBtn40() {
		if (btn40 == null) {
			btn40 = new JButton("");
			btn40.setName("btn40");
			btn40.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn40, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn40.setMinimumSize(new Dimension(36, 36));
			btn40.setPreferredSize(new Dimension(36, 36));
		}
		return btn40;
	}
	private JButton getBtn50() {
		if (btn50 == null) {
			btn50 = new JButton("");
			btn50.setName("btn50");
			btn50.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn50, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn50.setMinimumSize(new Dimension(36, 36));
			btn50.setPreferredSize(new Dimension(36, 36));
		}
		return btn50;
	}
	private JButton getBtn60() {
		if (btn60 == null) {
			btn60 = new JButton("");
			btn60.setName("btn60");
			btn60.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn60, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn60.setMinimumSize(new Dimension(36, 36));
			btn60.setPreferredSize(new Dimension(36, 36));
		}
		return btn60;
	}
	private JButton getBtn70() {
		if (btn70 == null) {
			btn70 = new JButton("");
			btn70.setName("btn70");
			btn70.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn70, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn70.setMinimumSize(new Dimension(36, 36));
			btn70.setPreferredSize(new Dimension(36, 36));
		}
		return btn70;
	}
	private JButton getBtn80() {
		if (btn80 == null) {
			btn80 = new JButton("");
			btn80.setName("btn80");
			btn80.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn80, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn80.setMinimumSize(new Dimension(36, 36));
			btn80.setPreferredSize(new Dimension(36, 36));
		}
		return btn80;
	}
	private JButton getBtn90() {
		if (btn90 == null) {
			btn90 = new JButton("");
			btn90.setName("btn90");
			btn90.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIControler.activateButton(btn90, rdbtnV.isSelected(), cbShipSize.getSelectedItem().toString(), cbShipSize.getItemCount());
				}
			});
			btn90.setMinimumSize(new Dimension(36, 36));
			btn90.setPreferredSize(new Dimension(36, 36));
		}
		return btn90;
	}
	private JButton getBtn_00() {
		if (btn_00 == null) {
			btn_00 = new JButton("");
			btn_00.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						
						GUIControler.attackOponent(btn_00);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_00.setMinimumSize(new Dimension(36, 36));
			btn_00.setPreferredSize(new Dimension(36, 36));
			btn_00.setName("btn_00");
		}
		return btn_00;
	}
	private JButton getBtn_01() {
		if (btn_01 == null) {
			btn_01 = new JButton("");
			btn_01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_01);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_01.setMinimumSize(new Dimension(36, 36));
			btn_01.setPreferredSize(new Dimension(36, 36));
			btn_01.setName("btn_01");
		}
		return btn_01;
	}
	private JButton getBtn_02() {
		if (btn_02 == null) {
			btn_02 = new JButton("");
			btn_02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_02);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_02.setMinimumSize(new Dimension(36, 36));
			btn_02.setPreferredSize(new Dimension(36, 36));
			btn_02.setName("btn_02");
		}
		return btn_02;
	}
	private JButton getBtn_03() {
		if (btn_03 == null) {
			btn_03 = new JButton("");
			btn_03.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_03);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_03.setMinimumSize(new Dimension(36, 36));
			btn_03.setPreferredSize(new Dimension(36, 36));
			btn_03.setName("btn_03");
		}
		return btn_03;
	}
	private JButton getBtn_04() {
		if (btn_04 == null) {
			btn_04 = new JButton("");
			btn_04.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_04);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_04.setMinimumSize(new Dimension(36, 36));
			btn_04.setPreferredSize(new Dimension(36, 36));
			btn_04.setName("btn_04");
		}
		return btn_04;
	}
	private JButton getBtn_05() {
		if (btn_05 == null) {
			btn_05 = new JButton("");
			btn_05.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_05);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_05.setMinimumSize(new Dimension(36, 36));
			btn_05.setPreferredSize(new Dimension(36, 36));
			btn_05.setName("btn_05");
		}
		return btn_05;
	}
	private JButton getBtn_06() {
		if (btn_06 == null) {
			btn_06 = new JButton("");
			btn_06.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_06);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_06.setMinimumSize(new Dimension(36, 36));
			btn_06.setPreferredSize(new Dimension(36, 36));
			btn_06.setName("btn_06");
		}
		return btn_06;
	}
	private JButton getBtn_07() {
		if (btn_07 == null) {
			btn_07 = new JButton("");
			btn_07.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_07);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_07.setMinimumSize(new Dimension(36, 36));
			btn_07.setPreferredSize(new Dimension(36, 36));
			btn_07.setName("btn_07");
		}
		return btn_07;
	}
	private JButton getBtn_08() {
		if (btn_08 == null) {
			btn_08 = new JButton("");
			btn_08.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_08);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_08.setMinimumSize(new Dimension(36, 36));
			btn_08.setPreferredSize(new Dimension(36, 36));
			btn_08.setName("btn_08");
		}
		return btn_08;
	}
	private JButton getBtn_09() {
		if (btn_09 == null) {
			btn_09 = new JButton("");
			btn_09.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_09);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_09.setMinimumSize(new Dimension(36, 36));
			btn_09.setPreferredSize(new Dimension(36, 36));
			btn_09.setName("btn_09");
		}
		return btn_09;
	}
	private JButton getBtn_10() {
		if (btn_10 == null) {
			btn_10 = new JButton("");
			btn_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_10);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_10.setMinimumSize(new Dimension(36, 36));
			btn_10.setPreferredSize(new Dimension(36, 36));
			btn_10.setName("btn_10");
		}
		return btn_10;
	}
	private JButton getBtn_20() {
		if (btn_20 == null) {
			btn_20 = new JButton("");
			btn_20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_20);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_20.setMinimumSize(new Dimension(36, 36));
			btn_20.setPreferredSize(new Dimension(36, 36));
			btn_20.setName("btn_20");
		}
		return btn_20;
	}
	private JButton getBtn_30() {
		if (btn_30 == null) {
			btn_30 = new JButton("");
			btn_30.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_30);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_30.setMinimumSize(new Dimension(36, 36));
			btn_30.setPreferredSize(new Dimension(36, 36));
			btn_30.setName("btn_30");
		}
		return btn_30;
	}
	private JButton getBtn_40() {
		if (btn_40 == null) {
			btn_40 = new JButton("");
			btn_40.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_40);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_40.setMinimumSize(new Dimension(36, 36));
			btn_40.setPreferredSize(new Dimension(36, 36));
			btn_40.setName("btn_40");
		}
		return btn_40;
	}
	private JButton getBtn_50() {
		if (btn_50 == null) {
			btn_50 = new JButton("");
			btn_50.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_50);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_50.setMinimumSize(new Dimension(36, 36));
			btn_50.setPreferredSize(new Dimension(36, 36));
			btn_50.setName("btn_50");
		}
		return btn_50;
	}
	private JButton getBtn_60() {
		if (btn_60 == null) {
			btn_60 = new JButton("");
			btn_60.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_60);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_60.setMinimumSize(new Dimension(36, 36));
			btn_60.setPreferredSize(new Dimension(36, 36));
			btn_60.setName("btn_60");
		}
		return btn_60;
	}
	private JButton getBtn_70() {
		if (btn_70 == null) {
			btn_70 = new JButton("");
			btn_70.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_70);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_70.setMinimumSize(new Dimension(36, 36));
			btn_70.setPreferredSize(new Dimension(36, 36));
			btn_70.setName("btn_70");
		}
		return btn_70;
	}
	private JButton getBtn_80() {
		if (btn_80 == null) {
			btn_80 = new JButton("");
			btn_80.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_80);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_80.setMinimumSize(new Dimension(36, 36));

			btn_80.setPreferredSize(new Dimension(36, 36));
			btn_80.setName("btn_80");
		}
		return btn_80;
	}
	private JButton getBtn_90() {
		if (btn_90 == null) {
			btn_90 = new JButton("");
			btn_90.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_90);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_90.setMinimumSize(new Dimension(36, 36));
			btn_90.setPreferredSize(new Dimension(36, 36));
			btn_90.setName("btn_90");
		}
		return btn_90;
	}
	private JButton getBtn_91() {
		if (btn_91 == null) {
			btn_91 = new JButton("");
			btn_91.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_91);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_91.setMinimumSize(new Dimension(36, 36));
			btn_91.setPreferredSize(new Dimension(36, 36));
			btn_91.setName("btn_91");
		}
		return btn_91;
	}
	private JButton getBtn_92() {
		if (btn_92 == null) {
			btn_92 = new JButton("");
			btn_92.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_92);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_92.setMinimumSize(new Dimension(36, 36));
			btn_92.setPreferredSize(new Dimension(36, 36));
			btn_92.setName("btn_92");
		}
		return btn_92;
	}
	private JButton getBtn_93() {
		if (btn_93 == null) {
			btn_93 = new JButton("");
			btn_93.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_93);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_93.setMinimumSize(new Dimension(36, 36));
			btn_93.setPreferredSize(new Dimension(36, 36));
			btn_93.setName("btn_93");
		}
		return btn_93;
	}
	private JButton getBtn_94() {
		if (btn_94 == null) {
			btn_94 = new JButton("");
			btn_94.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_94);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_94.setMinimumSize(new Dimension(36, 36));
			btn_94.setPreferredSize(new Dimension(36, 36));
			btn_94.setName("btn_94");
		}
		return btn_94;
	}
	private JButton getBtn_95() {
		if (btn_95 == null) {
			btn_95 = new JButton("");
			btn_95.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_95);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_95.setMinimumSize(new Dimension(36, 36));
			btn_95.setPreferredSize(new Dimension(36, 36));
			btn_95.setName("btn_95");
		}
		return btn_95;
	}
	private JButton getBtn_96() {
		if (btn_96 == null) {
			btn_96 = new JButton("");
			btn_96.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_96);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_96.setMinimumSize(new Dimension(36, 36));
			btn_96.setPreferredSize(new Dimension(36, 36));
			btn_96.setName("btn_96");
		}
		return btn_96;
	}
	private JButton getBtn_97() {
		if (btn_97 == null) {
			btn_97 = new JButton("");
			btn_97.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_97);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_97.setMinimumSize(new Dimension(36, 36));
			btn_97.setPreferredSize(new Dimension(36, 36));
			btn_97.setName("btn_97");
		}
		return btn_97;
	}
	private JButton getBtn_98() {
		if (btn_98 == null) {
			btn_98 = new JButton("");
			btn_98.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_98);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_98.setMinimumSize(new Dimension(36, 36));
			btn_98.setPreferredSize(new Dimension(36, 36));
			btn_98.setName("btn_98");
		}
		return btn_98;
	}
	private JButton getBtn_19() {
		if (btn_19 == null) {
			btn_19 = new JButton("");
			btn_19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_19);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_19.setMinimumSize(new Dimension(36, 36));
			btn_19.setPreferredSize(new Dimension(36, 36));
			btn_19.setName("btn_19");
		}
		return btn_19;
	}
	private JButton getBtn_29() {
		if (btn_29 == null) {
			btn_29 = new JButton("");
			btn_29.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_29);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_29.setMinimumSize(new Dimension(36, 36));
			btn_29.setPreferredSize(new Dimension(36, 36));
			btn_29.setName("btn_29");
		}
		return btn_29;
	}
	private JButton getBtn_39() {
		if (btn_39 == null) {
			btn_39 = new JButton("");
			btn_39.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_39);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_39.setMinimumSize(new Dimension(36, 36));
			btn_39.setPreferredSize(new Dimension(36, 36));
			btn_39.setName("btn_39");
		}
		return btn_39;
	}
	private JButton getBtn_49() {
		if (btn_49 == null) {
			btn_49 = new JButton("");
			btn_49.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_49);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_49.setMinimumSize(new Dimension(36, 36));
			btn_49.setPreferredSize(new Dimension(36, 36));
			btn_49.setName("btn_49");
		}
		return btn_49;
	}
	private JButton getBtn_59() {
		if (btn_59 == null) {
			btn_59 = new JButton("");
			btn_59.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_59);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_59.setMinimumSize(new Dimension(36, 36));
			btn_59.setPreferredSize(new Dimension(36, 36));
			btn_59.setName("btn_59");
		}
		return btn_59;
	}
	private JButton getBtn_69() {
		if (btn_69 == null) {
			btn_69 = new JButton("");
			btn_69.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_69);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_69.setMinimumSize(new Dimension(36, 36));
			btn_69.setPreferredSize(new Dimension(36, 36));
			btn_69.setName("btn_69");
		}
		return btn_69;
	}
	private JButton getBtn_79() {
		if (btn_79 == null) {
			btn_79 = new JButton("");
			btn_79.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_79);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_79.setMinimumSize(new Dimension(36, 36));
			btn_79.setPreferredSize(new Dimension(36, 36));
			btn_79.setName("btn_79");
		}
		return btn_79;
	}
	private JButton getBtn_89() {
		if (btn_89 == null) {
			btn_89 = new JButton("");
			btn_89.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_89);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_89.setMinimumSize(new Dimension(36, 36));
			btn_89.setPreferredSize(new Dimension(36, 36));
			btn_89.setName("btn_89");
		}
		return btn_89;
	}
	private JButton getBtn_99() {
		if (btn_99 == null) {
			btn_99 = new JButton("");
			btn_99.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						GUIControler.attackOponent(btn_99);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btn_99.setMinimumSize(new Dimension(36, 36));
			btn_99.setPreferredSize(new Dimension(36, 36));
			btn_99.setName("btn_99");
		}
		return btn_99;
	}
}
