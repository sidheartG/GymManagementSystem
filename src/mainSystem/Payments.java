package mainSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import cnnctPackage.ConnectionProvider;

public class Payments extends JFrame {

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
	private JTable table_1;
	private JLabel lblNewLabel_1_2_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payments frame = new Payments();
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
	
	
	
	
	public Payments() {
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
		mnNewMenu_1.setForeground(SystemColor.textHighlight);
		mnNewMenu_1.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/payment.png")));
		mnNewMenu_1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Update & Delete");
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new UpdateDeleteMember().setVisible(true);
			}
		});
		
		mnNewMenu_2.setForeground(new Color(0, 0, 0));
		mnNewMenu_2.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/update & delete member.png")));
		mnNewMenu_2.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
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
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Member Id:");
		lblNewLabel_1.setForeground(new Color(143, 188, 143));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(31, 98, 110, 45);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(169, 107, 79, 35);
		contentPane.add(textField);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableDetails();
				int checkid=0;
				String id=textField.getText();
				String month=lblNewLabel_1_2_1.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs = st.executeQuery("select * from member where id='"+id+"'");
					while(rs.next()) {
						checkid=1;
						textField.setEditable(false);
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
						textField_4.setText(rs.getString(11));
						
					}
					if(checkid==0) {
						JOptionPane.showMessageDialog(null, "Invalid Member ID");
					}
					ResultSet rs1 = st.executeQuery("select * from payment inner join member where payment.month='"+month+"' and payment.id='"+id+"' and member.id='"+id+"'");
					while(rs1.next()) {
						btnNewButton.setVisible(false);
						JOptionPane.showMessageDialog(null, "Payment is already done for this month");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		btnSearch.setForeground(Color.ORANGE);
		btnSearch.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSearch.setBounds(286, 108, 125, 35);
		contentPane.add(btnSearch);
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(102, 206, 94, 27);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 248, 310, 27);
		textField_1.setEditable(false);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Mobile Number");
		lblNewLabel_1_1_3.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_3.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_3.setBounds(102, 322, 117, 27);
		contentPane.add(lblNewLabel_1_1_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 359, 310, 27);
		textField_2.setEditable(false);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(102, 424, 117, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(102, 471, 310, 27);
		textField_3.setEditable(false);
		contentPane.add(textField_3);
		
		
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Amount to pay");
		lblNewLabel_1_1_1_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(102, 530, 117, 27);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(102, 574, 310, 27);
		contentPane.add(textField_4);
		
		
		
		btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				String month=lblNewLabel_1_2_1.getText();
				String amount=textField_4.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps=con.prepareStatement("insert into payment values(?,?,?)");
					ps.setString(1, id);
					ps.setString(2, month);
					ps.setString(3, amount);
					ps.executeUpdate();
					tableDetails();
					JOptionPane.showMessageDialog(null, "Successfully Updated");
					setVisible(false);
					new Payments().setVisible(true);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(Payments.class.getResource("/images/save.png")));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.setBounds(109, 670, 110, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Payments().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Payments.class.getResource("/images/reset.png")));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_1.setBounds(290, 671, 110, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Date:");
		lblNewLabel_1_2.setForeground(new Color(143, 188, 143));
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(31, 153, 59, 45);
		contentPane.add(lblNewLabel_1_2);
		
		lblNewLabel_1_2_1 = new JLabel("mm-dd-yyyy");
		lblNewLabel_1_2_1.setForeground(Color.RED);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(88, 153, 125, 45);
		contentPane.add(lblNewLabel_1_2_1);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Arial", Font.PLAIN, 10));
		table_1.setBackground(Color.LIGHT_GRAY);
		table_1.setForeground(Color.BLACK);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Month", "Amount"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		
		table_1.getTableHeader().setEnabled(false);
		
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(478, 98, 864, 540);
		contentPane.add(scrollPane);
		date();
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(NewMember.class.getResource("/images/1537379200-intro-background.jpg")));
		lblNewLabel.setBounds(0, 0, 1352, 731);
		contentPane.add(lblNewLabel);
	}
	
	public void tableDetails() {
		DefaultTableModel dtm = (DefaultTableModel)table_1.getModel();
		dtm.setRowCount(0);
		String id=textField.getText();
		try {
			Connection con=ConnectionProvider.getCon();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from payment where id='"+id+"'");
			while(rs.next()) {
				dtm.addRow(new Object[] {rs.getString(2),rs.getString(3)});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void date() {
		SimpleDateFormat dFormat=new SimpleDateFormat("MM-YYYY");
		Date date=new Date();
		String month=dFormat.format(date);
		lblNewLabel_1_2_1.setText(month);
		
		
	}
}
