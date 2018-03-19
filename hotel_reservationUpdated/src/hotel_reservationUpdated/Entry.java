package hotel_reservationUpdated;

import java.awt.EventQueue;

import hotel_reservationUpdated.mySqlConnect;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
public class Entry {
	
	//database
	Connection conn=null;
	PreparedStatement pst=null;

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void newPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entry window = new Entry();
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
	public Entry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guest_name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 96, 140, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
		lblAge.setBounds(10, 133, 140, 26);
		frame.getContentPane().add(lblAge);
		
		JLabel lblEmailId = new JLabel("Email_id");
		lblEmailId.setForeground(Color.WHITE);
		lblEmailId.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
		lblEmailId.setBounds(10, 170, 140, 26);
		frame.getContentPane().add(lblEmailId);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setForeground(Color.WHITE);
		lblNationality.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
		lblNationality.setBounds(10, 207, 140, 26);
		frame.getContentPane().add(lblNationality);
		
		JLabel lblNights = new JLabel("Nights");
		lblNights.setForeground(Color.WHITE);
		lblNights.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
		lblNights.setBounds(10, 244, 140, 26);
		frame.getContentPane().add(lblNights);
		
		textField = new JTextField();
		textField.setBounds(137, 98, 163, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 133, 163, 26);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(137, 207, 163, 23);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(137, 244, 163, 23);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("reServation");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(10, 11, 229, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 170, 163, 26);
		frame.getContentPane().add(textField_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				conn=mySqlConnect.ConnectDB();
				String Sql="Insert into tableentry(Guest_name,Age,Email_id,Nationality,Nights) values (?,?,?,?,?)";
				
				//add try and catch block
				
try {
					 
					 
					
					pst=conn.prepareStatement(Sql);
					pst.setString(1, textField.getText());
					pst.setString(2, textField_1.getText());
					pst.setString(3, textField_2.getText());
					pst.setString(4, textField_3.getText());
					pst.setString(5, textField_4.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null,"data saved successfully");
					
					
		}catch(Exception exc)
				{
			     JOptionPane.showMessageDialog(null, exc);
				}
				
			}
		});
		btnSubmit.setBounds(10, 318, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("H:\\reservation_background.jpg"));
		lblNewLabel_2.setBounds(0, 0, 634, 449);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
