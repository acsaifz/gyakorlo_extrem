package hu.progmatic;

public class almaszuret {
    public static void main(String[] args) {
        int[] apples = {44, 42, 76, 55, 48, 48, 64, 44, 78, 72, 26, 26};
        int pick = 4;

        int maxApples = 0;
        int fromWhichTree = 0;

        if (pick >= apples.length){
            fromWhichTree = 1;
        }else {
            for (int i = 0; i <= apples.length - pick; i++) {
                int sum = 0;
                for (int j = 0; j < pick; j++) {
                    sum += apples[i + j];
                }
                if (maxApples < sum) {
                    maxApples = sum;
                    fromWhichTree = i + 1;
                }
            }
        }
        System.out.println("Hányadik almafától kezdjem a szüretelést: " + fromWhichTree);
    }
}
