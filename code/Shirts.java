import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Shirts {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shirts window = new Shirts();
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
	public Shirts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1370, 825);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/shirts-3.png")));
		lblNewLabel_2.setBounds(996, 10, 360, 351);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(418, 10, 8, 695);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/shirts-2.png")));
		lblNewLabel_2_1.setBounds(499, 10, 360, 351);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/shirts-1.5.png")));
		lblNewLabel_2_1_1.setBounds(10, 10, 360, 351);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(933, 10, 8, 695);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Men Pink Half Sleeves Formal Shirt");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 387, 398, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMenMultiFull = new JLabel("Men Multi Full Sleeves Casual Shirt");
		lblMenMultiFull.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenMultiFull.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenMultiFull.setBounds(481, 387, 398, 41);
		frame.getContentPane().add(lblMenMultiFull);
		
		JLabel lblMenOrangeFull = new JLabel("Men Orange Full Sleeves Formal Shirt");
		lblMenOrangeFull.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenOrangeFull.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenOrangeFull.setBounds(968, 387, 398, 41);
		frame.getContentPane().add(lblMenOrangeFull);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 706, 1346, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Color  : Pink");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 466, 133, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Color  : Multi ");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(434, 464, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Color  : Orange");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(951, 464, 161, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Pattern  :  check");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(10, 507, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Pattern  :  check");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_1.setBounds(436, 507, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Pattern  :  solid");
		lblNewLabel_1_3_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_1_1.setBounds(951, 507, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Size   :  36, 38, 39, 40, 42");
		lblNewLabel_1_3_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2.setBounds(10, 550, 228, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Size   :  36, 38, 39, 40, 42");
		lblNewLabel_1_3_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2_1.setBounds(436, 550, 228, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_3_2_2 = new JLabel("Size   :  36, 38, 39, 40, 42");
		lblNewLabel_1_3_2_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2_2.setBounds(951, 550, 228, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2_2);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(104, 649, 188, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(569, 649, 188, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_2.setBounds(1091, 649, 188, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Price  :  \u20B9 1200");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(10, 593, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Price  :  \u20B9 1800");
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4_1.setBounds(436, 593, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Price  :  \u20B9 2000");
		lblNewLabel_1_4_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4_2.setBounds(951, 593, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setBounds(527, 747, 40, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("2");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shirtpage2 window = new shirtpage2();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_3_1.setBounds(588, 747, 40, 21);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("<");
		lblNewLabel_3.setBounds(518, 751, 14, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(">");
		lblNewLabel_3_1.setBounds(631, 751, 14, 13);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JButton btnNewButton_4 = new JButton("Home");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage window = new homepage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_4.setBounds(24, 744, 96, 43);
		frame.getContentPane().add(btnNewButton_4);
	}
}
