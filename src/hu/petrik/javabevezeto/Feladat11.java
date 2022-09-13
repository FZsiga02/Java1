package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy pozitív egész számot: ");
        int n = sc.nextInt();
        int osszeg = 0;
        for (int i = 0; i <= n; i++) {
            if (i %2 != 0)
            {
                osszeg += i;
            }
        }
        System.out.printf("A megadott számnál nem nagyobb páratlanok összege: %d", osszeg);
    }
}
