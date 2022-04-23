package lesson7;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getLevelFromUser() {
        System.out.println("Выберите уровень сложности:");
        System.out.println("1 -новичок");
        System.out.println("2 -любитель");
        System.out.println("3 -профессионал");
        System.out.println("4 -особый");

        String inputLevel = scanner.nextLine();
        if (!inputLevel.equals("1") &&
                !inputLevel.equals("2") &&
                !inputLevel.equals("3") &&
                !inputLevel.equals("4") &&
                !inputLevel.equalsIgnoreCase("новичок") &&
                !inputLevel.equalsIgnoreCase("любитель") &&
                !inputLevel.equalsIgnoreCase("профессионал") &&
                !inputLevel.equalsIgnoreCase("особый")) {
            return getLevelFromUser(); //рекурсивный вызов метода
        }
        return inputLevel;
    }

    public static int chooseRow(int length) {
        System.out.println("Выберите строку вашего хода");
        int chosenRow = 0;
        while (true) {
            chosenRow = scanner.nextInt()-1;
            if (chosenRow>=length) {
                System.out.println("Вы вышли за пределы игрового поля. Сделайте ход повторно");
            } else {
                break;
            }
        }
        return chosenRow;
    }

    public static int chooseCol(int length) {
        System.out.println("Выберите колонку вашего хода");
        int chosenCol = 0;
        while (true) {
            chosenCol = scanner.nextInt()-1;
            if (chosenCol>=length) {
                System.out.println("Вы вышли за пределы игрового поля. Сделайте ход повторно");
            } else {
                break;
            }
        }
        return chosenCol;
    }


}
