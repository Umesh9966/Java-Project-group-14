import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Address {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Address window = new Address();
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
	public Address() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 648, 735);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewAddress = new JLabel("New Address");
		lblNewAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAddress.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewAddress.setBounds(0, 28, 503, 43);
		frame.getContentPane().add(lblNewAddress);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 69, 614, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("*First Name");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 109, 111, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(131, 113, 172, 26);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("*Last Name");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(312, 113, 111, 26);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(424, 113, 172, 26);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("*Mobile No");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 188, 111, 26);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 192, 293, 26);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Address Details");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(10, 270, 126, 26);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("*House / Flat No/ Building/ Apartment");
		lblNewLabel_1_2_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2_2.setBounds(10, 316, 353, 26);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 353, 614, 26);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("*Street/Locality");
		lblNewLabel_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2_2_1.setBounds(10, 409, 158, 26);
		frame.getContentPane().add(lblNewLabel_1_2_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(162, 409, 462, 26);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Landmark (Op)");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2_2_1_1.setBounds(10, 477, 142, 26);
		frame.getContentPane().add(lblNewLabel_1_2_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(162, 484, 462, 26);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("*Pincode");
		lblNewLabel_1_2_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2_2_1_1_1.setBounds(10, 545, 93, 26);
		frame.getContentPane().add(lblNewLabel_1_2_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(113, 549, 126, 26);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1 = new JLabel("*City, State");
		lblNewLabel_1_2_2_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2_2_1_1_1_1.setBounds(249, 545, 114, 26);
		frame.getContentPane().add(lblNewLabel_1_2_2_1_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(373, 545, 251, 26);
		frame.getContentPane().add(textField_7);
		
		JButton btnNewButton = new JButton("ADD ADDRESS");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton.setBounds(190, 628, 203, 43);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 294, 111, 2);
		frame.getContentPane().add(separator_1);
	}
}
