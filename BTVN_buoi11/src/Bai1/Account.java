package Bai1;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;


public class Account implements Comparable<Account>{
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;

    static Scanner sc = new Scanner(System.in);
    static  private long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String createAt;

    public Account() {
         this.id ++;
    }

    public Account(long id, String fullName, String username, String password, String email, String phone, String createAt) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                " | fullName='" + fullName + '\'' +
                " | username='" + username + '\'' +
                " | password='" + password + '\'' +
                " | email='" + email + '\'' +
                " | phone='" + phone + '\'' +
                " | createAt='" + createAt + '\'' +
                '}';
    }

    public void save(Boolean check) {
        try {
            fileWriter = new FileWriter("ACC.DAT", check);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        }catch(IOException e){
            e.printStackTrace();
        }

        printWriter.println(this);

        printWriter.close();
//        bufferedWriter.close();
//        fileWriter.close();


    }

    @Override
    public int compareTo(Account p) {
        return this.username.compareTo(p.username);
    }

}
