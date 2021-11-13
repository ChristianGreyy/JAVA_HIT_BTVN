package Bai1;
import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        double min = 0;
        System.out.print("Enter the number of fridge: ");
        int n = sc.nextInt();
        ArrayList<Fridge> fridges = new ArrayList<>();
        for(int i=0; i<n; i++) {
            System.out.printf("\t The fridge " + (i+1) + "\n");
            Fridge fridge = new Fridge();
            fridge.Input();
            fridges.add(fridge);
            if(fridges.get(i).getBrandProduct().equalsIgnoreCase("Electrolux")) {
                count++;
            }
            min = fridges.get(i).getPrice();
        }
        System.out.println("===================================");
        if(count == 0) {
            System.out.println("=========== Have no electrolux fridge ============");
        } else {
            System.out.println("================= The list fridges ===============");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s", "The id", "The name", "The brand", "The date", "The wattage", "The price" );
            System.out.println("");
            for(int i=0; i<n; i++) {
                if(fridges.get(i).getBrandProduct().equalsIgnoreCase("Electrolux")) {
                    fridges.get(i).Output();
                }
                min = Math.min(min, fridges.get(i).getPrice());
            }
        }
        System.out.println("================= The min fridges ===============");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s", "The id", "The name", "The brand", "The date", "The wattage", "The price" );
        System.out.println("");
        for(int i=0; i<n; i++) {
            if(fridges.get(i).getPrice() == min) {
                fridges.get(i).Output();
            }
        }
    }

}
