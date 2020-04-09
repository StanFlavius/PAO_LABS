package LAB6;

import java.io.*;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ValMic, IOException {
        System.out.println("introdu exercitiul pe care doresti sa il rezolvi(1,2 sau 3)");
        Integer opt = sc.nextInt();
        if(opt == 1){
            ex1 ex1 = new ex1();
            ex1.solve();
        }
        if(opt == 2){
            ex2 ex2 = new ex2();
            ex2.solve();
        }
        if(opt == 3){
            ex3 ex3 = new ex3();
            ex3.solve();
        }
    }
}
