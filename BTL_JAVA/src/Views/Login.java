package Views;
import java.util.*;
import Routes.*;

public class Login {
    static Scanner sc = new Scanner(System.in);
    private LoginRouter loginRouter = new LoginRouter();
    private RegisterRouter registerRouter = new RegisterRouter();

    private String accountLogin;
    private String passwordtLogin;

    public String getAccountLogin() {
        return accountLogin;
    }

    public void setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
    }

    public String getPasswordtLogin() {
        return passwordtLogin;
    }

    public void setPasswordtLogin(String passwordtLogin) {
        this.passwordtLogin = passwordtLogin;
    }

    public void showPageLogin() {
        int choose;

        do {
            System.out.println("----------------------Trường đại học công nghiệp Hà Nội----------------------");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("3. Thoát khỏi trang");
            System.out.printf("Vui lòng chọn: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    loginRouter.Login();
                    break;
                case 2:
                    registerRouter.Register();
                    break;
                case 3:
                    System.out.println("Đã thoát khỏi trang");
                    break;
                default:
                    System.out.println("Vui lòng chọn lựa chọn phù hợp!");
            }
        } while(choose!=3);

    }

    public void showLogin() {
        System.out.println("================ Đăng nhập ================");
        System.out.print("Nhập tài khoản: "); this.accountLogin = sc.nextLine();
        System.out.print("Nhập mật khẩu: "); this.passwordtLogin = sc.nextLine();
    }
}
