package Bai3;

import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Guns DiepBeDe = new Guns();
        Guns DoanXinhGai = new Guns();
        Random rd = new Random();
        int count = 0;
        boolean first = true;
        while(true) {
            int x = rd.nextInt(10) + 1;
            int y = rd.nextInt(10) + 1;
            if(count == 3 || first) {
                first = false;
                DiepBeDe.Load(x);
                DoanXinhGai.Load(x);
                count = 0;
            }
            DiepBeDe.Shoot(x);
            DoanXinhGai.Shoot(y);
            if(DiepBeDe.ammoNumber == 0) {
                System.out.println("DoanXinhGai win");
                System.out.println("DiepBeDe lose");
                break;
            }
            if(DoanXinhGai.ammoNumber == 0) {
                System.out.println("DiepBeDe win");
                System.out.println("DoanXinhGai lose");
                break;
            }
            count ++;
        }
    }
}
