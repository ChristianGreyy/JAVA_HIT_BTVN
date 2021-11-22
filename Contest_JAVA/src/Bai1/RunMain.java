package Bai1;
import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập 1 chuỗi: ");
        String s = sc.nextLine();
        int countNumber = 0;
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            char res = s.charAt(i);
            if(res >= '0' && res <= '9') {
                countNumber++;
                sum += Character.getNumericValue(res);
            }
        }
        int ans =1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)<='9' && s.charAt(i)>='1' && sum%Character.getNumericValue(s.charAt(i))==0){
                ans*=Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println("Number: " + countNumber);
        System.out.println("Volume: " + ans);
    }
}
