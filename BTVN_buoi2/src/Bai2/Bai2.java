package Bai2;

import java.util.Scanner;
import java.lang.Math;


public class Bai2 {

    static int n;
    static int[] a;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Your chosse = ");
            int choose = sc.nextInt();
            if(choose == 1) {
                Input();
            } else if(choose == 2) {
                Output();
            } else if(choose == 3) {
                Insert();
            } else if(choose == 4) {
                Delete();
            } else if(choose == 5) {
                Inverse();
            } else if(choose == 6) {
                showOne();
            } else if(choose == 7) {
                totalPrime();
            } else if(choose == 8) {
                System.out.print("End");
                break;
            }
        }
    }
    public static void Insert() {
        System.out.print("Enter the value need to be inserted = ");
        int x = sc.nextInt();
        System.out.print("Enter the position need to be inserted = ");
        int k = sc.nextInt();

        for (int i = n; i >= k; i--) {
            a[i] = a[i - 1];
        }
        a[k - 1] = x;
        n++;
    }

    public static void Delete() {
        System.out.print("Enter the position need to be deleted = ");
        int k = sc.nextInt();

        for (int i = k-1; i < n; i++) {
            a[i] = a[i+1];
        }
        n--;
    }

    public static void Input() {
        System.out.print("Enter value of n = ");
        n = sc.nextInt();
        a = new int[n + 5];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    public static void Output() {
        System.out.println("The array is inputed");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(' ');
    }

    public static void Inverse() {
        System.out.println("The array is inverse");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    public static void showOne() {
        System.out.println("a[1] = " + a[1]);
        System.out.println("Elements is divisible by a[1]");
        for (int i = 0; i < n; i++) {
            if(a[i] != a[1] && a[i]%a[1] == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println(" ");
    }

    public static int isPrime(int n) {
        if(n<2) return 0;
        for(int i=2; i*i<=n;i++) {
            if(n%i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void totalPrime() {
        int s = 0;
        for(int i=0; i<n;i ++) {
            if(isPrime(a[i]) == 1) {
                s+= a[i];
            }
        }
        System.out.println("Sum of primes = " + s);
    }

}
