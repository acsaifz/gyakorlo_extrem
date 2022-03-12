package hu.progmatic;

public class sakktabla {
    public static void main(String[] args) {
        String[][] table = new String[10][10];
        char c = 'A';
        for (int i = 0; i < 8; i++){
            table[0][2+i] = Character.toString(c+i);
            table[1][2+i] = "-";
            table[2+i][0] = Integer.toString(8-i);
            table[2+i][1] = "|";
         }

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table.length; j++){
                if( i < 2 && j < 2){
                    table[i][j] = " ";
                } else if(i >=2 && j >= 2) {
                    if((i+j)%2 == 0){
                        table[i][j] = Integer.toString(0);
                    } else {
                        table[i][j] = Integer.toString(1);
                    }
                }
            }
        }

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table.length; j++){
                if (i == 1 && j > 0 && j < table.length-1) {
                    System.out.print(table[i][j] + "-");
                } else {
                    System.out.print(table[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
