package Routes;
import Controllers.LoginController;

public class LoginRouter {
    LoginController loginController = new LoginController();

    public void Login() {
        loginController.Login();
    }
    public void LoginPage() {
        loginController.chooseLogin();
    }
}
