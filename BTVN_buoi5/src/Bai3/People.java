package Bai3;
import java.util.*;

public class People {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private String date;
    private String country;

    public People() {

    }

    public People(String name, String date, String country) {
        this.name = name;
        this.date = date;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void Input() {
        System.out.print("Enter the name: "); this.name = sc.nextLine();
        System.out.print("Enter the date: "); this.date = sc.nextLine();
        System.out.print("Enter the country: "); this.country = sc.nextLine();
    }

    public void Output() {
        System.out.printf("%-20s%-20s%-20s", this.name, this.date, this.country);
    }
}
