package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.*;
import java.nio.file.Paths;


public class RunMain {
    static Scanner sc = new Scanner(System.in);

    static Controller AccountController = new Controller();
    static List<Account> Accounts = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("1. Create new account.\n" +
                "2. Login to an existing account.\n" +
                "3. Sort accounts by username.\n" +
                "4. Exit.\n");

        int choose;
        do {
            System.out.print("Enter your shoose: ");
            choose = sc.nextInt();
            switch(choose) {
                case 1:
                    create();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    sortAccountByUserName();
                    break;
                case 4:
                    break;
            }

        } while(choose != 4);
    }

    static void create() {
        System.out.println("======== SIGN UP ========");
        AccountController.signUpAccount();

    }

    static void login() {
        System.out.println("====== LOGIN ======");
        System.out.print("Enter the username: ");
        sc.nextLine();
        String username; username = sc.nextLine();
        System.out.print("Enter the password: ");
        String password; password = sc.nextLine();

        int isLogin = AccountController.loginAccount(username, password);
        if(isLogin == 1) {
            System.out.println("Login successfully");

            System.out.println("1. Show info.\n" +
                    "2. Change password.\n");

            int choose = 0;
            System.out.print("Enter your choose account: ");
            choose = sc.nextInt();
            if(choose == 1) {
                AccountController.ShowAccount(username, password);
            } else {
                AccountController.updatePassword(username, password);
            }

        } else if(isLogin == 2) {
            System.out.println("Wrong password");
        } else if(isLogin == 3){
            System.out.println("Invalid username");
        } else {
            System.out.println("Error server");
        }
    }

    static void sortAccountByUserName() {
        System.out.println("SORT BY USERNAME");
        AccountController.sortByUsername();
    }
}

