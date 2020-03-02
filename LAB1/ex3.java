package LAB1;

import java.util.Scanner;

public class ex3
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Introdu valoarea: ");
        int n = sc.nextInt();
        
        System.out.println("Divizorii sunt: ");
        for (int i = 1; i <= n; i++)
            if(n % i == 0)
                System.out.print(i + " ");
        System.out.println("");
}
}
