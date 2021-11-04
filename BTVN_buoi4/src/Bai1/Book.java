package Bai1;
import java.util.*;

public class Book {
    static Scanner sc = new Scanner(System.in);

    private String code;
    private String nameBook;
    private String Company;
    private int page;
    private double price;

    public Book () {

    }

    public Book(String code, String nameBook, String company, int page, double price) {
        this.code = code;
        this.nameBook = nameBook;
        Company = company;
        this.page = page;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void Input() {
        System.out.print("Enter the code of book: "); this.code = sc.nextLine();
        System.out.print("Enter the name of book: "); this.nameBook = sc.nextLine();
        System.out.print("Enter the company of book: ");  this.Company = sc.nextLine();
        System.out.print("Enter the page of book: "); this.page = sc.nextInt();
        System.out.print("Enter the price of book: ");  this.price = sc.nextDouble(); sc.nextLine();
    }

    public void Output() {
        System.out.println("The code of book: " + this.code);
        System.out.println("The name of book: " + this.nameBook);
        System.out.println("The company of book: " + this.Company);
        System.out.println("The page of book: " + this.page);
        System.out.println("The price of book: " + this.price);
        System.out.println("========================================");
    }
}
