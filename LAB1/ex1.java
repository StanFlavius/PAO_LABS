package LAB1;
import java.util.Scanner;

public class ex1
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Introdu valoarea: ");
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i++){
            if(i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("");
        sc.close();
        
}
}
