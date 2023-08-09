package mainSystem;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cnnctPackage.ConnectionProvider;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class NewMember extends JFrame {

	private JPanel contentPane;
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
					NewMember frame = new NewMember();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public NewMember() {
	
			
		
		setBounds(new Rectangle(0, 0, 831, 549));
		setLocation(new Point(175, 100));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		setLocation(0,0);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\29f96ad197574aba36647a36af26c8ab.jpg");
		setIconImage(icon);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Member Id:");
		lblNewLabel_1.setForeground(new Color(143, 188, 143));
		lblNewLabel_1.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 20));
		lblNewLabel_1.setBounds(29, 11, 110, 45);
		contentPane.add(lblNewLabel_1);
		
		final JLabel lblNewLabel_1_1_10 = new JLabel("00");
		lblNewLabel_1_1_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1_10.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 20));
		lblNewLabel_1_1_10.setBounds(149, 20, 29, 27);
		contentPane.add(lblNewLabel_1_1_10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(133, 67, 94, 27);
		contentPane.add(lblNewLabel_1_1);
		
		
		textField = new JTextField();
		textField.setBounds(133, 105, 310, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_1.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(133, 258, 117, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 200, 310, 27);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Father's Name");
		lblNewLabel_1_1_2.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_2.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1_2.setBounds(133, 361, 117, 27);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 296, 310, 27);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Mobile Number");
		lblNewLabel_1_1_3.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_3.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1_3.setBounds(133, 162, 117, 27);
		contentPane.add(lblNewLabel_1_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 399, 310, 27);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Gender");
		lblNewLabel_1_1_4.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_4.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1_4.setBounds(133, 465, 94, 27);
		contentPane.add(lblNewLabel_1_1_4);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.BLUE);
		comboBox.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(133, 503, 187, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Age");
		lblNewLabel_1_1_5.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_5.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1_5.setBounds(899, 67, 94, 27);
		contentPane.add(lblNewLabel_1_1_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(899, 105, 310, 27);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("Mother's Name");
		lblNewLabel_1_1_6.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_6.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1_6.setBounds(899, 162, 125, 27);
		contentPane.add(lblNewLabel_1_1_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(899, 200, 310, 27);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1_7 = new JLabel("Gym Timing");
		lblNewLabel_1_1_7.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_7.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1_7.setBounds(899, 465, 94, 27);
		contentPane.add(lblNewLabel_1_1_7);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		comboBox_1.setForeground(Color.BLUE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"05:00 AM - 10:00 AM", "04:00 PM - 10:00 PM"}));
		comboBox_1.setBounds(899, 503, 187, 22);
		contentPane.add(comboBox_1);
		
		
		JLabel lblNewLabel_1_1_8 = new JLabel("Aadhar Number");
		lblNewLabel_1_1_8.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_8.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1_8.setBounds(899, 258, 125, 27);
		contentPane.add(lblNewLabel_1_1_8);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(899, 296, 310, 27);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_1_9 = new JLabel("Amount to Pay/Month");
		lblNewLabel_1_1_9.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_9.setFont(new Font("AvantGarde Bk BT", Font.BOLD, 16));
		lblNewLabel_1_1_9.setBounds(899, 361, 169, 27);
		contentPane.add(lblNewLabel_1_1_9);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(899, 399, 310, 27);
		contentPane.add(textField_7);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = lblNewLabel_1_1_10.getText();
				String name = textField.getText();
				String mobileNumber = textField_1.getText();
				String email = textField_2.getText();
				String gender = (String) comboBox.getSelectedItem();
				String fatherName = textField_3.getText();
				String motherName = textField_5.getText();
				String gymTime = (String) comboBox_1.getSelectedItem();
				String aadharNumber = textField_6.getText();
				String age = textField_4.getText();
				String amount = textField_7.getText();
				
				try {
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("insert into member values(?,?,?,?,?,?,?,?,?,?,?)");
					ps.setString(1, id);
					ps.setString(2, name);
					ps.setString(3, mobileNumber);
					ps.setString(4, email);
					ps.setString(5, gender);
					ps.setString(6, fatherName);
					ps.setString(7, motherName);
					ps.setString(8, gymTime);
					ps.setString(9, aadharNumber);
					ps.setString(10, age);
					ps.setString(11, amount);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Successfully Saved");
					setVisible(false);
					new NewMember().setVisible(true);
					
				} catch (Exception e1) {
				
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(NewMember.class.getResource("/images/save.png")));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("AvantGarde Md BT", Font.BOLD, 16));
		btnNewButton.setBounds(526, 593, 110, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new NewMember().setVisible(true);;
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(NewMember.class.getResource("/images/reset.png")));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("AvantGarde Md BT", Font.BOLD, 15));
		btnNewButton_1.setBounds(704, 593, 110, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(NewMember.class.getResource("/images/1537379200-intro-background.jpg")));
		lblNewLabel.setBounds(0, 0, 1350, 663);
		contentPane.add(lblNewLabel);
		
		
		

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_5 = new JMenu("Home");
		mnNewMenu_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new HomePage().setVisible(true);
			}
		});
		mnNewMenu_5.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		mnNewMenu_5.setIcon(new ImageIcon(NewMember.class.getResource("/images/house.png")));
		
		menuBar.add(mnNewMenu_5);

		JMenu mnNewMember = new JMenu("New Member");
		mnNewMember.setForeground(SystemColor.textHighlight);
		mnNewMember.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
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
				new UpdateDeleteMember().setVisible(true);;
				
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
		mnNewMenu_3.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
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
		
		try {
			int id = 1;
			String str1 = String.valueOf(id);
			lblNewLabel_1_1_10.setText(str1);
			Connection con = ConnectionProvider.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select max(id) from member");
			while(rs.next()) {
				id = rs.getInt(1);
				id=id+1;
				String str = String.valueOf(id);
				lblNewLabel_1_1_10.setText(str);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}
}
