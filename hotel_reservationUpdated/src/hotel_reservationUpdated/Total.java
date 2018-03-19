package hotel_reservationUpdated;



import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Total {
	Connection conn=null;
	PreparedStatement pst=null;

	private JFrame frame;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_12;
	private JLabel lblCostofService;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Total window = new Total();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Total() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0,1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0,0,0,15));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panel_6.setBounds(56, 115, 391, 333);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblPenthouse = new JLabel("Penthouse ");
		lblPenthouse.setForeground(new Color(245, 255, 250));
		lblPenthouse.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblPenthouse.setBounds(23, 20, 137, 34);
		panel_6.add(lblPenthouse);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setText("0");
		textField_3.setBounds(165, 29, 137, 20);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setText("0");
		textField_4.setBounds(165, 65, 137, 20);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setText("0");
		textField_5.setBounds(165, 185, 137, 20);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblFamilyRoom = new JLabel("Family Room");
		lblFamilyRoom.setForeground(new Color(245, 255, 250));
		lblFamilyRoom.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblFamilyRoom.setBounds(23, 95, 157, 34);
		panel_6.add(lblFamilyRoom);
		
		JLabel lblStanderdRoom = new JLabel("Standard Room");
		lblStanderdRoom.setForeground(new Color(245, 255, 250));
		lblStanderdRoom.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblStanderdRoom.setBounds(23, 136, 157, 34);
		panel_6.add(lblStanderdRoom);
		
		JLabel lblSingleRoom = new JLabel("Single Room");
		lblSingleRoom.setForeground(new Color(245, 255, 250));
		lblSingleRoom.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblSingleRoom.setBounds(23, 176, 157, 34);
		panel_6.add(lblSingleRoom);
		
		JLabel lblSuit = new JLabel("suit");
		lblSuit.setForeground(new Color(245, 255, 250));
		lblSuit.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblSuit.setBounds(23, 60, 137, 34);
		panel_6.add(lblSuit);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setColumns(10);
		textField.setBounds(165, 104, 137, 20);
		panel_6.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(165, 145, 137, 20);
		panel_6.add(textField_1);
		
		JLabel lblMeal = new JLabel("Service");
		lblMeal.setForeground(new Color(245, 255, 250));
		lblMeal.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblMeal.setBounds(23, 249, 70, 34);
		panel_6.add(lblMeal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select service", "gymnast", "laundry", "swimming"}));
		comboBox.setBounds(23, 294, 123, 20);
		panel_6.add(comboBox);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_12.setText("0");
		textField_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_12.setBounds(165, 258, 145, 20);
		panel_6.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setForeground(new Color(240, 255, 255));
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHours.setBounds(165, 233, 46, 14);
		panel_6.add(lblHours);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 216, 370, 7);
		panel_6.add(separator);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setForeground(new Color(0, 0, 0));
		chckbxTax.setFont(new Font("Dialog", Font.ITALIC, 12));
		chckbxTax.setBounds(169, 293, 97, 23);
		panel_6.add(chckbxTax);
		
		JPanel panel_9 = new JPanel();
		//panel_9.setBackground(new Color(0,0,0,30));
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_9.setBounds(516, 459, 195, 168);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setForeground(Color.BLACK);
		lblTax.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblTax.setBounds(10, 11, 79, 34);
		panel_9.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Sub-Total");
		lblSubtotal.setForeground(Color.BLACK);
		lblSubtotal.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblSubtotal.setBounds(10, 56, 79, 34);
		panel_9.add(lblSubtotal);
		//checking
		JLabel label_1 = new JLabel("0");
		//label_1.setBackground(new Color(0,0,0,30));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_1.setBounds(99, 25, 86, 20);
		panel_9.add(label_1);
		
		JLabel label_2 = new JLabel("Total");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Dialog", Font.ITALIC, 12));
		label_2.setBounds(10, 101, 79, 34);
		panel_9.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_3.setBounds(99, 68, 86, 20);
		panel_9.add(label_3);
		
		JLabel label_4 = new JLabel("0");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_4.setBounds(99, 113, 86, 20);
		panel_9.add(label_4);
		
		JLabel lblNewLabel_25 = new JLabel("final");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_25.setBounds(10, 146, 46, 14);
		panel_9.add(lblNewLabel_25);
		
		JLabel label_11 = new JLabel("0");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_11.setBounds(99, 144, 86, 20);
		panel_9.add(label_11);
		
		//bugggs
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(Color.WHITE);
		//panel_5.setBackground(new Color(0,0,0,30));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(56, 459, 391, 168);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(195, 7, 1, 1);
		panel_5.add(panel);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Standard Room 01 ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 11, 147, 35);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Double Bed");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 54, 79, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblToilet = new JLabel("Toilet");
		lblToilet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblToilet.setBounds(10, 86, 79, 21);
		panel.add(lblToilet);
		
		JLabel lblBreakfastMealAnd = new JLabel("Meal");
		lblBreakfastMealAnd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBreakfastMealAnd.setBounds(10, 118, 109, 21);
		panel.add(lblBreakfastMealAnd);
		
		JLabel lblCostOfRooms = new JLabel("cost of rooms");
		lblCostOfRooms.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblCostOfRooms.setBounds(10, 23, 157, 34);
		panel_5.add(lblCostOfRooms);
		
		lblCostofService = new JLabel(" cost of Service");
		lblCostofService.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblCostofService.setBounds(8, 55, 157, 34);
		panel_5.add(lblCostofService);
		
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(177, 23, 151, 26);
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.add(lblNewLabel_3);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label.setBounds(177, 63, 151, 26);
		panel_5.add(label);
		
		JLabel label_6 = new JLabel("cost of food");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_6.setBounds(10, 100, 102, 20);
		panel_5.add(label_6);
		
		JLabel label_7 = new JLabel("0");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_7.setBounds(177, 100, 151, 26);
		panel_5.add(label_7);
		
		JLabel lblNewLabel_24 = new JLabel("no of nights");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_24.setBounds(10, 131, 111, 26);
		panel_5.add(lblNewLabel_24);
		
		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_8.setColumns(10);
		textField_8.setBounds(177, 135, 151, 20);
		
		panel_5.add(textField_8);
		
		JLabel lblNewLabel = new JLabel("Manage Costs");
		lblNewLabel.setForeground(new Color(240, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.ITALIC, 30));
		lblNewLabel.setBounds(56, 37, 537, 68);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0,0,0,30));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panel_1.setBounds(806, 115, 295, 512);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel_4 = new JLabel("Food package");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(10, 11, 102, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblBreakfast = new JLabel("Breakfast");
		lblBreakfast.setForeground(Color.WHITE);
		lblBreakfast.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblBreakfast.setBounds(10, 36, 75, 14);
		panel_1.add(lblBreakfast);
		
		JLabel lblNewLabel_5 = new JLabel("breakfast sandwich");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_5.setBounds(10, 75, 117, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("bread and butter");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_6.setBounds(10, 100, 102, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("earl gray");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_7.setBounds(10, 125, 75, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblMeal_1 = new JLabel("meal");
		lblMeal_1.setForeground(Color.WHITE);
		lblMeal_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblMeal_1.setBounds(10, 185, 46, 14);
		panel_1.add(lblMeal_1);
		
		JLabel lblNewLabel_8 = new JLabel("chinese rice");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_8.setBounds(10, 218, 75, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("chinease vegetable");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_9.setBounds(10, 243, 117, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("milk shake");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_10.setBounds(10, 268, 75, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblDinner = new JLabel("dinner");
		lblDinner.setForeground(Color.WHITE);
		lblDinner.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblDinner.setBounds(10, 344, 46, 14);
		panel_1.add(lblDinner);
		
		JLabel lblNewLabel_11 = new JLabel("burger");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_11.setBounds(10, 369, 46, 14);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("sausage");
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_12.setBounds(10, 394, 46, 14);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("expresso");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_13.setBounds(10, 419, 75, 14);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("450 tk");
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_15.setBounds(137, 76, 102, 14);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("250 tk");
		lblNewLabel_16.setForeground(Color.WHITE);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_16.setBounds(137, 101, 102, 14);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("120 tk");
		lblNewLabel_17.setForeground(Color.WHITE);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_17.setBounds(137, 126, 46, 14);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("1000 tk");
		lblNewLabel_18.setForeground(Color.WHITE);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_18.setBounds(127, 219, 66, 14);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("620 tk");
		lblNewLabel_19.setForeground(Color.WHITE);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_19.setBounds(127, 244, 102, 14);
		panel_1.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("220 tk");
		lblNewLabel_20.setForeground(Color.WHITE);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_20.setBounds(127, 269, 66, 14);
		panel_1.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("300 tk");
		lblNewLabel_21.setForeground(Color.WHITE);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_21.setBounds(127, 370, 46, 14);
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("200 tk");
		lblNewLabel_22.setForeground(Color.WHITE);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_22.setBounds(127, 395, 46, 14);
		panel_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("100 tk");
		lblNewLabel_23.setForeground(Color.WHITE);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_23.setBounds(127, 420, 46, 14);
		panel_1.add(lblNewLabel_23);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setText("0");
		textField_2.setBounds(127, 151, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_6.setText("0");
		textField_6.setBounds(127, 296, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setBounds(127, 447, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("number of pack");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(10, 145, 86, 24);
		panel_1.add(lblNewLabel_14);
		
		JLabel label_8 = new JLabel("number of pack");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_8.setBounds(10, 293, 86, 24);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("number of pack");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_9.setBounds(10, 444, 86, 24);
		panel_1.add(label_9);

		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(516, 425, 132, -211);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0,0,0,30));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panel_3.setBounds(516, 115, 195, 333);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("total");
		btnNewButton.setFont(new Font("Dialog", Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				conn=mySqlConnect.ConnectDB();
				String Sql="Insert into tabletotal(final) values (?)";
				
				
				
				//------------Room------------------
				
				//total for penthouse
				double penthouse= Double.parseDouble(textField_3.getText());
				double ipenthouse=10000;
				double Penthouse;
				Penthouse= (penthouse * ipenthouse);
				String pRoom = String.format("%.2f",+Penthouse );
				lblNewLabel_3.setText(pRoom);
				
				
				
				//total for suit
				double suit= Double.parseDouble(textField_4.getText());
				double isuit=5000;
				double Suit;
				Suit= (suit * isuit);
				String cbRoom = String.format("%.2f",Suit+Penthouse );
				lblNewLabel_3.setText(cbRoom);
				
				//total for Family room
				double familyRoom= Double.parseDouble(textField.getText());
				double ifamilyRoom=4000;
				double FamilyRoom;
				FamilyRoom= (familyRoom * ifamilyRoom);
				String abRoom = String.format("%.2f",FamilyRoom+Suit+Penthouse );
				lblNewLabel_3.setText(abRoom);
				
				//total for standard room
				double standardRoom= Double.parseDouble(textField_1.getText());
				double istandardRoom=2000;
				double StandardRoom;
				StandardRoom= (standardRoom * istandardRoom);
				String efRoom = String.format("%.2f",StandardRoom+FamilyRoom+Suit+Penthouse );
				lblNewLabel_3.setText(efRoom);
				
				//total for single room
				double singleRoom= Double.parseDouble(textField_5.getText());
				double isingleRoom=1500;
				double SingleRoom;
				SingleRoom= (singleRoom * isingleRoom);
				String ghRoom = String.format("%.2f",SingleRoom+StandardRoom+FamilyRoom+Suit+Penthouse);
				lblNewLabel_3.setText(ghRoom);
				
				
                 //-------------------Food----------------------
				
				//total for breakfast
				double breakfast= Double.parseDouble(textField_2.getText());
				double ibreakfast=820;
				double Breakfast;
				Breakfast= (breakfast * ibreakfast);
				String pfood = String.format("%.2f",+Breakfast );
				label_7.setText(pfood);
				
				
				
				//total for meal
				double meal= Double.parseDouble(textField_6.getText());
				double imeal=1840;
				double Meal;
				Meal= (meal * imeal);
				String cbfood = String.format("%.2f",Meal+Breakfast );
				label_7.setText(cbfood);
				
				//total for dinner
				double dinner= Double.parseDouble(textField_7.getText());
				double idinner=600;
				double Dinner;
				Dinner= (dinner * idinner);
				String abfood = String.format("%.2f",Meal+Breakfast+Dinner );
				label_7.setText(abfood);
				
				
				
				
				
				//-------------------service---------------------
				
				double service= Double.parseDouble(textField_12.getText());
				double gymnast=800 *service;
				double laundry=320 *service;
				double swimming=1200 *service;
				
				if (comboBox.getSelectedItem().equals("gymnast"))
				{
					String cgymnast =String.format("%.2f", gymnast);
					label.setText(cgymnast);
					
				}
				
				if (comboBox.getSelectedItem().equals("laundry"))
				{
					String claundry =String.format("%.2f", laundry);
					label.setText(claundry);
					
				}
				
				if (comboBox.getSelectedItem().equals("swimming"))
				{
					String cswimming =String.format("%.2f", swimming);
					label.setText(cswimming);
					
				}
				
				if (comboBox.getSelectedItem().equals("select a drink"))
				{
					
					label.setText("0");
					
				}
				//--------------------end service----------------
				
				
				
				
				
				
				//======================TAX RATE=================
				
				
				double cTotal1= Double.parseDouble(lblNewLabel_3.getText());
				double cTotal2= Double.parseDouble(label.getText());
				double cTotal3= Double.parseDouble(label_7.getText());
				double AllTotal = (cTotal1+cTotal2+cTotal3)/100;
				
				//if(chckbxTax.isSelected())
				{
					String iTotal = String.format("%.2f",AllTotal);
					label_1.setText(iTotal);
					
				}
				
				//==========================Total====================
				
				
				double cTotal4 =Double.parseDouble(label_1.getText());
				
				double subTotal=(cTotal1+cTotal2+cTotal3);
				String isubTotal=String.format(" %.2f", subTotal);
				label_3.setText(isubTotal);
				
				double allTotal=(cTotal1+cTotal2+cTotal4+cTotal3);
				String iTotal=String.format(" %.2f", allTotal);
				label_4.setText(iTotal);
				
				double nights=Double.parseDouble(textField_8.getText());
				double allfinal=allTotal*nights;
				String cbfinal = String.format("%.2f",allfinal );
				label_11.setText(cbfinal);
				
				
				 try {
					 
					 
					
					pst=conn.prepareStatement(Sql);
					pst.setString(1, label_11.getText());
					
					pst.execute();
					JOptionPane.showMessageDialog(null,"data saved successfully");
					
					
		}catch(Exception exc)
				{
			     JOptionPane.showMessageDialog(null, exc);
				} 
				 
				
				
				
			}
		});
		btnNewButton.setBounds(10, 35, 89, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("reset");
		btnNewButton_2.setFont(new Font("Dialog", Font.ITALIC, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_3.setText("0");
				textField_4.setText("0");
				textField.setText("0");
				textField_1.setText("0");
				textField_5.setText("0");
				textField_12.setText("0");
				label.setText("0");
				label_4.setText("0");
				label_1.setText("0");
				label_3.setText("0");
				lblNewLabel_3.setText("0");
				//lblHours.setText(null);
				comboBox.setSelectedItem("0");
				textField_2.setText("0");
				textField_7.setText("0");
				textField_6.setText("0");
				label_7.setText("0");
				textField_8.setText("0");
				label_11.setText("0");
				
				
				
			}
		});
		btnNewButton_2.setBounds(10, 191, 89, 23);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("exit");
		btnNewButton_3.setFont(new Font("Dialog", Font.ITALIC, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					   System.exit(0);
					
			}
		});
		btnNewButton_3.setBounds(10, 274, 89, 23);
		panel_3.add(btnNewButton_3);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("H:\\xpublic-new-york-penthouse-hotel-room-jpg-pagespee.jpg"));
		label_5.setBounds(20, 11, 1352, 638);
		frame.getContentPane().add(label_5);
		
	
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
