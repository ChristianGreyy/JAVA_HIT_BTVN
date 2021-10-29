package Bai1;
import java.util.*;


public class Person {

    private String name;
    private int age;
    public String gender;
    public String hobby;

    public Person() {
        this.name = "Trương Thành Hưng";
        this.age = 19;
        this.gender = "Male";
        this.hobby = "Code";
    }

    public Person(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\'' + ", hobby='" + hobby + '\'' + '}';
    }
}
