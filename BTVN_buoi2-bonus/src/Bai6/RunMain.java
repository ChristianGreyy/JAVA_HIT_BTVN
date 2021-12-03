package Bai6;

import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string: "); String s = sc.nextLine();
        s= s.trim();
        s=s.replaceAll("[0-9]","");
        s=s.replaceAll(" +", " ");
        String res = "";
        res += Character.toUpperCase(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i-1) == ' ' && s.charAt(i) != ' ' ) {
                res += (Character.toUpperCase(s.charAt(i)));
            } else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

}
