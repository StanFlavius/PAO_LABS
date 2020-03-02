package LAB1;

import java.util.Scanner;

public class ex2
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Introdu a: ");
        int a = sc.nextInt();
        System.out.println("Introdu b: ");
        int b = sc.nextInt();
        
        if(a > b)
            System.out.println(a + " e numarul mai mare");
        else
            System.out.println(b + " e numarul mai mare");
        System.out.println("");
}
}
