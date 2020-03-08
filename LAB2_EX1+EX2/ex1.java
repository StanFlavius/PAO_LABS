package LAB2;

import java.util.Scanner;
public class ex1
{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Introdu nr de numere: ");
        int n = sc.nextInt();
        
        double sum = 0;
        double ct = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("Introdu numarul: ");
            int val = sc.nextInt();
            if(val != -1){
                sum = sum + val;
                ct++;
            }
            else break;
        }
        
        double med = sum / ct * 1.0;
        
        System.out.println(med);
        sc.close();
        
}
}
