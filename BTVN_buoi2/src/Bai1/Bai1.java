package Bai1;
import java.util.Scanner;
import java.lang.Math;


public class Bai1 {

    public static int Max(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = "); int a= sc.nextInt();
        System.out.print("a = "); int b= sc.nextInt();
        System.out.print("a = "); int c= sc.nextInt();

        System.out.println("Max of three number = " + Max(a,b,c));

    }
}
