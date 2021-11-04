package Bai5;
import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("========= INTEGER =========");
        System.out.println(isPrime(3));
        System.out.println(isPrime(1234));
        System.out.println("========= LONG =========");
        System.out.println(isPrime(13L));
        System.out.println(isPrime(1000L));
        System.out.println("========= FLOAT =========");
        System.out.println(isPrime(7F));
        System.out.println(isPrime(10.4534F));
        System.out.println("========= DOUBLE =========");
        System.out.println(isPrime(13));
        System.out.println(isPrime(43430.4534D));
    }

    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i=2; i*i<=n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public static boolean isPrime(long n) {
        if(n < 2) return false;
        for(int i=2; i*i<=n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public static boolean isPrime(float n) {
        if (n == (int)n) {
            if(n<2) return false;
            for(int i=2; i*i<=n; i++) {
                if(n%i == 0) return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(double n) {
        if (n == (int)n) {
            if(n<2) return false;
            for(int i=2; i*i<=n; i++) {
                if(n%i == 0) return false;
            }
            return true;
        } else {
            return false;
        }
    }

}
