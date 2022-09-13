package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a dolgozat eredményét: ");
        int eredmeny = sc.nextInt();
        if (eredmeny >= 0 && eredmeny <= 42)
        {
            System.out.println("Elégtelen");
        } else if (eredmeny > 42 && eredmeny <= 57)
        {
            System.out.println("Elégséges");
        } else if (eredmeny > 57 && eredmeny <= 72)
        {
            System.out.println("Közepes");
        } else if (eredmeny > 72 && eredmeny <= 87)
        {
            System.out.println("Jó");
        } else
        {
            System.out.println("Jeles");
        }
    }
}
