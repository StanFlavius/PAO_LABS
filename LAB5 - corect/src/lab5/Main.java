package lab5;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //EXERCITIUL 1

        OutTask ot = new OutTask("salut");
        ot.execute();

        RandomOutTask rot = new RandomOutTask();
        rot.execute();

        CounterOutTask cout = new CounterOutTask();
        cout.execute();
        cout.execute();

        //EXERCITIUL 2
        System.out.println("introdu nr.de albume: ");
        int val = sc.nextInt();

        Album[] vec = new Album[val];

        for(int i = 0; i < val ; i++){
            Album alb = new Album();

            System.out.println("introdu numele: ");
            String nume = sc.next();
            alb.setNume(nume);

            System.out.println("introdu anul publicarii: ");
            int an = sc.nextInt();
            alb.setAn_publicare(an);

            System.out.println("introdu ratingul: ");
            double rating = sc.nextDouble();
            alb.setRating(rating);

            vec[i] = alb;
        }

        for (Album album : vec) {
            album.afisare();
        }

        System.out.println("DUPA SORTARE");
        Arrays.sort(vec);

        for (Album album : vec) {
            album.afisare();
        }
    }
}
