import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;

public class homepage {

	JFrame frame;
	private JTextField txtSearchProducts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
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
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1276, 659);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				}
		
		});
		lblNewLabel_1.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Icons/main/search_16px.png")));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 11));
		lblNewLabel_1.setBounds(954, 66, 27, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 609, 1129, -597);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cart window = new Cart();
				window.frame.setVisible(true);
				
				
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Icons/main/shopping_cart_48px.png")));
		lblNewLabel_3.setBounds(1126, 57, 57, 42);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtSearchProducts = new JTextField();
		txtSearchProducts.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		txtSearchProducts.setBounds(837, 66, 106, 33);
		frame.getContentPane().add(txtSearchProducts);
		txtSearchProducts.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Icons/main/home_48px.png")));
		lblNewLabel_4.setBounds(25, 55, 48, 42);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Home");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 94, 70, 18);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Sign In  / Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login l= new login();
				l.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton.setBounds(1109, 22, 140, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(255, 248, 220));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyAccount window = new MyAccount();
				window.frame.setVisible(true);
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Icons/main/user_48px.png")));
		lblNewLabel.setBounds(1193, 57, 56, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Cart");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cart window = new Cart();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(1128, 97, 55, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Profile");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(1193, 97, 45, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 114, 1239, 8);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setIcon(new ImageIcon(getDetails.geticon("https://raw.githubusercontent.com/Umesh9966/Images/main/best-mens-fashion.jpg")));
		lblNewLabel_7.setBounds(10, 122, 1239, 509);
		frame.getContentPane().add(lblNewLabel_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 609, 1129, -477);
		frame.getContentPane().add(scrollPane_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Products");
		lblNewLabel_8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Products window = new Products();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel_8_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_8_1.setBounds(90, 68, 88, 44);
		frame.getContentPane().add(lblNewLabel_8_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(90, 96, 88, 2);
		frame.getContentPane().add(separator_2);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
