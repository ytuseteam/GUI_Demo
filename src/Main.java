import MVC_Login.LoginController;
import MVC_Login.LoginView;
import WithoutWB.Quiz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LoginView v = new LoginView();
		v.setVisible(true);
		new LoginController(v);
	}

}
