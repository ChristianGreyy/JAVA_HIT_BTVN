package Bai3;
import java.util.*;

public class Product {
    static Scanner sc = new Scanner(System.in);
    private int idProduct;
    private String nameProduct;
    private double priceProduct;

    public Product() {

    }

    public Product(int idProduct, String nameProduct, double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void Input() {
        System.out.print("Enter the id of product: "); this.idProduct = sc.nextInt(); sc.nextLine();
        System.out.print("Enter the name of product: "); this.nameProduct = sc.nextLine();
        System.out.print("Ente the price of product: "); this.priceProduct = sc.nextDouble();
    }

    public void Output() {
        System.out.println("The id of product: " + this.idProduct);
        System.out.println("The name of product: " + this.nameProduct);
        System.out.println("The price of product: " + this.priceProduct);
    }
}
