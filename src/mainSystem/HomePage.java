package mainSystem;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class HomePage extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		setLocation(0, 0);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\29f96ad197574aba36647a36af26c8ab.jpg");
		setIconImage(icon);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu_5 = new JMenu("Home");
		mnNewMenu_5.setForeground(SystemColor.textHighlight);
		mnNewMenu_5.setBackground(new Color(100, 149, 237));
		mnNewMenu_5.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		mnNewMenu_5.setIcon(new ImageIcon(HomePage.class.getResource("/images/house.png")));
		mnNewMenu_5.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu_5);

		JMenu mnNewMember = new JMenu("New Member");
		mnNewMember.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new NewMember().setVisible(true);
			}
		});
		mnNewMember.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		mnNewMember.setIcon(new ImageIcon(HomePage.class.getResource("/images/new member.png")));
		menuBar.add(mnNewMember);

		JMenu mnNewMenu = new JMenu("All Members");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new AllMembers().setVisible(true);
			}
		});
		mnNewMenu.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		mnNewMenu.setIcon(new ImageIcon(HomePage.class.getResource("/images/list of members.png")));
		menuBar.add(mnNewMenu);

		JMenu mnNewMenu_1 = new JMenu("Payments");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Payments().setVisible(true);
			}
		});
		mnNewMenu_1.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		mnNewMenu_1.setIcon(new ImageIcon(HomePage.class.getResource("/images/payment.png")));
		menuBar.add(mnNewMenu_1);

		JMenu mnNewMenu_2 = new JMenu("Update & Delete");
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new UpdateDeleteMember().setVisible(true);
			}
		});
		mnNewMenu_2.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		mnNewMenu_2.setIcon(new ImageIcon(HomePage.class.getResource("/images/update & delete member.png")));
		menuBar.add(mnNewMenu_2);

		JMenu mnNewMenu_3 = new JMenu("Logout");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "Select",
						JOptionPane.YES_NO_OPTION);
				if (a == 0) {
					setVisible(false);
					new LoginPage().setVisible(true);
				}
			}
		});
		mnNewMenu_3.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		mnNewMenu_3.setIcon(new ImageIcon(HomePage.class.getResource("/images/logout.png")));
		menuBar.add(mnNewMenu_3);

		JMenu mnNewMenu_4 = new JMenu("Exit");
		mnNewMenu_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Select",
						JOptionPane.YES_NO_OPTION);
				if (a == 0) {
					System.exit(0);
				}
			}
		});
		mnNewMenu_4.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		mnNewMenu_4.setIcon(new ImageIcon(HomePage.class.getResource("/images/exit.png")));
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 1, 1);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Hyper Gym");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.YELLOW);
		lblNewLabel_1_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 65));
		lblNewLabel_1_1.setBorder(new LineBorder(new Color(204, 0, 0)));
		lblNewLabel_1_1.setBounds(457, 390, 458, 106);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2 = new JLabel("H");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		lblNewLabel_2.setBounds(606, 222, 141, 158);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("I");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.ORANGE);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		lblNewLabel_2_1.setBounds(584, 240, 93, 125);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("I");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.ORANGE);
		lblNewLabel_2_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		lblNewLabel_2_2.setBounds(675, 240, 93, 125);
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("/images/1537379200-intro-background.jpg")));
		lblNewLabel.setBounds(0, 0, 1350, 663);
		contentPane.add(lblNewLabel);

	}
}
