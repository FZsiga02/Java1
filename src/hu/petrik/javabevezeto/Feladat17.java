package hu.petrik.javabevezeto;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Feladat17 {
    public static void main(String[] args) {
        double[] t1 = {1, 2, 3, 4, 5};
        double[] t2 = {6, 7, 8, 9, 10};
        double[] t3 = new double[5];
        for (int i = 0; i < t1.length; i++) {
            t3[i] = t1[i] + t2[i];
        }
        System.out.print("A tömb megfelelő elemeinek összegei: ");
        for (int i = 0; i < t3.length; i++) {
            System.out.print(t3[i]+" ");
        }
    }
}
