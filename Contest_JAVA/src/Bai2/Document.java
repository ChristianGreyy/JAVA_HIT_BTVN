package Bai2;
import java.util.*;

import java.util.Scanner;

public class Document {
    static Scanner sc = new Scanner(System.in);
    private static int idALl = 0;

    private int id;
    private String name;
    private String publisher;
    private float price;

    public Document() {
        idALl++;
    }

    public Document(int id, String name, String publisher, float price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public static int getIdALl() {
        return idALl;
    }

    public static void setIdALl(int idALl) {
        Document.idALl = idALl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }

    public void input() {
        this.id = idALl;
        System.out.print("Enter the name: "); this.name = sc.nextLine();
        System.out.print("Enter the publisher: "); this.publisher = sc.nextLine();
        System.out.print("Enter the price: "); this.price = sc.nextFloat();
        sc.nextLine();
    }

    public void output() {
        System.out.printf("%-20s%-20s%-20s%-20f", this.id, this.name, this.publisher, this.price);
    }

}
