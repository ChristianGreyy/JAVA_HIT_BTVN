package Routes;
import Utils.Cookies;

import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);

    static Cookies cookies = new Cookies();

    static LoginRouter loginRouter = new LoginRouter();
    static HomeRouter homeRouter = new HomeRouter();

    public static void main(String[] args) {

        if(cookies.getCookies().equals("")) {
            loginRouter.LoginPage();
        } else {
            int choose;

            do{
                homeRouter.GettingStart();
                System.out.println("Vui lòng chọn các lựa chọn trên");
                choose = sc.nextInt();
                switch (choose){
                    case 1 :
                        homeRouter.Home();
                        break;
                    case 2:

                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:

                        break;
                    case 7:
                        break;
                    case 8:
                        System.out.println("Chương trình kết thúc");
                        break;
                    default:
                        System.out.println("Lựa chọn không tồn tại!!!");
                }
            } while (choose != 8);
        }

    }
}
