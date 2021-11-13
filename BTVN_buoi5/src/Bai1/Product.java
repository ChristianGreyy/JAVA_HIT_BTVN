package Bai1;
import java.util.*;

public class Product {
    static Scanner sc = new Scanner(System.in);

    private String idProduct;
    private String nameProduct;
    private String brandProduct;
    private String dateProduct;

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

    public String getBrandProduct() {
        return brandProduct;
    }

    public void setBrandProduct(String brandProduct) {
        this.brandProduct = brandProduct;
    }

    public String getDateProduct() {
        return dateProduct;
    }

    public void setDateProduct(String dateProduct) {
        this.dateProduct = dateProduct;
    }

    public Product() {

    }

    public Product(String idProduct, String nameProduct, String brandProduct, String dateProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.brandProduct = brandProduct;
        this.dateProduct = dateProduct;
    }

    public void Input() {
        System.out.print("Enter the id of product: "); this.idProduct = sc.nextLine();
        System.out.print("Enter the name of product: "); this.nameProduct = sc.nextLine();
        System.out.print("Enter the brand of product: "); this.brandProduct = sc.nextLine();
        System.out.print("Enter the date of product: "); this.dateProduct = sc.nextLine();
    }

    public void Output() {
        System.out.printf("%-20s%-20s%-20s%-20s", this.idProduct, this.nameProduct, this.brandProduct, this.dateProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", brandProduct='" + brandProduct + '\'' +
                ", dateProduct='" + dateProduct + '\'' +
                '}';
    }
}
