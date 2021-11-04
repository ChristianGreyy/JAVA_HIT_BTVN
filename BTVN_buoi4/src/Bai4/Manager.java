package Bai4;
import java.util.*;

public class Manager {
    Scanner sc = new Scanner(System.in);
    private int idManager;
    private String nameManager;

    void Input() {
        System.out.print("Enter the id of manager: "); this.idManager = sc.nextInt(); sc.nextLine();
        System.out.print("Enter the name of manager: "); this.nameManager = sc.nextLine();
    }

    void Output() {
        System.out.println("The id of manager: " + this.idManager);
        System.out.println("The name of manager: " + this.nameManager);
    }

    public int getIdManager() {
        return idManager;
    }

    public void setIdManager(int idManager) {
        this.idManager = idManager;
    }

    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public Manager() {

    }

    public Manager(int idManager, String nameManager) {
        this.idManager = idManager;
        this.nameManager = nameManager;
    }
}
