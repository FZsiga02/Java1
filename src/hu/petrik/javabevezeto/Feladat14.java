package hu.petrik.javabevezeto;

import java.util.Locale;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy szöveget: ");
        String szoveg = sc.nextLine();
        String menuPont = "";
        while (!menuPont.equals("f")) {
            System.out.println("Adja meg, hogy mit szeretne csinálni a szöveggel: ");
            System.out.println("\t");
            System.out.println("\ta - Nagybetűssé alakítani");
            System.out.println("\tb - Kisbetűssé alakítani");
            System.out.println("\tc - Lekérdezni a hosszát");
            System.out.println("\td - Összehasonlítani egy másik szöveggel");
            System.out.println("\te - A szöveg egy részét kiíratni");
            System.out.println("\tf - Kilépni");
            System.out.print("Adja meg a menüpontot: ");
            menuPont = sc.nextLine().toLowerCase();
        }
    }
}
