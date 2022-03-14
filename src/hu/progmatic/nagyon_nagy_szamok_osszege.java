package hu.progmatic;

import java.math.BigInteger;
import java.util.Scanner;

public class nagyon_nagy_szamok_osszege {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg az első számot: ");
        BigInteger A = new BigInteger(scanner.nextLine());

        System.out.println("Add meg a második számot: ");
        BigInteger B = new BigInteger(scanner.nextLine());

        BigInteger sum = A.add(B);

        System.out.println("A két szám összege: " + sum);*/

        //Jólvan én is megcsinálom rendesen...

        String A = "19223372036854775807";
        String B = "9223372036854775817";

        int size = A.length() > B.length() ? A.length() : B.length();

        int[] intsA = new int[size];
        int[] intsB = new int[size];

        String result = "";

        for (int i = size-1; i >= 0; i--){
            if (i - (size - A.length()) >= 0){
                intsA[i] = Integer.parseInt(Character.toString(A.charAt(i - (size-A.length()))));
            }
            if (i - (size - B.length()) >= 0){
                intsB[i] = Integer.parseInt(Character.toString(B.charAt(i - (size-B.length()))));
            }
        }
        int remainder = 0;
        for (int i = size-1; i >= 0; i--){
            int c = intsA[i]+intsB[i]+remainder;
            if (c < 10){
                result = c + result;
                remainder = 0;
            }else{
                result = c % 10 + result;
                remainder = c/10;
            }
        }
        if (remainder > 0){
            result = remainder + result;
        }

        System.out.println(result);
        System.out.println("28446744073709551624");

        //Így már egy kicsit azért izgalmasabb volt a feladat :D
    }
}
