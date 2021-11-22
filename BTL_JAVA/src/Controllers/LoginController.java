package Controllers;
import Views.Login;
import Models.User;
import Utils.Cookies;

public class LoginController {
    public void Login() {
        Login login = new Login();
        User user = new User();
        Cookies cookies = new Cookies();

        login.showLogin();

        String Id = user.findAccount(login.getAccountLogin(), login.getPasswordtLogin());
        System.out.println(Id);
        if(Id != null) {
            cookies.saveCookies(Id);
        } else {
            System.out.println("Bạn đã nhập sai tài khoản hoặc mật khẩu. Vui lòng nhập lại!!");
        }
        System.out.println(cookies.getCookies());
    }

    public void chooseLogin () {
        Login login = new Login();
        login.showPageLogin();
    }

}
