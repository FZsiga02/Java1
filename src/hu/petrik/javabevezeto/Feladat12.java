package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy összeget 1 és 1000 Ft között: ");
        int osszeg = sc.nextInt();
        int ketszaz = 0;
        int szaz = 0;
        int otven = 0;
        int husz = 0;
        int tiz = 0;
        int ot = 0;
        int maradek = 0;
        int ermek = 0;
        while (ermek != osszeg) {
            if ((ermek + 200) <= osszeg) {
                ermek += 200;
                ketszaz++;
            } else if ((ermek + 100) <= osszeg) {
                ermek += 100;
                szaz++;
            } else if ((ermek + 50) <= osszeg) {
                ermek += 50;
                otven++;
            } else if ((ermek + 20) <= osszeg) {
                ermek += 20;
                husz++;
            } else if ((ermek + 10) <= osszeg) {
                ermek += 10;
                tiz++;
            } else if ((ermek + 5) <= osszeg) {
                ermek += 5;
                ot++;
            } else {
                maradek = osszeg - ermek;
                ermek += maradek;
            }
        }
        System.out.println("A megadott összeget az alábbi érmékkel lehet összeállítani: ");
        System.out.printf("200 Ft: %d db", ketszaz);
        System.out.println(" ");
        System.out.printf("100 Ft: %d db", szaz);
        System.out.println(" ");
        System.out.printf("50 Ft: %d db", otven);
        System.out.println(" ");
        System.out.printf("20 Ft: %d db", husz);
        System.out.println(" ");
        System.out.printf("10 Ft: %d db", tiz);
        System.out.println(" ");
        System.out.printf("5 Ft: %d db", ot);
        System.out.println(" ");
        if (maradek != 0) {
            System.out.printf("Érméből nem rakható ki: %d Ft", maradek);
        }
    }
}
