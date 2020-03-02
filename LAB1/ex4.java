package LAB1;

import java.util.Scanner;

public class ex4
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Introdu valoarea: ");
        int n = sc.nextInt();
        
        int val = 1;
        if(n == 0)
            System.out.println("factorialul e: " + 1);
        for(int i = 1; i <= n; i++)
            val *= i;
        System.out.println("Factorialul e: " + val);
}
}
