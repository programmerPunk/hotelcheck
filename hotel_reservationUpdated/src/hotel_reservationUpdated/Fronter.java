package hotel_reservationUpdated;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Fronter {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fronter window = new Fronter();
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
	public Fronter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginPage nw= new LoginPage();
				nw.log();
			}
		});
		btnNewButton.setBounds(1118, 11, 103, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReservation = new JButton("Reservation");
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entry pw= new Entry();
				pw.newPage();
			}
		});
		btnReservation.setBounds(1218, 11, 103, 36);
		frame.getContentPane().add(btnReservation);
		
		JLabel lblNewLabel = new JLabel("Grand Villa");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sylfaen", Font.ITALIC, 40));
		lblNewLabel.setBounds(47, 11, 460, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("luxurious suits");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.ITALIC, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(47, 115, 236, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblDeliciousFoodPackage = new JLabel("delicious food package");
		lblDeliciousFoodPackage.setForeground(Color.WHITE);
		lblDeliciousFoodPackage.setFont(new Font("Sylfaen", Font.ITALIC, 18));
		lblDeliciousFoodPackage.setHorizontalAlignment(SwingConstants.LEFT);
		lblDeliciousFoodPackage.setBounds(47, 153, 236, 27);
		frame.getContentPane().add(lblDeliciousFoodPackage);
		
		JLabel lblDelightfulServices = new JLabel("delightful services");
		lblDelightfulServices.setForeground(Color.WHITE);
		lblDelightfulServices.setFont(new Font("Sylfaen", Font.ITALIC, 18));
		lblDelightfulServices.setHorizontalAlignment(SwingConstants.LEFT);
		lblDelightfulServices.setBounds(47, 191, 236, 27);
		frame.getContentPane().add(lblDelightfulServices);
		
		JLabel lblNewLabel_2 = new JLabel("Comfy suits with topmost environment, neat and clean aura, deliciouse");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.ITALIC, 16));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBounds(47, 539, 682, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblDeliciouseAndHealthy = new JLabel(" and healthy food made by our experianced chefs, come and enjoy,");
		lblDeliciouseAndHealthy.setForeground(Color.WHITE);
		lblDeliciouseAndHealthy.setFont(new Font("Sylfaen", Font.ITALIC, 16));
		lblDeliciouseAndHealthy.setVerticalAlignment(SwingConstants.TOP);
		lblDeliciouseAndHealthy.setBounds(47, 563, 606, 27);
		frame.getContentPane().add(lblDeliciouseAndHealthy);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setBounds(47, 300, 422, 27);
		frame.getContentPane().add(label);
		
		JLabel lblWelcomeToHotel = new JLabel(" welcome to Hotel Grand Finale.");
		lblWelcomeToHotel.setForeground(Color.WHITE);
		lblWelcomeToHotel.setVerticalAlignment(SwingConstants.TOP);
		lblWelcomeToHotel.setFont(new Font("Sylfaen", Font.ITALIC, 16));
		lblWelcomeToHotel.setBounds(47, 588, 606, 27);
		frame.getContentPane().add(lblWelcomeToHotel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("H:\\CoverofFrontpage.jpg"));
		lblNewLabel_3.setBounds(0, 0, 1352, 638);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
