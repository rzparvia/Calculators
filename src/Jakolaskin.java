//package PACKAGE_NAME;

import java.util.Scanner;

public class Jakolaskin {

    public static void main(String[] args) {
        Jakolaskin laskin = new Jakolaskin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku:");
        float luku1 = sc.nextFloat();
        System.out.println("Anna toinen luku:");
        float luku2 = sc.nextFloat();
        try {
            float jako = luku1 / luku2;

        } catch (ArithmeticException ex) {
            System.out.println("Ei näin. Nimittäjä ei voi olla nolla.");

        }
        System.out.println("Vastaus on: " + 1.0 * (luku1 / luku2));
    }
}