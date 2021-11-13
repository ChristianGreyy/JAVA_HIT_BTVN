package Bai1;
import java.util.*;

public class Fridge extends Product {
    static Scanner sc = new Scanner(System.in);

    private float wattage;
    private float price;

    public Fridge() {

    }

    public Fridge(float wattage, float price) {
        this.wattage = wattage;
        this.price = price;
    }

    public Fridge(String idProduct, String nameProduct, String brandProduct, String dateProduct, float wattage, float price) {
        super(idProduct, nameProduct, brandProduct, dateProduct);
        this.wattage = wattage;
        this.price = price;
    }

    public float getWattage() {
        return wattage;
    }

    public void setWattage(float wattage) {
        this.wattage = wattage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void Input() {
        super.Input();
        System.out.print("Enter the wattage of product: "); this.wattage = sc.nextFloat();
        System.out.print("Enter the price of product: "); this.price = sc.nextFloat();
        sc.nextLine();
    }

    public void Output() {
        super.Output();
        System.out.printf("%-20f%-20f\n", this.wattage, this.price);

    }
}
