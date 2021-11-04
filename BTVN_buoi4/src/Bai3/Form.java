package Bai3;
import java.util.*;

public class Form {
    Scanner sc = new Scanner(System.in);
    private int idForm;
    private Product[] p;
    private int n;

    public void Input() {
        System.out.print("Enter the id of form: "); this.idForm = sc.nextInt();
        System.out.print("Enter the number of product: "); this.n = sc.nextInt();
        p = new Product[this.n+5];
        for(int i=0; i<n; i++) {
            p[i] = new Product();
            System.out.println("Enter the product " + (i + 1));
            p[i].Input();
        }
    }

    public void Output() {
        double sum = 0;
        System.out.println("============ THE LIST PRODUCT ============");
        for(int i=0; i<n; i++) {
            System.out.println("BOOK" + (i+1));
            p[i].Output();
            sum += p[i].getPriceProduct();
        }
        System.out.println("=============================");
        System.out.println("Sum of price of form: " + sum);
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public Product[] getP() {
        return p;
    }

    public void setP(Product[] p) {
        this.p = p;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Form() {

    }

    public Form(int idForm, Product[] p, int n) {
        this.idForm = idForm;
        this.p = p;
        this.n = n;
    }
}
