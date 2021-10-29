package Bai1;
import java.util.*;

public class RunMain {
    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person();
        b.setName("ChristianGrey");
        b.setAge(27);
        b.setGender("male");
        b.setHobby("Code");
        System.out.println(a);
        System.out.println("Person{" + "name='" + b.getName() + '\'' + ", age=" + b.getAge() + ", gender='" + b.getGender() + '\'' + ", hobby='" + b.getHobby() + '\'' + '}');
    }
}
