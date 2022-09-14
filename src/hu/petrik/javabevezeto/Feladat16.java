package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[5];
        System.out.print("Kérem adjon meg 5 egész számot: ");
        for (int i = 0; i < 5; i++) {
            int szam = sc.nextInt();
            t[i] = szam;
        }
        System.out.print("A tömb elemei a megadás sorrendjében: ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println("");
        System.out.print("A tömb elemei fordított sorrendben: ");
        for (int i = t.length; i > 0; i--) {
            System.out.print(t[i - 1] + " ");
        }
        System.out.println("");
        System.out.print("A tömb minden második eleme: ");
        for (int i = 0; i < t.length; i++) {
            if (i % 2 != 0) {
                System.out.print(t[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Kérem adjon meg egy számot 1 és 5 között: ");
        int szam = sc.nextInt();
        System.out.printf("A tömb %d. eleme: %d", szam, t[szam-1]);
    }
}
