package Bai2;
import java.util.*;

public class Date {
    static Scanner sc = new Scanner(System.in);

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date() {

    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void Input() {
        System.out.print("Enter the day: "); this.day = sc.nextInt();
        System.out.print("Enter the month: "); this.month = sc.nextInt();
        System.out.print("Enter the year: "); this.year = sc.nextInt();
    }
    public void Output() {
        System.out.println("The Date: " + this.day + "/" +this.month + "/" + this.year);
    }
}
