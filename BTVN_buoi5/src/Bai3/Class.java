package Bai3;
import java.util.*;

public class Class {
    private String idClass;
    private String nameClass;
    private String dateOpenClass;
    private ArrayList<Student> students = new ArrayList<>();
    private int number;
    private String nameTeacher;

    public Class() {

    }

    public Class(String idClass, String nameClass, String dateOpenClass, ArrayList<Student> students, int number, String nameTeacher) {
        this.idClass = idClass;
        this.nameClass = nameClass;
        this.dateOpenClass = dateOpenClass;
        this.students = students;
        this.number = number;
        this.nameTeacher = nameTeacher;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getDateOpenClass() {
        return dateOpenClass;
    }

    public void setDateOpenClass(String dateOpenClass) {
        this.dateOpenClass = dateOpenClass;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }
}
