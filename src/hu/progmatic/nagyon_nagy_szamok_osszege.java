package hu.progmatic;

import java.math.BigInteger;
import java.util.Scanner;

public class nagyon_nagy_szamok_osszege {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg az első számot: ");
        BigInteger A = new BigInteger(scanner.nextLine());

        System.out.println("Add meg a második számot: ");
        BigInteger B = new BigInteger(scanner.nextLine());

        BigInteger sum = A.add(B);

        System.out.println("A két szám összege: " + sum);
    }
}
