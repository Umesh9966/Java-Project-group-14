import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyAccount {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyAccount window = new MyAccount();
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
	public MyAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 361, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 90, 390, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Profile");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Profile window = new Profile();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(46, 127, 256, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(139, 169, 73, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblDeliveryAddresses = new JLabel("Delivery Addresses");
		lblDeliveryAddresses.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Address window = new Address();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblDeliveryAddresses.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeliveryAddresses.setFont(new Font("Arial", Font.BOLD, 25));
		lblDeliveryAddresses.setBounds(46, 193, 256, 50);
		frame.getContentPane().add(lblDeliveryAddresses);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(56, 236, 246, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblOrderDetails = new JLabel("Order Details");
		lblOrderDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderDetails.setFont(new Font("Arial", Font.BOLD, 25));
		lblOrderDetails.setBounds(46, 270, 256, 50);
		frame.getContentPane().add(lblOrderDetails);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(111, 310, 147, 2);
		frame.getContentPane().add(separator_3);
		
		JLabel lblAboutUs = new JLabel("About Us");
		lblAboutUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblAboutUs.setFont(new Font("Arial", Font.BOLD, 25));
		lblAboutUs.setBounds(56, 341, 256, 50);
		frame.getContentPane().add(lblAboutUs);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(139, 381, 101, 2);
		frame.getContentPane().add(separator_4);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login l = new login (); 
				l.frame.setVisible(true);
			}
		});
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setFont(new Font("Arial", Font.BOLD, 25));
		lblLogout.setBounds(46, 401, 256, 50);
		frame.getContentPane().add(lblLogout);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(128, 443, 95, 2);
		frame.getContentPane().add(separator_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Desktop\\customer_80px.png"));
		lblNewLabel_1.setBounds(10, 10, 327, 82);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
