package Models;

import java.util.*;
import java.io.*;
import java.lang.String;

public class User extends Person{

    private String id;
    private String account;
    private String password;
    private String authority;
    private String classroom;
    private String department;
    private String oldSchool;

    public User() {

    }

    public User(String id, String account, String password, String authority, String classroom, String department, String oldSchool) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.authority = authority;
        this.classroom = classroom;
        this.department = department;
        this.oldSchool = oldSchool;
    }

    public User(String firstName, String lastName, String fullName, Date date, Address address, String id, String account, String password, String authority) {
        super(firstName, lastName, fullName, date, address);
        this.id = id;
        this.account = account;
        this.password = password;
        this.authority = authority;
    }

    public User(String firstName, String lastName, String fullName, Date date, Address address, String id, String account, String password, String authority, String classroom, String department, String oldSchool) {
        super(firstName, lastName, fullName, date, address);
        this.id = id;
        this.account = account;
        this.password = password;
        this.authority = authority;
        this.classroom = classroom;
        this.department = department;
        this.oldSchool = oldSchool;
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
    public String   toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date=" + date +
                ", address=" + address +
                ", id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", authority='" + authority + '\'' +
                ", classroom='" + classroom + '\'' +
                ", department='" + department + '\'' +
                ", oldSchool='" + oldSchool + '\'' +
                '}';
    }

    public void writeStudentsFromFile(ArrayList<String> studentsString) {
        try {
            String filename = "E:/CODE_JAM/CODE__JAVA/JAVA__HIT/BTL_JAVA/src/Databases/User.txt";
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);
            String data ="";
            for(int i=0; i<studentsString.size(); i++) {
                data+=studentsString.get(i)+"//";
            }
            fw.write(data);
            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    public String readStudentsFromFile(){
        String data = "";
        try {
            File f = new File("E:/CODE_JAM/CODE__JAVA/JAVA__HIT/BTL_JAVA/src/Databases/User.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                data += line;
            }
            fr.close();
            br.close();
        } catch (Exception ex) {
            data=null;
        }
        return data;
    }

    public void save(){
        String students = readStudentsFromFile();
        String studentString = this.toString();
        if(!students.equals("")) {
            ArrayList<String> studentsString = new ArrayList<String>(Arrays.asList(students.split("//")));
            studentsString.add(studentString);
            writeStudentsFromFile(studentsString);
        } else {
            ArrayList<String> studentsString = new ArrayList<>();
            studentsString.add(studentString);
            writeStudentsFromFile(studentsString);
        }
    }

    public String findByID(String id, int number) {
        String students = readStudentsFromFile();
        String studentString = this.toString();
        ArrayList<String> studentsString = new ArrayList<String>(Arrays.asList(students.split("//")));


        for (int i = 0; i < studentsString.size(); i++) {
            ArrayList<String> data = new ArrayList<String>(Arrays.asList(studentsString.get(i).split(", ")));
            String res = data.get(0).replace("User{idStudent=", "");
            if (id.equals(res)) {
               if(number == 3) {
                   String request = data.get(3).replace("authority=", "");
                   request = request.replace("'", "");
                   return request;
               } if(number == 4) {
                   String request = data.get(4).replace("firstName=", "");
                   request = request.replace("'", "");
                   return request;
               } if(number == 5) {
                   String request = data.get(5).replace("lastName=", "");
                   request = request.replace("'", "");
                   return request;
               } if(number == 6) {
                   String request = data.get(6).replace("fullName=", "");
                   request = request.replace("'", "");
                   return request;
               } if(number == 7) {
                   String request = data.get(7).replace("date=Date{", "");
                   request = request.replace("'", "");
                   return request;
               } if(number == 8) {
                   String request = data.get(8).replace("month=", "");
                   request = request.replace("'", "");
                   return request;
               }
            }
        }
        return null;
    }


    public String findAccount(String accountLogin, String passwordLogin){
        String students = readStudentsFromFile();
        String studentString = this.toString();
        ArrayList<String> studentsString = new ArrayList<String>(Arrays.asList(students.split("//")));

        String restore1 = "";
        String restore2 = "";


        for (int i = 0; i < studentsString.size(); i++) {
            ArrayList<String> data = new ArrayList<String>(Arrays.asList(studentsString.get(i).split(", ")));
            restore1 = data.get(1).replace("'", "");
            restore1 = restore1.replace("account=", "");
            restore2 = data.get(2).replace("'", "");
            restore2 = restore2.replace("password=", "");
            String id = data.get(0).replace("User{idStudent=", "");
            if(accountLogin.equals(restore1) && passwordLogin.equals(restore2)) {
                return id;
            }
        }
        return null;
    }


}
