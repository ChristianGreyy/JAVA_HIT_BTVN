package Bai3;

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
        int choose = 0;

        do {

            System.out.println("1. Show");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4. Reverse");
            System.out.println("5. SomeThing");
            System.out.println("6. Break");
            System.out.print("Enter your choose: "); choose = sc.nextInt();

            switch (choose) {
                case 1:
                    show(list);
                    break;
                case 2:
                    addById(list);
                    break;
                case 3:
                    deleteById(list);
                    break;
                case 4:
                    reverse(list);
                    break;
                case 5:
                    doSomeThing(list);
                    break;
                case 6:
                    System.out.println("Ended!!");
                    break;
                default:
                    System.out.println("Invalid choose");
            }

        } while(choose != 6);

    }

    public static void show(ArrayList list) {
        System.out.print("Array: ");
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");
    }

    public static void addById(ArrayList list) {
        System.out.print("Enter the k = "); int k = sc.nextInt();
        if(list.size() < 1) {
            System.out.println("Id is invalid");
        } else {
            list.add(0);
            for (int i = list.size() - 1; i > k - 1; i--) {
                list.set(i, list.get(i - 1));
            }
            System.out.print("Enter the value: ");
            int res = sc.nextInt();
            list.set(k - 1, res);
            System.out.println("Updated!!");
        }
    }

    public static void deleteById(ArrayList list) {
        System.out.print("Enter the k = "); int k = sc.nextInt();
        boolean any = true;
        for(int i=0; i<list.size(); i++) {
            if(i == k-1) {
                any = false;
                list.remove(i);
            }
        }
        if(any) {
            System.out.println("Id is invalid");
        } else {
            System.out.println("Updated!!");
        }
    }

    public static void reverse(ArrayList list) {
        for(int i=list.size() -1 ; i >= 0; i--) {
            System.out.println(list.get(i) + " ");
        }
    }

    public static void doSomeThing(ArrayList list) {

        if(list.size() < 1) {
            System.out.println("No element a[1]");
        } else {
            System.out.println("a[1]: " + list.get(1));
            Integer res = (Integer) list.get(1);
            list.forEach(item -> {
                if((Integer) item % res == 0) {
                    System.out.print(item + " ");
                }
            });
        }
        System.out.println(" ");
    }


}
