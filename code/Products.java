import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Products {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Products window = new Products();
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
	public Products() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1361, 751);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Products ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(90, 10, 1066, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 61, 1244, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Mens");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 92, 102, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 128, 75, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Shirts window = new Shirts();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
//		Connection con = getDetails.getcon();
		lblNewLabel_2.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/shirts.png")));
		lblNewLabel_2.setBounds(37, 175, 283, 408);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TShirts window = new TShirts();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
//		Connection con = getDetails.getcon();
		lblNewLabel_3.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/sudeepben/images/main/t-shirts.png")));
		lblNewLabel_3.setBounds(382, 175, 283, 408);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Jeans window = new Jeans();
				window.frame.setVisible(true);
				frame.dispose();
			}
			
		});
//		Connection con = getDetails.getcon();
		lblNewLabel_4.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/jeans.png")));
		lblNewLabel_4.setBounds(722, 175, 278, 408);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Accessories window = new Accessories();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
//		Connection con = getDetails.getcon();
		lblNewLabel_5.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/accssiors.png")));
		lblNewLabel_5.setBounds(1037, 175, 278, 408);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage window = new homepage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(16, 10, 96, 43);
		frame.getContentPane().add(btnNewButton);
	}
}
