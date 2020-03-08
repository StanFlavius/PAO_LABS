package LAB2;

import java.util.Scanner;
public class ex2
{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Introdu n ");
        int n = sc.nextInt();
        
        int[] x = new int[100];
        int[] y = new int[100];
        int ctx = 0;
        int cty = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("Introdu numarul: ");
            int val = sc.nextInt();
            if(val%2 == 0) x[ctx++] = val;
            else y[cty++] = val;
        }
        
        if(ctx > cty){
            for(int i = 0; i < ctx; i++)
                System.out.print(x[i]+ " ");
            System.out.println("");
        }
        else{
            for(int i = 0; i < cty; i++)
                System.out.print(y[i] +  " ");
            System.out.println("");
        }
        sc.close();
        
}
}
