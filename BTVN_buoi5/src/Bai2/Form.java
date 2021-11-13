package Bai2;
import Bai1.Fridge;

import java.util.*;

public class Form {
    static Scanner sc = new Scanner(System.in);

    private String idForm;
    private String nameForm;
    private Date date;
    private ArrayList<Product> products = new ArrayList<>();
    private int number;
    public double getMoney(int number, double price) {
        return (double) number*price;
    }

    public Form() {

    }

    public Form(String idForm, String nameForm, Date date, ArrayList<Product> products) {
        this.idForm = idForm;
        this.nameForm = nameForm;
        this.date = date;
        this.products = products;
    }

    public String getIdForm() {
        return idForm;
    }

    public void setIdForm(String idForm) {
        this.idForm = idForm;
    }

    public String getNameForm() {
        return nameForm;
    }

    public void setNameForm(String nameForm) {
        this.nameForm = nameForm;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void Input() {
        System.out.print("Enter the id of form: "); this.idForm = sc.nextLine();
        System.out.print("Enter the name of form: "); this.nameForm = sc.nextLine();
        this.date = new Date();
        date.Input();
        System.out.print("Enter the number of product: "); this.number= sc.nextInt();
        for(int i=0; i<this.number; i++) {
            Product product = new Product();
            System.out.printf("\t The product " + (i+1) + "\n");
            product.Input();
            products.add(product);
        }
    }

    public void Output() {
        System.out.println("====================================== FORM ====================================== ");
        System.out.println("Id of form: " + this.idForm);
        System.out.println("Name of form: " + this.nameForm);
        date.Output();
        System.out.println("================================= LIST PRODUCTS ================================= ");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s", "idProduct", "nameProduct", "numberProduct", "priceProduct", "Money");
        System.out.println("");
        for(int i=0; i<this.number; i++) {
            products.get(i).Output();
            System.out.printf("%-20f\n", getMoney(products.get(i).getNumProduct(), products.get(i).getPriceProduct() ));
        }
    }
}
