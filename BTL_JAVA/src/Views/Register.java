package Views;

import Models.Address;
import Models.Date;
import Models.Person;
import Models.User;
import Utils.IsValidEmail;
import Utils.IsValidPassword;
import java.util.Random;
import java.util.Scanner;

public class Register extends Person{
     private String accountRegister;
     private String passwordRegister;

     static Scanner sc = new Scanner(System.in);
     private String id;
     private String account;
     private String password;
     private String authority;
     private String classroom;
     private String department;
     private String oldSchool;

     public Register() {

     }

     public Register(String accountRegister, String passwordRegister, String id, String account, String password, String authority, String classroom, String department, String oldSchool) {
          this.accountRegister = accountRegister;
          this.passwordRegister = passwordRegister;
          this.id = id;
          this.account = account;
          this.password = password;
          this.authority = authority;
          this.classroom = classroom;
          this.department = department;
          this.oldSchool = oldSchool;
     }

     public Register(String firstName, String lastName, String fullName, Date date, Address address, String accountRegister, String passwordRegister, String id, String account, String password, String authority, String classroom, String department, String oldSchool) {
          super(firstName, lastName, fullName, date, address);
          this.accountRegister = accountRegister;
          this.passwordRegister = passwordRegister;
          this.id = id;
          this.account = account;
          this.password = password;
          this.authority = authority;
          this.classroom = classroom;
          this.department = department;
          this.oldSchool = oldSchool;
     }

     public String getAccountRegister() {
          return accountRegister;
     }

     public void setAccountRegister(String accountRegister) {
          this.accountRegister = accountRegister;
     }

     public String getPasswordRegister() {
          return passwordRegister;
     }

     public void setPasswordRegister(String passwordRegister) {
          this.passwordRegister = passwordRegister;
     }

     public static Scanner getSc() {
          return sc;
     }

     public static void setSc(Scanner sc) {
          Register.sc = sc;
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getAccount() {
          return account;
     }

     public void setAccount(String account) {
          this.account = account;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public String getAuthority() {
          return authority;
     }

     public void setAuthority(String authority) {
          this.authority = authority;
     }

     public String getClassroom() {
          return classroom;
     }

     public void setClassroom(String classroom) {
          this.classroom = classroom;
     }

     public String getDepartment() {
          return department;
     }

     public void setDepartment(String department) {
          this.department = department;
     }

     public String getOldSchool() {
          return oldSchool;
     }

     public void setOldSchool(String oldSchool) {
          this.oldSchool = oldSchool;
     }

     @Override
     public String toString() {
          return "Register{" +
                  "firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", fullName='" + fullName + '\'' +
                  ", date=" + date +
                  ", address=" + address +
                  ", accountRegister='" + accountRegister + '\'' +
                  ", passwordRegister='" + passwordRegister + '\'' +
                  ", id='" + id + '\'' +
                  ", account='" + account + '\'' +
                  ", password='" + password + '\'' +
                  ", authority='" + authority + '\'' +
                  ", classroom='" + classroom + '\'' +
                  ", department='" + department + '\'' +
                  ", oldSchool='" + oldSchool + '\'' +
                  '}';
     }

     ////////////////////////////

     public void ShowRegister() {
          System.out.println("============ ????ng K?? t??i kho???n ============");
          IsValidEmail isValidEmail = new IsValidEmail();
          IsValidPassword isValidPassword = new IsValidPassword();
          Random rd = new Random();
          double res = Math.random();
          this.id = String.valueOf(res);
          int cnt = 0;
          int cnt2 = 0;
          do {
               cnt++;
               if(cnt > 1) {
                    System.out.println("Vui l??ng nh???p email h???p l??? !!! ");
               }
               System.out.print("Nh???p t??i kho???n: "); this.account = sc.nextLine();

          } while(!isValidEmail.validate(this.account));
          do {
               cnt2++;
               if(cnt2 > 1) {
                    System.out.println("-Vui l??ng nh???p m???t kh???u h???p l??? h???p l??? !!! ");
                    System.out.println("-B???t bu???c ph???i c?? ??t nh???t 1 k?? t??? ch??? c??i vi???t th?????ng");
                    System.out.println("-B???t bu???c ph???i c?? ??t nh???t 1 ch??? s??? trong chu???i");
                    System.out.println("-B???t bu???c ph???i c?? ??t nh???t 1 k?? t??? ?????c bi???t trong c??c k?? t??? @#$%");
                    System.out.println("-B???t bu???c ph???i c?? ??t nh???t 1 k?? t??? ch??? in hoa");
                    System.out.println("-Gi???i h???n chi???u d??i c??? chu???i t??? 6 ?????n 30 k?? t???");
               }
               System.out.print("Nh???p m???t kh???u: "); this.password = sc.nextLine();
          } while(!isValidPassword.validate(this.password));
          boolean Check = this.authority.equalsIgnoreCase("student") || this.authority.equalsIgnoreCase("student") || this.authority.equalsIgnoreCase("student");
          int countAuthority = 0;
          do {
               countAuthority ++;
               if(countAuthority > 1) {
                    System.out.println("Vui l??ng nh???p ph??n quy???n ph?? h???p");
               }
               System.out.print("Nh???p ph??n quy???n (Student, Teacher, Admin): "); this.authority = sc.nextLine();

          } while(!Check);
          if(this.authority.equalsIgnoreCase("student")) {
               System.out.println("Nh???p t??n l???p: "); this.classroom = sc.nextLine();
               System.out.println("Nh???p t??n ng??nh: "); this.department = sc.nextLine();
               System.out.print("Nh???p tr?????ng THPT: "); this.oldSchool = sc.nextLine();
          }
          super.input();
          int isRobot = rd.nextInt(10) + 1;
          int check = 0;
          do {

               System.out.println("B???n c?? ph???i robot kh??ng?");
               System.out.println("M??: " + isRobot);
               System.out.print("Nh???p theo m?? tr??n: "); check = sc.nextInt();
          } while(check != isRobot);

          System.out.println("Ch??c m???ng b???n ???? ????ng k?? th??nh c??ng !!!!!!");
     }


}
