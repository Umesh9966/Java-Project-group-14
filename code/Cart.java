import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class Cart {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart window = new Cart();
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
	public Cart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 789, 627);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 218, 755, -206);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("No Products In Cart");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(248, 62, 277, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADD PRODUCTS TO YOUR CART");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage window = new homepage();
				window.frame.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(197, 120, 402, 31);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(86, 251, 621, 211);
		frame.getContentPane().add(scrollPane_1);
		
		JTabbedPane cart = new JTabbedPane(JTabbedPane.TOP);
		scrollPane_1.setViewportView(cart);
		
		JButton btnNewButton_1 = new JButton("Invoice");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(298, 504, 124, 48);
		frame.getContentPane().add(btnNewButton_1);
	}
}
