package lesson4;

public class Lesson4Homework2 {
    public static void main(String[] args) {
        //Вывести вторую диагональ (без первой) единичками

        //Вводные данные
        int[][] chess = new int[8][8];

        //Циклы
        for (int i = 0; i < chess.length; i++){
            for (int j = 0; j < chess[i].length; j++){

                //Условие
                if ((i + j) == 7){
                    System.out.print("1" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}