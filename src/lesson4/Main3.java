package lesson4;

public class Main3 {
    public static void main(String[] args) {
        //вывести вторую диагональ (без первой) единичками
        int[][] chess = new int[8][8];
        for (int i = 0; i < chess.length; i++){
            for (int j = 0; j < chess[i].length; j++){
                if ((i + j)%2 == 0){
                    System.out.print(" " + " ");//chess[i][j]
                    } else {
                System.out.print("1" + " ");
                }

        }
            System.out.println();
    }
}}
