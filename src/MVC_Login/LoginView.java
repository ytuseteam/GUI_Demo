package MVC_Login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {
	
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JButton btnCancel;
	

	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		
		
		setSize(500,500);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblWelcomeFromJava = new JLabel("Welcome from Java Gui Quiz");
		lblWelcomeFromJava.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWelcomeFromJava.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeFromJava.setBounds(0, 23, 482, 47);
		getContentPane().add(lblWelcomeFromJava);
		
		JLabel lblUsername = new JLabel("Username : ");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblUsername.setBounds(37, 121, 92, 32);
		getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(155, 121, 214, 32);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPassword.setBounds(37, 180, 92, 32);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(155, 180, 214, 32);
		getContentPane().add(passwordField);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Sitka Display", Font.PLAIN, 18));
		btnCancel.setBounds(272, 241, 97, 32);
		getContentPane().add(btnCancel);
		
		 btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setFont(new Font("Sitka Display", Font.PLAIN, 18));
		btnLogin.setBounds(155, 241, 97, 32);
		getContentPane().add(btnLogin);
		
	}


	public JTextField getTextField() {
		return textField;
	}


	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	public JPasswordField getPasswordField() {
		return passwordField;
	}


	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}


	public JButton getBtnLogin() {
		return btnLogin;
	}


	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}


	public JButton getBtnCancel() {
		return btnCancel;
	}


	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}
}
