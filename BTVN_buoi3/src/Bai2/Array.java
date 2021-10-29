package Bai2;
import java.util.*;

public class Array {
    public static Scanner sc = new Scanner(System.in);
    public int n;
    public int[] a;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public Array() {
        this.n = 0;
        this.a = null;
    }

    public Array(int[] a, int n) {
        this.n = n;
        this.a = a;
    }

    public void inputData() {
        System.out.print("Enter the values of n = ");
        this.n = sc.nextInt();
        a = new int[n+5];
        for(int i=0; i<n; i++) {
            System.out.print("Enter the a[" + (i+1) +"] = ");
            a[i] = sc.nextInt();
        }
    }

    public void Show() {
        System.out.print("The array is inputed: ");
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    public int Sum() {
        int s = 0;
        for(int i=0; i<n; i++) {
            s+= a[i];
        }
        return s;
    }

    public void Filter(boolean flag) {
        if(flag) {
            System.out.print("Even elements in array: ");
            for(int i=0; i<n; i++) {
                if(a[i]%2 == 0) {
                    System.out.print(a[i] + " ");
                }
            }
        } else {
            System.out.print("Odd elements in array: ");
            for(int i=0; i<n; i++) {
                if(a[i]%2 != 0) {
                    System.out.print(a[i] + " ");
                }
            }
        }
        System.out.println(" ");
    }
}
