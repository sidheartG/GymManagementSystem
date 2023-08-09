package mainSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		setLocation(0,0);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\29f96ad197574aba36647a36af26c8ab.jpg");
		setIconImage(icon);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Niagara Engraved", Font.BOLD, 99));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(875, 113, 164, 75);
		contentPane.add(lblNewLabel_1);
		
		
		final JLabel lblNewLabel_2 = new JLabel("Incorrect Username or Password");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("AvantGarde Md BT", Font.BOLD, 18));
		lblNewLabel_2.setIcon(new ImageIcon(LoginPage.class.getResource("/images/close.png")));
		lblNewLabel_2.setBounds(811, 216, 307, 39);
		lblNewLabel_2.setVisible(false);
		contentPane.add(lblNewLabel_2);
		
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNewLabel_2.setVisible(false);
				if(txtUsername.getText().equals("Username"))
				{
					txtUsername.setText("");
					txtUsername.setForeground(Color.darkGray);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNewLabel_2.setVisible(false);
				if(txtUsername.getText().equals("")) {
					txtUsername.setText("Username");
					txtUsername.setForeground(Color.darkGray);
				}
			}
		});
		txtUsername.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtUsername.setForeground(SystemColor.controlShadow);
		txtUsername.setText("Username");
		txtUsername.setBackground(SystemColor.controlHighlight);
		txtUsername.setBounds(833, 273, 250, 31);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusGained(FocusEvent e) {
				lblNewLabel_2.setVisible(false);
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setText("");
					pwdPassword.setForeground(Color.darkGray);
				}
			}
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				lblNewLabel_2.setVisible(false);
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setText("Password");
					pwdPassword.setForeground(Color.darkGray);
				}
			}
		});
		pwdPassword.setColumns(10);
		pwdPassword.setForeground(SystemColor.controlShadow);
		pwdPassword.setText("Password");
		pwdPassword.setBackground(SystemColor.controlHighlight);
		pwdPassword.setFont(new Font("Century Gothic", Font.BOLD, 12));
		pwdPassword.setBounds(833, 323, 250, 31);
		contentPane.add(pwdPassword);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					pwdPassword.setEchoChar((char)0);
				}
				else {
					pwdPassword.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(833, 371, 164, 23);
		contentPane.add(chckbxNewCheckBox);
		
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(txtUsername.getText().equals("9131846541") && pwdPassword.getText().equals("adminsid")) {
					setVisible(false);
					new HomePage().setVisible(true);
				}
				else {
					lblNewLabel_2.setVisible(true);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(LoginPage.class.getResource("/images/login.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 100, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 25));
		btnNewButton.setBounds(833, 435, 250, 39);
		contentPane.add(btnNewButton);
		
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/images/exercise-weights-iron-dumbbell-with-extra-plates (2).jpg")));
		lblNewLabel.setBounds(0, 0, 1350, 729);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
