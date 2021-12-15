import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class shirtpage2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shirtpage2 window = new shirtpage2();
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
	public shirtpage2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 1403, 831);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/shirts-4.png")));
		lblNewLabel_3.setBounds(22, 10, 386, 331);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/shirts-5.png")));
		lblNewLabel_4.setBounds(495, 21, 386, 331);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/shirts-6.png")));
		lblNewLabel_5.setBounds(974, 10, 360, 331);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(454, 10, 8, 720);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(914, 10, 8, 720);
		frame.getContentPane().add(separator_1);
		
		JLabel lblMenYellowFull = new JLabel("Men Yellow Full Sleeves Casual Shirt");
		lblMenYellowFull.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenYellowFull.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenYellowFull.setBounds(10, 379, 398, 41);
		frame.getContentPane().add(lblMenYellowFull);
		
		JLabel lblMenBlueFull = new JLabel("Men Blue Full Sleeves Formal Shirt");
		lblMenBlueFull.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenBlueFull.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenBlueFull.setBounds(483, 379, 398, 41);
		frame.getContentPane().add(lblMenBlueFull);
		
		JLabel lblMenMaroonFull = new JLabel("Men Maroon Full Sleeves Casual Shirt");
		lblMenMaroonFull.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenMaroonFull.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenMaroonFull.setBounds(964, 379, 398, 41);
		frame.getContentPane().add(lblMenMaroonFull);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 728, 1369, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Color  : Yellow");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(22, 458, 133, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Color  : Blue");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(495, 471, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Color  : Maroon");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(974, 471, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Pattern  :  solid");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(22, 501, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Pattern  :  check");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_1.setBounds(495, 513, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Pattern  :  check");
		lblNewLabel_1_3_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2.setBounds(974, 513, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Size   :  36, 38, 39, 40, 42");
		lblNewLabel_1_3_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2_1.setBounds(22, 546, 228, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_3_2_2 = new JLabel("Size   :  36, 38, 39, 40, 42");
		lblNewLabel_1_3_2_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2_2.setBounds(495, 556, 228, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2_2);
		
		JLabel lblNewLabel_1_3_2_3 = new JLabel("Size   :  36, 38, 39, 40, 42");
		lblNewLabel_1_3_2_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2_3.setBounds(974, 556, 228, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Price  :  \u20B9 1500");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(22, 589, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Price  :  \u20B9 2000");
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4_1.setBounds(495, 599, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Price  :  \u20B9 2500");
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
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_2.setBounds(1090, 652, 188, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shirts window = new Shirts();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(595, 763, 40, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("2");
		btnNewButton_3_1.setBounds(645, 763, 40, 21);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JLabel lblNewLabel_3_1 = new JLabel(">");
		lblNewLabel_3_1.setBounds(693, 767, 14, 13);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("<");
		lblNewLabel_3_2.setBounds(583, 767, 14, 13);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JButton btnNewButton_4 = new JButton("Home");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage window = new homepage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_4.setBounds(30, 741, 96, 43);
		frame.getContentPane().add(btnNewButton_4);
	}

}
