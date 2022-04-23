package lesson6;

import java.util.Scanner;

public class ScannerUtils {
    //Узнать уровень сложности
    public static String getLevelFromUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите уровень сложности:");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        String inputLevel = scanner.nextLine();

        if (!inputLevel.equals("1") && !inputLevel.equals("2") && !inputLevel.equals("3") && !inputLevel.equals("4") && !inputLevel.equalsIgnoreCase("Новичок") && !inputLevel.equalsIgnoreCase("Любитель") && !inputLevel.equalsIgnoreCase("Профессионал") && !inputLevel.equalsIgnoreCase("Опытный")){
            System.out.println("Введен неверный уровень сложности \n");
           return getLevelFromUser();// рекурсивный вызов метода
        }
        return inputLevel;

    }
}
