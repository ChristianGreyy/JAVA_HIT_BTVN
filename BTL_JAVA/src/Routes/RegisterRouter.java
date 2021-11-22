package Routes;
import Controllers.RegisterController;

public class RegisterRouter {
    public void Register() {
        RegisterController registerController = new RegisterController();
        registerController.register();
    }
}
