package hu.progmatic;

import java.math.BigInteger;

public class nagyon_nagy_szamok_kivonasa {
    public static void main(String[] args) {
        //Negatív számmal még nem működik
        String A = "0";
        String B = "999";

        int size = A.length() > B.length() ? A.length() : B.length();

        int[] intsA = new int[size];
        int[] intsB = new int[size];

        String result = "";

        boolean ABiggerThanB = A.length() > B.length() || A.length() == B.length() &&
                Integer.parseInt(Character.toString(A.charAt(0))) > Integer.parseInt(Character.toString(B.charAt(0)));

        if (ABiggerThanB) {
            for (int i = size - 1; i >= 0; i--) {
                if (i - (size - A.length()) >= 0) {
                    intsA[i] = Integer.parseInt(Character.toString(A.charAt(i - (size - A.length()))));
                }
                if (i - (size - B.length()) >= 0) {
                    intsB[i] = Integer.parseInt(Character.toString(B.charAt(i - (size - B.length()))));
                }
            }
        }else{
            for (int i = size - 1; i >= 0; i--) {
                if (i - (size - A.length()) >= 0) {
                    intsB[i] = Integer.parseInt(Character.toString(A.charAt(i - (size - A.length()))));
                }
                if (i - (size - B.length()) >= 0) {
                    intsA[i] = Integer.parseInt(Character.toString(B.charAt(i - (size - B.length()))));
                }
            }
        }
        int remainder = 0;
        for (int i = size-1; i >= 0; i--){
            if (intsA[i]+remainder < intsB[i]){
                result = (10+intsA[i]+remainder-intsB[i]) + result;
                remainder = -1;
            }else{
                result = (intsA[i]+remainder-intsB[i]) + result;
                remainder = 0;
            }

        }

        for(int i = 0; i < result.length(); i++){
            if (result.charAt(0) == '0'){
                result = result.substring(1);
            }else{
                break;
            }
        }

        if (!ABiggerThanB && !A.equals(B)){
            result = "-" + result;
        }

        System.out.println(result);

        BigInteger biA = new BigInteger(A);
        BigInteger biB = new BigInteger(B);

        System.out.println(biA.subtract(biB));
    }
}
