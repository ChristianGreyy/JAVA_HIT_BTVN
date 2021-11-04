package Bai4;
import java.util.*;

public class Room {
    Scanner sc = new Scanner(System.in);

    private int idRoom;
    private String nameRoom;
    private double area;
    private Manager manager;
    private Product[] product;
    private int n;

    void Input() {
        System.out.print("Enter the id of room: "); this.idRoom = sc.nextInt(); sc.nextLine();
        System.out.print("Enter the name of room: "); this.nameRoom = sc.nextLine();
        System.out.print("Enter the area of room: "); this.area = sc.nextDouble();
        this.manager = new Manager();
        manager.Input();
        System.out.print("Enter the number of machine: "); this.n = sc.nextInt();
        product = new Product[this.n+5];
        for(int i=0; i<n; i++) {
            product[i] = new Product();
            System.out.println("Enter the product " + (i+1));
            product[i].Input();
        }
    }

    void Output() {
        System.out.println("The id of room: " + this.idRoom);
        System.out.println("The name of room: " + this.nameRoom);
        System.out.println("The area of room: " + this.area);
        manager.Output();
        System.out.println("================= LIST MACHINE ===============");
        for(int i=0; i<n; i++) {
            System.out.println("PRODUCT " + (i + 1));
            product[i].Output();
            System.out.println("-----------------------");
        }
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Room() {

    }

    public Room(int idRoom, String nameRoom, double area, Manager manager, Product[] product, int n) {
        this.idRoom = idRoom;
        this.nameRoom = nameRoom;
        this.area = area;
        this.manager = manager;
        this.product = product;
        this.n = n;
    }
}
