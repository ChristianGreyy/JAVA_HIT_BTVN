package Bai1;
import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of book: ");
        n = sc.nextInt();
        Book[] a = new Book[n+5];
        for(int i=0; i<n; i++) {
            a[i] = new Book();
            System.out.println("Enter the book " + (i+1));
            a[i].Input();
        }
        System.out.println("============== LIST BOOK ==============");
        for(int i=0; i<n; i++) {
            System.out.println("Book "+ (i+1));
            a[i].Output();
        }

    }
}
