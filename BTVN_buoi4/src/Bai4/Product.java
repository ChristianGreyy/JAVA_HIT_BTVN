package Bai4;
import java.util.*;

public class Product {
    Scanner sc = new Scanner(System.in);
    private int idProduct;
    private String typeProduct;
    private String qualityProduct;

    public void Input() {
        System.out.print("Enter the id of product: "); this.idProduct = sc.nextInt(); sc.nextLine();
        System.out.print("Enter the id type product: "); this.typeProduct = sc.nextLine();
        System.out.print("Enter the quality of product: "); this.qualityProduct = sc.nextLine();
    }

    public void Output() {
        System.out.println("The id of product: " + this.idProduct);
        System.out.println("The type of product: " + this.typeProduct);
        System.out.println("The quality of product: " + this.qualityProduct);
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public String getQualityProduct() {
        return qualityProduct;
    }

    public void setQualityProduct(String qualityProduct) {
        this.qualityProduct = qualityProduct;
    }

    public Product() {

    }

    public Product(int idProduct, String typeProduct, String qualityProduct) {
        this.idProduct = idProduct;
        this.typeProduct = typeProduct;
        this.qualityProduct = qualityProduct;
    }
}


