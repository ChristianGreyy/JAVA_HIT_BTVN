package Utils;
import java.io.*;
import java.lang.String;

public class Cookies {
    public void saveCookies(String cookie) {
        try {
            String filename = "E:/CODE_JAM/CODE__JAVA/JAVA__HIT/BTL_JAVA/src/Databases/cookies.txt";
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);
            fw.write(cookie);
            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    public String getCookies() {
        String data = "";
        try {
            File f = new File("E:/CODE_JAM/CODE__JAVA/JAVA__HIT/BTL_JAVA/src/Databases/cookies.txt");
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

}
