package Bai4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter n = "); int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int []a = new int[n + 5];
        for(int i=0; i<n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
            list.add(a[i]);
        }
        int s = 0;
        for(int i=0; i<list.size(); i++) {
            s += isPrime((Integer) list.get(i)) ? (Integer) list.get(i) - i : (Integer) list.get(i);
        }

        System.out.println("S: " + s);


    }

    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i=2; i*i <= n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}
