package Models;

import java.util.*;


public class Person  {
    static Scanner sc = new Scanner(System.in);

    protected String firstName;
    protected String lastName;
    protected String fullName;
    public Models.Date date;
    public Address address;

    public Person() {

    }

    public Person(String firstName, String lastName, String fullName, Date date, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.date = date;
        this.address = address;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Person.sc = sc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date=" + date +
                ", address=" + address +
                '}';
    }

    public void input() {
        System.out.print("Nhập tên: "); this.firstName = sc.nextLine();
        System.out.print("Nhập họ: "); this.lastName = sc.nextLine();
        this.fullName = this.lastName + " " + this.firstName;
        date = new Date();
        date.input();
        address = new Address();
        address.input();
    }


}
