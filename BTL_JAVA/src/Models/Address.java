package Models;
import java.util.*;

public class Address {
    Scanner sc = new Scanner(System.in);

    private String ward;
    private String commune;
    private String city;

    public Address() {
        this.ward = "Lê Hông Phong";
        this.commune = "Thái Bình";
        this.city = "Thái Bình";
    }


    public Address(String ward, String commune, String city) {
        this.ward = ward;
        this.commune = commune;
        this.city = city;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input() {
        System.out.print("Tên phường: "); this.ward = sc.nextLine();
        System.out.print("Tên xã: "); this.commune = sc.nextLine();
        System.out.print("Tên thành phố: "); this.city = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Address{" +
                "ward='" + ward + '\'' +
                ", commune='" + commune + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
