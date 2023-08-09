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
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.sql.*;
import cnnctPackage.ConnectionProvider;
public class AllMembers extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllMembers frame = new AllMembers();
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
	public AllMembers() {
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
		mnNewMenu.setForeground(SystemColor.textHighlight);
		mnNewMenu.setIcon(new ImageIcon(UpdateDeleteMember.class.getResource("/images/list of members.png")));
		mnNewMenu.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
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
		
		
		
		table_1 = new JTable();
		table_1.setFont(new Font("Arial", Font.PLAIN, 10));
		table_1.setBackground(Color.LIGHT_GRAY);
		table_1.setForeground(Color.BLACK);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Member ID", "Name", "Mobile Number", "Email", "Gender", "Father Name", "Mother Name", "Gym Time", "Aadhar Number", "Age", "Amount"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(60);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		table_1.getColumnModel().getColumn(3).setResizable(false);
		table_1.getColumnModel().getColumn(4).setResizable(false);
		table_1.getColumnModel().getColumn(5).setResizable(false);
		table_1.getColumnModel().getColumn(6).setResizable(false);
		table_1.getColumnModel().getColumn(7).setResizable(false);
		table_1.getColumnModel().getColumn(8).setResizable(false);
		table_1.getColumnModel().getColumn(9).setResizable(false);
		table_1.getColumnModel().getColumn(10).setResizable(false);
		
		table_1.getTableHeader().setEnabled(false);
		
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(0, 68, 1352, 663);
		contentPane.add(scrollPane);
		
		DefaultTableModel model = (DefaultTableModel)table_1.getModel();
		try {
			Connection con=ConnectionProvider.getCon();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from member");
			while(rs.next()) {
				model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(NewMember.class.getResource("/images/1537379200-intro-background.jpg")));
		lblNewLabel.setBounds(0, 0, 1352, 731);
		contentPane.add(lblNewLabel);
		
		
		
		
	}

}
