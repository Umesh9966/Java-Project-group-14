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

public class Accessories {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accessories window = new Accessories();
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
	public Accessories() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1405, 781);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/belt.png")));
		lblNewLabel_3.setBounds(10, 80, 408, 359);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/cap.png")));
		lblNewLabel_4.setBounds(485, 53, 386, 359);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/bag.png")));
		lblNewLabel_5.setBounds(969, 53, 347, 359);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(444, 10, 8, 720);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(904, 10, 8, 720);
		frame.getContentPane().add(separator_1);
		
		JLabel lblMenBlackBelt = new JLabel("Men Black Belt");
		lblMenBlackBelt.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenBlackBelt.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenBlackBelt.setBounds(20, 422, 398, 41);
		frame.getContentPane().add(lblMenBlackBelt);
		
		JLabel lblMenNavyCap = new JLabel("Men Navy Cap");
		lblMenNavyCap.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenNavyCap.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenNavyCap.setBounds(473, 422, 398, 41);
		frame.getContentPane().add(lblMenNavyCap);
		
		JLabel lblMenBlueBackpack = new JLabel("Men Blue Backpack");
		lblMenBlueBackpack.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenBlueBackpack.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMenBlueBackpack.setBounds(961, 422, 398, 41);
		frame.getContentPane().add(lblMenBlueBackpack);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 728, 1369, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Color  :  Black");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(12, 496, 133, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Color  :  Navy");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(485, 496, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Color  :  Blue");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(964, 496, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Pattern  :  leather");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(10, 539, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Pattern  :  Stripe");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_1.setBounds(487, 539, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Pattern  :  Stripe");
		lblNewLabel_1_3_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3_2.setBounds(964, 539, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Price  :  \u20B9  750");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(12, 582, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Price  :  \u20B9 350");
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4_1.setBounds(485, 582, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Price  :  \u20B9 1499");
		lblNewLabel_1_4_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_4_2.setBounds(974, 582, 133, 33);
		frame.getContentPane().add(lblNewLabel_1_4_2);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(103, 652, 188, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(585, 652, 188, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_2.setBounds(1080, 652, 188, 41);
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
		btnNewButton_3.setBounds(20, 10, 96, 43);
		frame.getContentPane().add(btnNewButton_3);
	}

}
