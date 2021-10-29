package Bai3;
import java.util.*;

public class Guns {
    public String weaponName;
    public int ammoNumber;
    public void Load(int x) {
        this.ammoNumber += x;
    }
    public void Shoot(int x) {
        if(this.ammoNumber == 0) {
            System.out.println("No more bullet");
        } else {
            if(this.ammoNumber >= x) {
                this.ammoNumber -= x;
            }
        }
    }

    public Guns() {
        this.ammoNumber = 100;
    }

    public Guns(String weaponName ,int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}
