import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserRegistration {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration window = new UserRegistration();
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
	public UserRegistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 649, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 516, 588, -504);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(-24, 2, 635, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(30, 124, 111, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name ");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(30, 170, 111, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Username");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(30, 215, 111, 22);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Password");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(30, 256, 111, 22);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Confirm Password");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(30, 300, 170, 22);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Email");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(30, 348, 111, 22);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Mobile No");
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(30, 394, 111, 22);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Date of Birth");
		lblNewLabel_1_7.setForeground(Color.WHITE);
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_7.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_7.setBounds(30, 436, 111, 22);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Gender");
		lblNewLabel_1_8.setForeground(Color.WHITE);
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_8.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_8.setBounds(30, 484, 111, 22);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		textField = new JTextField();
		textField.setBounds(228, 128, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(228, 174, 96, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(228, 219, 96, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(228, 260, 96, 19);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(228, 304, 96, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(228, 352, 96, 19);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(228, 398, 96, 19);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(228, 440, 96, 19);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(228, 487, 96, 19);
		frame.getContentPane().add(textField_8);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = (Connection) getDetails.geticon("");
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(396, 484, 119, 31);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Already have an account?");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_2.setBounds(300, 526, 131, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sign In");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login window = new login();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel_3.setForeground(Color.MAGENTA);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(433, 527, 55, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 62, 635, 52);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Icons/main/4893706.jpg")));
		lblNewLabel_4.setBounds(10, 2, 615, 565);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
