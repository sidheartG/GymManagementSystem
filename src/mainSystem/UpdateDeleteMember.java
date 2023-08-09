package mainSystem;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.SampleModel;
import java.sql.*;
import cnnctPackage.ConnectionProvider;

public class UpdateDeleteMember extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateDeleteMember frame = new UpdateDeleteMember();
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
	public UpdateDeleteMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		setLocation(0, 0);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\29f96ad197574aba36647a36af26c8ab.jpg");
		setIconImage(icon);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("Member Id:");
		lblNewLabel_1.setForeground(new Color(143, 188, 143));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 111, 110, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(133, 165, 94, 27);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(133, 203, 310, 27);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Mobile Number");
		lblNewLabel_1_1_3.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_3.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_3.setBounds(133, 260, 117, 27);
		contentPane.add(lblNewLabel_1_1_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 298, 310, 27);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(133, 356, 117, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 394, 310, 27);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Father's Name");
		lblNewLabel_1_1_2.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_2.setBounds(133, 459, 117, 27);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 497, 310, 27);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Gender");
		lblNewLabel_1_1_4.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_4.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_4.setBounds(133, 563, 94, 27);
		contentPane.add(lblNewLabel_1_1_4);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(133, 606, 310, 27);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Age");
		lblNewLabel_1_1_5.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_5.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_5.setBounds(899, 165, 94, 27);
		contentPane.add(lblNewLabel_1_1_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(899, 203, 310, 27);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("Mother's Name");
		lblNewLabel_1_1_6.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_6.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_6.setBounds(899, 260, 125, 27);
		contentPane.add(lblNewLabel_1_1_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(899, 298, 310, 27);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1_8 = new JLabel("Aadhar Number");
		lblNewLabel_1_1_8.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_8.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_8.setBounds(899, 356, 125, 27);
		contentPane.add(lblNewLabel_1_1_8);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(899, 394, 310, 27);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_1_9 = new JLabel("Amount to Pay/Month");
		lblNewLabel_1_1_9.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_9.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_9.setBounds(899, 459, 169, 27);
		contentPane.add(lblNewLabel_1_1_9);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(899, 497, 310, 27);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1_1_7 = new JLabel("Gym Timing");
		lblNewLabel_1_1_7.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_7.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_7.setBounds(899, 563, 94, 27);
		contentPane.add(lblNewLabel_1_1_7);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(899, 610, 310, 27);
		contentPane.add(textField_10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(148, 120, 79, 35);
		contentPane.add(textField_8);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new UpdateDeleteMember().setVisible(true);;
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/reset.png")));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_1.setBounds(853, 674, 110, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField_8.getText();
				String name = textField.getText();
				String mobilenumber = textField_1.getText();
				String email = textField_2.getText();
				String fathername = textField_3.getText();
				String mothername = textField_5.getText();
				String aadharnumber = textField_6.getText();
				String age = textField_4.getText();
				String amount = textField_7.getText();
				try {
					Connection con=ConnectionProvider.getCon();
					PreparedStatement ps=con.prepareStatement("update member set name=?,mobilenumber=?,email=?,fathername=?,mothername=?,aadharnumber=?,age=?,amount=? where id=?");
					ps.setString(1, name);
					ps.setString(2, mobilenumber);
					ps.setString(3, email);
					ps.setString(4, fathername);
					ps.setString(5, mothername);
					ps.setString(6, aadharnumber);
					ps.setString(7, age);
					ps.setString(8, amount);
					ps.setString(9, id);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Successfullly Updated");
					setVisible(false);
					new UpdateDeleteMember().setVisible(true);
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
			}
		});
		btnUpdate.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/save.png")));
		btnUpdate.setForeground(new Color(0, 128, 0));
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 16));
		btnUpdate.setBounds(364, 673, 125, 36);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to delete","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					String id=textField_8.getText();
					try {
						Connection con = ConnectionProvider.getCon();
						Statement st=con.createStatement();
						st.executeUpdate("delete from member where id='"+id+"'");
						st.executeUpdate("delete from payment where id='"+id+"'");
						JOptionPane.showMessageDialog(null, "Successfully Deleted");
						setVisible(false);
						new UpdateDeleteMember().setVisible(true);
						
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1);
					}
				}
			}
		});
		btnDelete.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/delete.png")));
		btnDelete.setForeground(Color.BLUE);
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 16));
		btnDelete.setBounds(611, 674, 125, 35);
		contentPane.add(btnDelete);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int checkid=0;
				String id=textField_8.getText();
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from member where id='"+id+"'");
					while(rs.next()) {
						checkid=1;
						textField_8.setEditable(false);
						textField.setText(rs.getString(2));
						textField_1.setText(rs.getString(3));
						textField_2.setText(rs.getString(4));
						textField_9.setText(rs.getString(5));
						textField_9.setEditable(false);
						textField_3.setText(rs.getString(6));
						textField_5.setText(rs.getString(7));
						textField_10.setText(rs.getString(8)); 
						textField_10.setEditable(false);
						textField_6.setText(rs.getString(9));
						textField_4.setText(rs.getString(10));
						textField_7.setText(rs.getString(11));
						
							
					}
					if(checkid==0)
						JOptionPane.showMessageDialog(null, "Member ID does not exist");
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnSearch.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/search.png")));
		btnSearch.setForeground(Color.ORANGE);
		btnSearch.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSearch.setBounds(265, 121, 125, 35);
		contentPane.add(btnSearch);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1352, 70);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_5 = new JMenu("Home");
		mnNewMenu_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new HomePage().setVisible(true);
			}
		});
		mnNewMenu_5.setForeground(new Color(0, 0, 0));
		mnNewMenu_5.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/house.png")));
		mnNewMenu_5.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMember = new JMenu("New Member");
		mnNewMember.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new NewMember().setVisible(true);
			}
		});
		mnNewMember.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/new member.png")));
		mnNewMember.setForeground(new Color(0, 0, 0));
		mnNewMember.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		menuBar.add(mnNewMember);
		
		JMenu mnNewMenu = new JMenu("All Members");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new AllMembers().setVisible(true);
			}
		});
		mnNewMenu.setForeground(new Color(0, 0, 0));
		mnNewMenu.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/list of members.png")));
		mnNewMenu.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Payments");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Payments().setVisible(true);
			}
		});
		mnNewMenu_1.setForeground(new Color(0, 0, 0));
		mnNewMenu_1.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/payment.png")));
		mnNewMenu_1.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Update & Delete");
		mnNewMenu_2.setForeground(SystemColor.textHighlight);
		mnNewMenu_2.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/update & delete member.png")));
		mnNewMenu_2.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
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
		mnNewMenu_3.setForeground(new Color(0, 0, 0));
		mnNewMenu_3.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/logout.png")));
		mnNewMenu_3.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
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
		mnNewMenu_4.setForeground(new Color(0, 0, 0));
		mnNewMenu_4.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/exit.png")));
		mnNewMenu_4.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(NewMember.class.getResource("/images/1537379200-intro-background.jpg")));
		lblNewLabel.setBounds(0, 0, 1352, 731);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
}
