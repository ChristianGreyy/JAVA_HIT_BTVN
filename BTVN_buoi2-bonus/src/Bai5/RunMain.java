package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string: "); String s = sc.nextLine();
        int res = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count ++;
                res += Character.getNumericValue(s.charAt(i));
            }
        }
        if(count == 0) {
            System.out.println("String don't  include integer");
        } else {
            System.out.println((float) res/count);
        }


    }

}
