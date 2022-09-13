package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy pozitív valós számot: ");
        double szam = sc.nextDouble();
        double le = Math.floor(szam);
        double fel = Math.ceil(szam);
        double koz = Math.round(szam);
        double tort = szam % 1;
        double egesz = szam - tort;
        System.out.printf("A megadott szám a %.0f és a %.0f egész számok között van, és ezek közül a %.0f számhoz van közelebb.", le, fel, koz);
        System.out.println("");
        System.out.printf("A szám egész része: %.0f", egesz);
        System.out.println("");
        System.out.printf("A szám törtrésze: %f", tort);
    }
}
