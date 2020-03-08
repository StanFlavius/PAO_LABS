package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu nr. de elevi: ");
        String number = sc.nextLine();
        int n = Integer.parseInt(number);

        student[] vec = new student[100];
        int ct = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Introdu datele: ");
            String[] line = sc.nextLine().split(" ");
            vec[i] = new student();
            vec[i].setNume(line[0]);
            vec[i].setNota(Integer.parseInt(line[1]));
            //System.out.println(line);
        }

        for(int i = 0; i < n; i++){
            System.out.println(vec[i].getNume()  + " " + vec[i].getNota());
        }
    }
}

