package lab4;

import java.util.Scanner;

public class EXERCITIUL_2 {
    static Scanner sc = new Scanner(System.in);

    public static boolean palindrom(String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);
        sb2.reverse();
        return sb.toString().equals(sb2.toString());
    }

    public static void main(String[] args){
        System.out.println("introdu numarul de siruri: ");
        int n = sc.nextInt();

        String[] arrayOfStrings = new String[n + 1];

        System.out.println("introdu sirurile: ");
        String s = "";
        int ct = 0;
        for(int i = 0; i < n; i++)
            arrayOfStrings[ct++] = sc.next();

        String[] arrayOfPalindroms = new String[n + 1];
        int noOfP = 0;
        for(int i = 0; i < n; i++) {
            if (palindrom(arrayOfStrings[i])) {
                arrayOfPalindroms[noOfP++] = arrayOfStrings[i];
            }
        }

        String maxP = "";
        int mx = 0;
        for(int i = 0; i < noOfP; i++){
            if(arrayOfPalindroms[i].length() > mx){
                mx = arrayOfPalindroms[i].length();
                maxP = arrayOfPalindroms[i];
            }
        }

        System.out.println(maxP);
    }
}
