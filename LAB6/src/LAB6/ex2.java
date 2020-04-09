package LAB6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {

    static Scanner sc = new Scanner(System.in);

    public static List<String> getData(){
        FileInputStream fin = null;
        List<String> arr = new ArrayList<String>();
        try{
            fin = new FileInputStream("parole.txt");
            int ch;
            int ct = 0;
            StringBuilder sb = new StringBuilder();
            while((ch = fin.read()) != -1){
                if((char)ch != '\n'){
                    sb.append((char)ch);
                }
                else{
                    String str = sb.toString();
                    String result = str.substring(0, str.length() - 1);
                    arr.add(result);
                    sb.delete(0, sb.length());
                }
            }
            String str = sb.toString();
            arr.add(str);
        }
        catch (IOException e){
            System.out.println("Eroare");
        }
        finally {
            if(fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    System.out.println("nu s a putut inchide fisierul");
                }
            }
        }
        return arr;
    }

    public static Integer verif(String user, String pass, List<String> arr){
        Integer pp = 0;
        for (String str : arr) {
            String[] vec = str.split(" ");
            if (vec[0].compareTo(user) == 0) {
                pp = 1;
                if (vec[1].compareTo(pass) == 0) {
                    return 2;
                }
            }
        }
        return pp;
    }

    public void solve(){
        List<String> arr  = getData();

        System.out.println("user-ul");
        String user = new String();
        user = sc.nextLine();
        System.out.println("parola");
        String pass = new String();
        pass = sc.nextLine();
        if(verif(user, pass, arr) == 2){
            System.out.println("acces permis");
        }
        else if(verif(user, pass, arr) == 1){
            System.out.println("parola gresita");
            System.out.println("reintrodu parola; ai 3 incercari");
            Integer pp = 0;
            for(int i = 1; i <= 3; i++){
                String newpass = sc.nextLine();
                if(verif(user, newpass, arr) == 2){
                    pp = 1;
                    System.out.println("acces permis");
                    break;
                }
                else{
                    Integer val = 3 - i;
                    System.out.println("reintrodu parola" + "mai ai " + val.toString() + " incercari");
                }
            }
            if(pp == 0){
                System.out.println("cont blocat");
            }
        }
        else {
            Integer pp = 0;
            for(int i = 1; i <= 4; i++){
                System.out.println("reintrodu datele");
                System.out.println("user-ul");
                String user2 = new String();
                user2 = sc.nextLine();
                System.out.println("parola");
                String pass2 = new String();
                pass2 = sc.nextLine();
                if(verif(user2, pass2, arr) == 2){
                    System.out.println("acces permis");
                    pp = 1;
                    break;
                }
                else if(verif(user2, pass2, arr) == 1){
                    System.out.println("parola gresita");
                    System.out.println("reintrodu parola; ai 3 incercari");
                    Integer pp2 = 0;
                    for(int j = 1; j <= 3; j++) {
                        String newpass = sc.nextLine();
                        if (verif(user2, newpass, arr) == 2) {
                            pp2 = 1;
                            System.out.println("acces permis");
                            break;
                        } else {
                            Integer val = 3 - j;
                            System.out.println("reintrodu parola" + "mai ai " + val.toString() + " incercari");
                        }
                        }
                        if(pp2 == 0){
                            System.out.println("cont blocat");
                            pp = 1;
                            break;
                        }
                        else{
                            break;
                        }
                }
            }
            if(pp == 0){
                System.out.println("ai introdus gresit datele de 5 ori");
                System.out.println("nu ai cont; inregistreaza-te");
            }
        }
    }
}
