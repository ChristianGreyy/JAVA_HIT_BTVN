package Controllers;


import Models.User;

public class UserController {
    public static void main(String[] args) {

        User student = new User();
        student.input();
        student.save();

    }
}
