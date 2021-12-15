import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class Profile {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile window = new Profile();
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
	public Profile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 694, 771);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Profile");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 29, 680, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 70, 660, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 110, 72, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 172, 72, 26);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile no");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 232, 93, 26);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gender");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(10, 301, 72, 26);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel(" Date of Birth ");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(0, 371, 130, 26);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		textField = new JTextField();
		textField.setBounds(164, 114, 204, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(164, 176, 204, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(164, 236, 204, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(164, 305, 204, 26);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Location");
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(10, 437, 93, 26);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Addresses");
		lblNewLabel_1_4_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_4_2.setBounds(10, 496, 120, 26);
		frame.getContentPane().add(lblNewLabel_1_4_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(164, 375, 204, 26);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(164, 441, 204, 26);
		frame.getContentPane().add(textField_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(164, 500, 213, 117);
		frame.getContentPane().add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(164, 496, 213, 117);
		frame.getContentPane().add(scrollBar);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(127, 665, 138, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSubmit.setBounds(291, 665, 117, 21);
		frame.getContentPane().add(btnSubmit);
	}
}
