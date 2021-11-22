package Bai2;
import java.util.*;

public class Book extends Document {
    static Scanner sc = new Scanner(System.in);
    private int numberOfPage;
    private String author;

    public Book() {

    }

    public Book(int numberOfPage, String author) {
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public Book(int id, String name, String publisher, float price, int numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPage=" + numberOfPage +
                ", author='" + author + '\'' +
                '}';
    }

    public void input() {
        super.input();
        System.out.print("Enter the number of book: "); this.numberOfPage = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of author: "); this.author = sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.printf("%-20s%-20s\n", this.author, this.numberOfPage);
    }

}
