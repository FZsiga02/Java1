package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a terület szélességét (m): ");
        double szelesseg = sc.nextDouble();
        System.out.print("Kérem adja meg a terület magasságát (m): ");
        double magassag = sc.nextDouble();
        double terulet = szelesseg * magassag;
        double darab = (terulet / 4) * 1.1;
        System.out.printf("%.0f db csempére van szükség", darab);
    }
}
