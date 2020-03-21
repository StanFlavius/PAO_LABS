package lab4;

import java.util.Scanner;

public class EXERCITIUL_3 {

    static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(Integer val){
        if(val <= 1)
            return false;
        if(val == 2)
            return true;
        if(val % 2 == 0)
            return false;
        for(int i = 3; i*i <= val; i+=2) {
            if (val % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
         int noOfR = sc.nextInt();
         int noOfC = sc.nextInt();

         Integer[][] image = new Integer[noOfR + 1][noOfC + 1];

         for(int i = 0; i < noOfR; i++) {
             for (int j = 0; j < noOfC; j++) {
                 image[i][j] = sc.nextInt();
             }
         }

         int[][] binImage = new int[noOfR + 1][noOfC + 1];
         int nr = 0;
         for(int i = 0; i < noOfR; i++) {
             for(int j = 0; j < noOfC; j++) {
                 if(isPrime(image[i][j])){
                     binImage[i][j] = 0;
                     nr++;
                 }
                 else{
                     binImage[i][j] = 1;
                 }
             }
        }
        System.out.println(nr);
    }
}
