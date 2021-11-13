package Bai2;
import java.util.*;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<Form> form = new ArrayList<>();
        Form f = new Form();
        f.Input();
        form.add(f);
        form.get(0).Output();
    }
}
