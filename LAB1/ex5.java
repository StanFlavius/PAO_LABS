package LAB1;

import java.util.Scanner;
public class ex5
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Introdu valoare: ");
        int n = sc.nextInt();
        
        if(n == 1){
            System.out.println(0);
            return;
        }
        if(n == 2){
            System.out.println(1);
            return;
        }
        if(n % 2 == 0){
            System.out.println(0);
            return;
        }
        for(int i = 3; i * i <= n; i += 2)
            if(n % i == 0){
                System.out.println(0);
                return;
            }
        System.out.println(1);
}
}
