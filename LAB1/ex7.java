package LAB1;

import java.util.Scanner;

public class ex7
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        System.out.println("Introdu valoarea: ");
        int n = sc.nextInt();
        
        int a = 1;
        int b = 1;
        n-=2;
        int c = 0;
        
        for(int i = 1; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Termenul cerut este: " + c);
    }
}
