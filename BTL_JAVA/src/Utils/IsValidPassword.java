package Utils;

public class IsValidPassword {
    public boolean validate(String password) {
        String valid = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        return password.matches(valid);
    }
}
