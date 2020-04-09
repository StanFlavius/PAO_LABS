package LAB6;

import java.io.*;
import java.util.Scanner;

public class ex1{
    static Scanner sc = new Scanner(System.in);
    public void solve() {
        FileWriter file = null;

        try{
            file = new FileWriter("1.txt");

            String msg = "";
            System.out.println("Introdu cele 2 numere pe ac linie sau Exit daca doresti sa iesi din program");
            msg = sc.nextLine();
            while(msg.compareTo("Exit") != 0) {
                try {
                    String[] arr = msg.split(" ", 3);
                    Integer val1, val2;
                    val1 = Integer.parseInt(arr[0]);
                    val2 = Integer.parseInt(arr[1]);
                    if (val1 > val2)
                        throw new ValMic("primul numar trebuie sa fie mai mic decat al doilea");
                    else {
                        System.out.println("corect");
                    file.write(val1 + " " + val2 + "\n");
                    }
                } catch (ValMic v) {
                        System.out.println(v.getMessage());
                }
                System.out.println("Introdu cele 2 numere pe ac linie sau Exit daca doresti sa iesi din program");
                msg = sc.nextLine();
            }
        } catch(IOException e){
                System.out.println("Eroare");
        }
        finally {
                if(file != null) {
                    try {
                        file.close();
                    } catch (IOException e) {
                        System.out.println("nu s a putut inchide fisierul");
                    }
                }
        }
    }
}
