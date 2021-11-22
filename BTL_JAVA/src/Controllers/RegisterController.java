package Controllers;
import Models.*;
import Utils.Cookies;
import Views.*;

public class RegisterController {
    public void register() {
        Cookies cookies = new Cookies();
        Register register = new Register();
        register.ShowRegister();
        if(register.getAuthority().equalsIgnoreCase("Student")) {
            User user = new User(register.getFirstName(), register.getLastName(), register.getFullName(), register.date, register.address, register.getId(), register.getAccount(), register.getPassword(), register.getAuthority(), register.getClassroom(), register.getDepartment(), register.getOldSchool());
            user.save();
        }
//        user.date = new Date();
//        user.address = new Address();
//        user.date.setDay(register.date.getDay());
//        user.date.setMonth(register.date.getMonth());
//        user.date.setYear(register.date.getYear());
//        user.address.setCity(register.address.getCity());
//        user.address.setCommune(register.address.getCommune());
//        user.address.setWard(register.address.getWard());

        }
}
