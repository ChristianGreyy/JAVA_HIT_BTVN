package Controllers;
import Views.Home;
import Models.User;
import Utils.Cookies;

public class HomeController {
    private Home home = new Home();


    public void getHomeStart() {
        User user = new User();
        Cookies cookies = new Cookies();
        String fullname = user.findByID(cookies.getCookies(), 6);
        home.showHomeStart(fullname);
    }

    public void getHome() {
        home.showHome();
    }

    public void getHomeSurveySheet() {
        User user = new User();
        Cookies cookies = new Cookies();
        String id = cookies.getCookies();
        String fullname = user.findByID(cookies.getCookies(), 6);
        home.showHome_SurveySheet(id, fullname);
    }
}
