package Bai2;
import java.util.*;

public class RunMain {

    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        System.out.println("Enter the arr1");
        arr1.inputData();
        System.out.println("Enter the arr2");
        arr2.inputData();
        float avg1 = (float) arr1.Sum() / arr1.n;
        float avg2 = (float) arr2.Sum() / arr1.n;
        if(avg1 == avg2) {
            System.out.println("Bye");
        } else {
            System.out.println((avg1 > avg2)? "Array1":"Array2");
        }
    }

}
