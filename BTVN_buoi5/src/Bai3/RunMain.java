package Bai3;
import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Class classes = new Class();
        String restore;
        int n;
        System.out.print("Enter the id of class: "); restore = sc.nextLine(); classes.setIdClass(restore);
        System.out.print("Enter the name of class: "); restore = sc.nextLine(); classes.setNameClass(restore);
        System.out.print("Enter the date open class: "); restore = sc.nextLine(); classes.setDateOpenClass(restore);
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("Enter the number of student: "); n = sc.nextInt();
        sc.nextLine();
        classes.setNumber(n);
        for(int i=0; i< classes.getNumber(); i++) {
            Student student = new Student();
            System.out.printf("\t Enter the student " + (i + 1) + "\n");
            student.Input();
            System.out.print("Enter the id of student: ");
            restore = sc.nextLine();
            student.setIdStudent(restore);
            System.out.print("Enter the major of student: ");
            restore = sc.nextLine();
            student.setMajor(restore);
            System.out.print("Enter the term of student: ");
            n = sc.nextInt();
            sc.nextLine();
            student.setTerm(n);
            students.add(student);
        }
        System.out.print("Enter the name of teacher: "); restore = sc.nextLine();
        classes.setNameTeacher(restore);
        classes.setStudents(students);
        Sort(classes);
        System.out.println("The id of class: " + classes.getIdClass());
        System.out.println("The name of class: " + classes.getNameClass());
        System.out.println("The date of class: " + classes.getDateOpenClass());
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "name", "date", "country", "idStudent", "major", "term");
        for(int i=0; i<classes.getNumber(); i++) {
            classes.getStudents().get(i).Output();
            System.out.printf("%-20s", classes.getStudents().get(i).getIdStudent());
            System.out.printf("%-20s", classes.getStudents().get(i).getMajor());
            System.out.printf("%-20s", classes.getStudents().get(i).getTerm());
            System.out.println("");
        }
        System.out.println("The name of teacher: " + classes.getNameTeacher());
        System.out.println("Number student study at k15: " + getNumberFifty(classes));

    }

    public static int getNumberFifty(Class classes) {
        int count = 0;
        for(int i=0; i<classes.getNumber(); i++) {
            if(classes.getStudents().get(i).getTerm() == 15) {
                count++;
            }
        }
        return count;
    }

    public static void Sort(Class classes) {
        for(int i=0; i<classes.getNumber() ; i++) {
            for (int j = i + 1; j < classes.getNumber(); j++) {
                if (classes.getStudents().get(i).getTerm() > classes.getStudents().get(j).getTerm()) {
                    Collections.swap(classes.getStudents(), i, j);
                }
            }
        }
    }

}
