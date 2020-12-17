package MVC_Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import WithoutWB.Quiz;

public class LoginController {

	private LoginView myView;

	private LoginModel myModel;

	public LoginController(LoginView v) {
		this.myView = v;
		this.myModel = new LoginModel();

		this.myView.getBtnLogin().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clickLogin();

			}
		});

		this.myView.getBtnCancel().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickCancel();
			}
		});
	}

	protected void clickLogin() {

		String userName = this.myView.getTextField().getText();
		String pass = this.myView.getPasswordField().getText();

		System.out.println(this.myView.getTextField().getText());
		System.out.println(this.myView.getPasswordField().getText());

		if (userName.equals(this.myModel.getUsername()) && pass.equals(this.myModel.getPassword())) {
			System.out.println("Username and password match");

			JOptionPane.showMessageDialog(myView, "Login Success");
			// JOptionPane.showConfirmDialog(myView, "Confirm");
			
			Quiz quiz = new Quiz();

		}
	}

	protected void clickCancel() {

	}

}
