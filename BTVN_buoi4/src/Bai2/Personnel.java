package Bai2;
import java.util.*;

public class Personnel {
    static Scanner sc = new Scanner(System.in);

    private String codePersonnel;
    private String namePersonnel;
    private Date date;

    public String getCodePersonnel() {
        return codePersonnel;
    }

    public void setCodePersonnel(String codePersonnel) {
        this.codePersonnel = codePersonnel;
    }

    public String getNamePersonnel() {
        return namePersonnel;
    }

    public void setNamePersonnel(String namePersonnel) {
        this.namePersonnel = namePersonnel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Personnel() {

    }

    public Personnel(String codePersonnel, String namePersonnel, Date date) {
        this.codePersonnel = codePersonnel;
        this.namePersonnel = namePersonnel;
        this.date = date;
    }

    public void Input() {
        this.date = new Date();
        System.out.print("Enter the code of personnel: "); this.codePersonnel = sc.nextLine();
        System.out.print("Enter the name of personnel: "); this.namePersonnel = sc.nextLine();
        this.date.Input();
    }

    public void Output() {
        System.out.println("The code of personnel: " + this.codePersonnel);
        System.out.println("The name of personnel: " + this.namePersonnel);
        this.date.Output();
    }
}
