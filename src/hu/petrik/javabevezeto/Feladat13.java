package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double szam = (Math.random() * 100) - 1;
        int egeszSzam = (int) szam;
        System.out.print("Kérem adja meg a gondolt számot: ");
        int tipp = sc.nextInt();
        boolean kiir = false;
        while (tipp != egeszSzam) {
            if (tipp == egeszSzam) {
                System.out.println("Helyes tipp!");
                kiir = true;
            } else if (tipp < egeszSzam) {
                System.out.println("A gondolt szám nagyobb!");
                System.out.print("Új tipp: ");
                tipp = sc.nextInt();
            } else {
                System.out.println("A gondolt szám kisebb!");
                System.out.print("Új tipp: ");
                tipp = sc.nextInt();
            }
        }
        if (kiir == false) {
            System.out.println("Helyes tipp!");
        }
    }
}
