package Routes;
import Models.User;
import Controllers.HomeController;

public class HomeRouter {
    private HomeController homeController = new HomeController();

    public void GettingStart() {
        homeController.getHomeStart();
    }

    public void Home() {
        homeController.getHome();
    }

    public void Home__SurveySheet() {
        homeController.getHomeSurveySheet();
    }

}
