package LAB1;


import java.util.Scanner;

public class ex6
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Introdu a: ");
        int a = sc.nextInt();
        System.out.println("Introdu b: ");
        int b = sc.nextInt();
        
        int val = 1;
        for(int i = 1; i <= b; i++)
            val *= a;
        System.out.println("valoarea este: " + val);
}
}

