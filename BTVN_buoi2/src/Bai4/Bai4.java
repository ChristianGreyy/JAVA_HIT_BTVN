package Bai4;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.lang.Character;

public class Bai4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("s = ");
        String s = sc.nextLine();
        s=s.replaceAll("[0-9]","");
        s=s.replaceAll(" +", " ");
        s = s.trim();
        String ans = "";
        int n = s.length() ;
        int check = 0;
        ans += Character.toUpperCase(s.charAt(0));
        for(int i=0; i<n; i++) {
            if(i != 0) {
                if(check == 1) {
                    ans += Character.toUpperCase(s.charAt(i));
                    check = 0;
                } else {
                    if(s.charAt(i) == ' ') {
                        check = 1;
                        ans += s.charAt(i);
                    } else {
                        ans += Character.toLowerCase(s.charAt(i));
                    }
                }
            }
        }
        System.out.println(ans);


    }
}
