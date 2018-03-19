package hotel_reservationUpdated;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import hotel_reservationUpdated.Total;
import hotel_reservationUpdated.mySqlConnect;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class LoginPage {
	
	
	//connect to database
			Connection conn=null;
			PreparedStatement pst=null;
			ResultSet rs=null;

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void log() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Guest_name");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(31, 74, 106, 24);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Age");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(31, 122, 106, 24);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(164, 74, 134, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(164, 122, 134, 24);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				//add database
				conn=mySqlConnect.ConnectDB();
				String Sql="Select * from tableentry where Guest_name =? and Age = ?";
				
				try {
					 
					 
					
					pst=conn.prepareStatement(Sql);
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					rs=pst.executeQuery();
					if(rs.next()){
					JOptionPane.showMessageDialog(null,"welcome user");
					
					Total w=new Total();
					w.setVisible(true);
					Total nw= new Total();
					nw.newScreen();
					}
					
					else
					{JOptionPane.showMessageDialog(null,"Invalid username or password","Access denied",JOptionPane.ERROR_MESSAGE);
					
				
			}
					}catch(Exception exc)
				{
			     JOptionPane.showMessageDialog(null, exc);
				}
				
				
			}
		});
		btnLogin.setBounds(31, 190, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				passwordField.setText(null);
				
				
			}
		});
		btnReset.setBounds(184, 190, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
