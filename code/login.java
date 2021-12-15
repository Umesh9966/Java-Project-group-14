import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class login {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.CYAN);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 636, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(new Color(0, 204, 153));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(222, 65, 127, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1.setBounds(134, 142, 117, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(134, 205, 117, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBackground(Color.GRAY);
		textField.setBounds(261, 142, 117, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.GRAY);
		passwordField.setBounds(261, 205, 117, 29);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = getDetails.getcon();
				String s  = String.format("select * Customer where id='%s' password = '%s'",textField.getText(),new String( passwordField.getPassword()));
				System.out.println(s);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(243, 309, 106, 33);
		frame.getContentPane().add(btnNewButton);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("show password");
		chckbxNewCheckBox.setBackground(Color.GRAY);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}else
				{
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Arial Black", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(284, 262, 127, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Icons/main/user_30px.png")));;
		lblNewLabel_2.setBounds(106, 142, 35, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Icons/main/eye_24px.png")));;
		lblNewLabel_3.setBounds(106, 205, 33, 36);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("New User?");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserRegistration window = new UserRegistration();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_5.setForeground(new Color(255, 255, 204));
		lblNewLabel_5.setBounds(261, 352, 79, 33);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Icons/main/4893706.jpg")));
		lblNewLabel_4.setBounds(10, 10, 602, 423);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
