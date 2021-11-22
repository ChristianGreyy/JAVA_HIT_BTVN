package Models;
import java.util.*;

public class Date {
    static Scanner sc = new Scanner(System.in);

    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

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

    public void input() {
        System.out.print("Ngày sinh: "); this.day = sc.nextInt();
        System.out.print("Tháng sinh: "); this.month = sc.nextInt();
        System.out.print("Năm sinh: "); this.year = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
