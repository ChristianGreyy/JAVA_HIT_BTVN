package Bai3;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.lang.Character;
public class Bai3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("s = ");
        String s = sc.nextLine();
        boolean any = true;
        int sum = 0;
        int n = 0;
        for(int i=0; i<s.length(); i++) {
            char res = s.charAt(i);
            if(res >= '0' && res <= '9') {
                any = false;
                n++;
                sum += Character.getNumericValue(res);
            }
        }

        if(any) {
            System.out.println("false");
        } else {
            System.out.println("true");
            System.out.print("Average = " + (float) sum/n);
        }


    }
}
