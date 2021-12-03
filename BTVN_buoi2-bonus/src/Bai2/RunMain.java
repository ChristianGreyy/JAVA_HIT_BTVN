package Bai2;

import java.util.ArrayList;
import java.util.Collection;
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
        System.out.println("Max: " + list.stream().max(Integer::compare).get());
        System.out.println("Min: " + list.stream().max(Integer::compare).get());
        System.out.println("Sort: " + list.stream().sorted().collect(Collectors.toList()));

    }

    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a,b), c);
    }
}
