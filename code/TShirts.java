import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TShirts {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TShirts window = new TShirts();
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
	public TShirts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1413, 829);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/tshirts1.png")));
		lblNewLabel_3.setBounds(20, 10, 408, 359);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/tshirts2.png")));
		lblNewLabel_4.setBounds(495, 10, 386, 359);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/t-shirts3.png")));
		lblNewLabel_5.setBounds(974, 10, 347, 359);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(454, 10, 8, 720);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(914, 10, 8, 720);
		frame.getContentPane().add(separator_1);
		
		JLabel lblMenGreenPolo = new JLabel("Men Green Polo T Shirt");
		lblMenGreenPolo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenGreenPolo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenGreenPolo.setBounds(10, 379, 398, 41);
		frame.getContentPane().add(lblMenGreenPolo);
		
		JLabel lblMenRedT = new JLabel("Men Red T Shirt");
		lblMenRedT.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenRedT.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenRedT.setBounds(483, 379, 398, 41);
		frame.getContentPane().add(lblMenRedT);
		
		JLabel lblMenWhitePolo = new JLabel("Men White Polo T Shirt");
		lblMenWhitePolo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenWhitePolo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenWhitePolo.setBounds(964, 379, 398, 41);
		frame.getContentPane().add(lblMenWhitePolo);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 728, 1369, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Color  :  Green");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(22, 458, 133, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Color  :  Red");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(495, 471, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Color  :  white");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(974, 471, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Pattern  :  solid");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(22, 501, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Pattern  :  Stripe");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_1.setBounds(495, 513, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Pattern  :  Stripe");
		lblNewLabel_1_3_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2.setBounds(974, 513, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Size   : S, M, L, XL, XXL ");
		lblNewLabel_1_3_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2_1.setBounds(22, 546, 228, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_3_2_2 = new JLabel("Size   : S, M, L, XL, XXL");
		lblNewLabel_1_3_2_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2_2.setBounds(495, 556, 228, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2_2);
		
		JLabel lblNewLabel_1_3_2_3 = new JLabel("Size   : S, M, L, XL, XXL");
		lblNewLabel_1_3_2_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2_3.setBounds(974, 556, 228, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Price  :  \u20B9  750");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(22, 589, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Price  :  \u20B9 899");
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4_1.setBounds(495, 599, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Price  :  \u20B9 999");
		lblNewLabel_1_4_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4_2.setBounds(974, 601, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4_2);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(113, 652, 188, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(595, 652, 188, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_2.setBounds(1090, 652, 188, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Home");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage window = new homepage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_3.setBounds(45, 742, 96, 43);
		frame.getContentPane().add(btnNewButton_3);
	}
}
