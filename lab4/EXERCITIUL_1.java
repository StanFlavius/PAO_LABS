package lab4;

import java.util.Scanner;

public class EXERCITIUL_1 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("introdu sirurile: ");
        String s1 = "";
        String s2 = "";

        s1 = sc.nextLine();
        s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("NU SUNT ANAGRAME");
        }

        else{
            StringBuilder sb1 = new StringBuilder(s1);
            StringBuilder sb2 = new StringBuilder(s2);

            for(int i = 0; i < sb1.length(); i++){
                int index = s2.indexOf(s1.toCharArray()[i]);
                if(index >= 0){
                    sb2.delete(index, index + 1);
                    s2 = sb2.toString();
                }
            }

            if(sb2.length() == 0)
                System.out.println("SUNT ANAGRAME");
            else
                System.out.println("NU SUNT ANAGRAME");
        }
    }
}
