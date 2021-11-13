package Bai2;
import java.util.*;

public class Product {
    static Scanner sc = new Scanner(System.in);

    private String idProduct;
    private String nameProduct;
    private int numProduct;
    private double priceProduct;
    public Product() {

    }

    public Product(String idProduct, String nameProduct, int numProduct, double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.numProduct = numProduct;
        this.priceProduct = priceProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getNumProduct() {
        return numProduct;
    }

    public void setNumProduct(int numProduct) {
        this.numProduct = numProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void Input() {
        System.out.print("Enter the id of product: "); this.idProduct = sc.nextLine();
        System.out.print("Enter the name of product: "); this.nameProduct = sc.nextLine();
        System.out.print("Enter the number of product: "); this.numProduct = sc.nextInt();
        System.out.print("Enter the price of product: "); this.priceProduct = sc.nextDouble();
        sc.nextLine();
    }

    public void Output() {
        System.out.printf("%-20s%-20s%-20d%-20f", this.idProduct, this.nameProduct, this.numProduct, this.priceProduct);
    }
}
