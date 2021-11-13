package Bai3;
import java.util.*;

public class Student extends People {
    private String idStudent;
    private String major;
    private int term;

    public  Student() {

    }

    public Student(String idStudent, String major, int term) {
        this.idStudent = idStudent;
        this.major = major;
        this.term = term;
    }

    public Student(String name, String date, String country, String idStudent, String major, int term) {
        super(name, date, country);
        this.idStudent = idStudent;
        this.major = major;
        this.term = term;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
