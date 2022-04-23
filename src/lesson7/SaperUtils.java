package lesson7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {
    private static int cols;
    private static int rows;

    public static int[][] createGameField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("новичок"))
            return new int[9][9];

        if (level.equals("2") || level.equalsIgnoreCase("любитель"))
            return new int[16][16];

        if (level.equals("3") || level.equalsIgnoreCase("профессионал"))
            return new int[30][16];


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ширина: ");
        cols = Integer.parseInt(scanner.nextLine());
        System.out.println("Высота: ");
        rows = Integer.parseInt(scanner.nextLine());
        return new int[rows][cols];
    }

    public static int[][] feelRandomMines(int[][] field, int countMines) {
        for (int i = 0; i < countMines; i++) {
            feelOneMine(field);
        }
        return field;
    }

    public static int[][] feelOneMine(int[][] field) {
        int randomRow = ThreadLocalRandom.current().nextInt(0, field.length);
        int randomCol = ThreadLocalRandom.current().nextInt(0, field[0].length);
        if (field[randomRow][randomCol] != -1) {
            field[randomRow][randomCol] = -1;
        } else {
            return feelOneMine(field);
        }
        return field;
    }

    public static int countMinesByLevel(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("новичок"))
            return 10;

        if (level.equals("2") || level.equalsIgnoreCase("любитель"))
            return 40;

        if (level.equals("3") || level.equalsIgnoreCase("профессионал"))
            return 99;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Кол-во мин:");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void printMinesFromField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    System.out.print(" % ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] createFieldForGamer(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("новичок")) {
            return new int[9][9];
        }

        if (level.equals("2") || level.equalsIgnoreCase("любитель"))
            return new int[16][16];

        if (level.equals("3") || level.equalsIgnoreCase("профессионал"))
            return new int[30][16];

        return new int[rows][cols];
    }

    public static void printFieldForGamer(int[][] field, int[][] fieldWithMines) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 0)
                    System.out.print("[|]");

                if (field[i][j] == 1 && fieldWithMines[i][j] != -1)
                    System.out.print("[" + countMines(fieldWithMines, i, j) + "]");

            }
            System.out.println();
        }
    }

    public static int countMines(int[][] fieldWithMines, int i, int j) {
        int count = 0;
        if (j+1 < fieldWithMines[i].length)
        if (fieldWithMines[i][j + 1] == -1)
            count++;

        if (i+1 < fieldWithMines.length && j+1 < fieldWithMines[i].length)
        if (fieldWithMines[i + 1][j + 1] == -1)
            count++;

        if (i+1<fieldWithMines.length)
        if (fieldWithMines[i + 1][j] == -1)
            count++;

        if(i-1>=0 && j+1 > fieldWithMines[i].length)
        if (fieldWithMines[i - 1][j + 1] == -1)
            count++;

        if (i+1 < fieldWithMines.length && j-1>=0)
        if (fieldWithMines[i + 1][j - 1] == -1)
            count++;

        if (i-1>=0 && j-1 >=0)
        if (fieldWithMines[i - 1][j - 1] == -1)
            count++;

        if (j-1>=0)
        if (fieldWithMines[i][j - 1] == -1)
            count++;

        if (i-1>=0)
        if (fieldWithMines[i - 1][j] == -1)
            count++;
        return count;
    }

    public static boolean checkForMin(int[][] fieldWithMins, int row, int col) {
        if (fieldWithMins[row][col] == -1)
            return false;
        return true;
    }

    public static boolean checkForWin(int[][] fieldWithMins, int[][] field) {
        int countMines = 0;
        int countOpened = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (fieldWithMins[i][j] == -1)
                    countMines++;
                if (field[i][j] == 1)
                    countOpened++;
            }
        }
        if (countMines + countOpened == field.length * field[0].length)
            return true;

        return false;
    }


}
