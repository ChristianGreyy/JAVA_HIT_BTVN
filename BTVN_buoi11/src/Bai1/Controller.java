package Bai1;
import java.util.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.io.File;



public class Controller {
    static Scanner sc = new Scanner(System.in);

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    static String REGEX_USERNAME = "^[a-zA-Z0-9]{6,}$";
    static String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
    static String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    static String REGEX_PHONE = "^[0-9\\-\\+]{9,15}$";

    public void signUpAccount() {

        Account Account = new Account();
        // account
        Pattern pattern = Pattern.compile(REGEX_USERNAME);
        String res;
        do {
//            sc.nextLine();
            System.out.print("Enter the username: ");
            res = sc.nextLine();
            Account.setUsername(res);

        } while(!pattern.matcher(Account.getUsername()).find());
        Pattern pattern2 = Pattern.compile(REGEX_PASSWORD);
        // password
        do {
            System.out.print("Enter the password: ");
            res = sc.nextLine();
            Account.setPassword(res);

        } while(!pattern2.matcher(Account.getPassword()).find());
        // email
        Pattern pattern3 = Pattern.compile(REGEX_EMAIL);
        do {
            System.out.print("Enter the email: ");
            res = sc.nextLine();
            Account.setEmail(res);

        } while(!pattern3.matcher(Account.getEmail()).find());
//         phone
        Pattern pattern4 = Pattern.compile(REGEX_PHONE);
        do {
            System.out.print("Enter the phone: ");
            res = sc.nextLine();
            Account.setPhone(res);

        } while(!pattern4.matcher(Account.getPhone()).find());

        System.out.print("Enter fullname: "); res = sc.nextLine();
        Account.setFullName(res);

        Date date = new Date();

        Account.setCreateAt(simpleDateFormat.format(date));
        Account.save(true);
        System.out.println(Account);
    }

    public int loginAccount(String username, String password) {

        try {
            Scanner scanner = new Scanner(Paths.get("ACC.DAT"));
            while(scanner.hasNext()) {
                String account = scanner.nextLine();
                String[] accounts = account.split("\\|");
                String usernameString = accounts[2].split("\'")[1];
                System.out.println(usernameString);
                if(username.equals(usernameString)) {
                    String passwordString = accounts[3].split("\'")[1];
                    if(password.equals(passwordString)) {
                        return 1;
                    }
                    return 2;
                }
            }
            return 3;
        }catch(IOException e){
            e.printStackTrace();
            return 0;
        }

    }

    public void ShowAccount(String username, String password) {

        try {
            Scanner scanner = new Scanner(Paths.get("ACC.DAT"));
            while(scanner.hasNext()) {
                String account = scanner.nextLine();
                String[] accounts = account.split("\\|");
                String usernameString = accounts[2].split("\'")[1];
                System.out.println(usernameString);
                if(username.equals(usernameString)) {
                    String passwordString = accounts[3].split("\'")[1];
                    if(password.equals(passwordString)) {
                        String fullnameString = accounts[1].split("\'")[1];
                        String emailString = accounts[4].split("\'")[1];
                        String phoneString = accounts[5].split("\'")[1];
                        String createAtString = accounts[6].split("\'")[1];

                        System.out.println("INFORMATION ACCOUNT");
                        System.out.println("Username: " + usernameString);
                        System.out.println("Fullname: " + fullnameString);
                        System.out.println("Email: " + emailString);
                        System.out.println("Phone: " + phoneString);
                        System.out.println("CreatedAT: " + createAtString);
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }


    public void updatePassword(String username, String password) {
        ArrayList<Account> accountsList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(Paths.get("ACC.DAT"));
            while(scanner.hasNext()) {
                String account = scanner.nextLine();
                String[] accounts = account.split("\\|");
                String usernameString = accounts[2].split("\'")[1];
                long idString = Long.parseLong(accounts[0].split("\\=")[1].trim());
                String fullnameString = accounts[1].split("\'")[1];
                String emailString = accounts[4].split("\'")[1];
                String phoneString = accounts[5].split("\'")[1];
                String createAtString = accounts[6].split("\'")[1];
                String passwordReplace = accounts[3].split("\'")[1];
                if(username.equals(usernameString)) {
                    if (password.equals(passwordReplace)) {
                        String passwordString2;
                        System.out.print("Enter the password update: "); passwordReplace = sc.nextLine();
                        do {
                            System.out.print("Enter repassword: ");
                            passwordString2 = sc.nextLine();
                        } while(!passwordString2.equals(passwordReplace));

                    }
                }
                Account accountString = new Account(idString, fullnameString, usernameString, passwordReplace, emailString, phoneString, createAtString);
                accountsList.add(accountString);

            }

            File file = new File("ACC.DAT");
            if(file.exists()) {
                file.delete();
            }

            for(int i=0; i<accountsList.size(); i++) {
                accountsList.get(i).save(true);
            }
            System.out.println("Password updated!!");
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public void sortByUsername() {
        ArrayList<Account> accountsList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(Paths.get("ACC.DAT"));
            while(scanner.hasNext()) {
                String account = scanner.nextLine();
                String[] accounts = account.split("\\|");
                String usernameString = accounts[2].split("\'")[1];
                long idString = Long.parseLong(accounts[0].split("\\=")[1].trim());
                String passwordString = accounts[3].split("\'")[1];
                String fullnameString = accounts[1].split("\'")[1];
                String emailString = accounts[4].split("\'")[1];
                String phoneString = accounts[5].split("\'")[1];
                String createAtString = accounts[6].split("\'")[1];


                Account accountString = new Account(idString, fullnameString, usernameString, passwordString, emailString, phoneString, createAtString);
                accountsList.add(accountString);

            }

            Collections.sort(accountsList);
            for (Account person : accountsList) {
                System.out.println(person.toString());
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }




}
