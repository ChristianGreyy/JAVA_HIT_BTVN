package Bai1;
import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("a= ");  int a = sc.nextInt();
        System.out.print("b= ");  int b = sc.nextInt();
        System.out.print("c= ");  int c = sc.nextInt();
        System.out.println("Max: " + max(a,b,c));
    }

    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a,b), c);
    }
}
