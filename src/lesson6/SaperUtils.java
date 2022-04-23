package lesson6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {
    public static int[][] createGameField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("Новичок")) {
            return new int[9][9];
        }
        if (level.equals("2") || level.equalsIgnoreCase("Любитель")) {
            return new int[16][16];
        }
        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")) {
            return new int[30][16];
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ширина массива:");
        int cols = Integer.parseInt(scanner.nextLine());
        System.out.println("Высота массива:");
        int rows = Integer.parseInt(scanner.nextLine());
        return new int[rows][cols];
    }

    public static int[][] feelRandomMines(int[][] field, int countMines) {
        for (int i = 0; i < countMines; i++) {
            feellOneMine(field);
        }
        return field;
    }

    public static int[][] feellOneMine(int[][] field) {
        //Проверка мины на мине
        int randomRow = ThreadLocalRandom.current().nextInt(0, field.length);
        int randomCol = ThreadLocalRandom.current().nextInt(0, field[0].length);
        if (field[randomRow][randomCol] != -1) {
            field[randomRow][randomCol] = -1;
        } else {
            return feellOneMine(field);
        }
        return field;
    }

    public static int countMinesByLevel(String level) {

        if (level.equals("1") || level.equalsIgnoreCase("Новичок")) {
            return 10;
        }
        if (level.equals("2") || level.equalsIgnoreCase("Любитель")) {
            return 40;
        }
        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")) {
            return 99;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество мин:");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void printMinesFromField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    System.out.print("%  ");
                } else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }

    //Выбираем строку для хода
    public static int createStepUserRow() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число - от 1 :");
        int StepUserRow = Integer.parseInt(scanner.nextLine());
        //Минус 1 иначе счет будет от 0
        return StepUserRow - 1;
    }

    //Выбираем столбец для хода
    public static int createStepUserCol() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число - от 1 :");
        int StepUserCol = Integer.parseInt(scanner.nextLine());
       //Минус 1 иначе счет будет от 0
        return StepUserCol - 1;
    }

    //Сама игра
    public static void stepResult(int[][] field, int StepUserRow, int StepUserCol, int countMines) {

        //Переменные и массивы (той же размерности, что и field) для проверки
        //Массив нулей
        int[][] provPovtor = new int[field.length][field[field.length - 1].length];
        //Массив едениц
        int[][] provPovtorOnes = new int[field.length][field[field.length - 1].length];
        //Переменная для суммирования количества ходов
        int sum = 0;
        //Переменная для суммирования элементов массива единиц
        int sumprovPovtorOnes = 0;
        //Сумма массива из единиц (минус количество мин для условия прохождения)
        int raznostIshodn = 0;

        //Массив единиц той же размерности, что и field
        for(int i = 0; i < provPovtorOnes.length; i++) {
            for (int j = 0; j < provPovtorOnes[i].length; j++) {
                 provPovtorOnes[i][j]++;
            }
        }
        //Для проверочных условий (количество всех элементов массива аналогичного field)
        int vseelem = 0;
        //Для проверочных условий количество строк аналогичное field
        int strok = provPovtorOnes.length;

        //Массив для проверочных условий
        //Суммируем все единицы в массиве; сумма элементов - количество мин будет проверкой.
        for(int i = 0; i < provPovtorOnes.length; i++) {
            for (int j = 0; j < provPovtorOnes[i].length; j++) {
                //Заполняем массив единицами
                sumprovPovtorOnes = sumprovPovtorOnes + provPovtorOnes[i][j];
                //Считаем количество всех элементов массива (массив аналогичен field)
                vseelem += provPovtorOnes[i][0];
          }
        }
        //Количество столбцов массива field (т.к. кол-во элементов - это кол-во столбцов * кол-во строк )
        //Получаем количество столбцов
        int stolb = vseelem / strok;
        //System.out.println(vseelem);
        //System.out.println(strok);
        //System.out.println(stolb);

        //Получаем количество элементов без мин - равно количеству ходов
        raznostIshodn = sumprovPovtorOnes - countMines;
        //System.out.println(raznostIshodn);
        //System.out.println();

        //Цикл игры
               while(true) {

                           //Условие не выхода за пределы массива
                           if (StepUserRow > strok || StepUserCol > stolb){
                               System.out.println("Введено неверное число, попробуйте еще раз...");
                               //Вводим пользовательское число строк
                               StepUserRow = SaperUtils.createStepUserRow();

                               //Вводим пользовательское число столбцов
                               StepUserCol = SaperUtils.createStepUserCol();
                       }


                   //Шаг на мину
                   if (field[StepUserRow][StepUserCol] == -1) {

                       provPovtor[StepUserRow][StepUserCol] = provPovtor[StepUserRow][StepUserCol] - 1;

                       for (int i = 0; i < provPovtor.length; i++) {
                           for (int j = 0; j < provPovtor[i].length; j++) {
                               if (provPovtor[i][j] == -1) {
                                   System.out.print("=%=");
                               } else if (provPovtor[i][j] == 1){
                                   System.out.print("1  ");
                               } else if (provPovtor[i][j] == 0){
                                   System.out.print("0  ");
                               }
                           }
                           System.out.println();
                       }

                       System.out.println();
                       System.out.println("БоБо");
                       System.out.println();
                       break;
                   }

                   //Повторный шаг
                   if (field[StepUserRow][StepUserCol] == 0 && provPovtor[StepUserRow][StepUserCol] == 1){

                       System.out.println("Повтор");
                       //Вводим пользовательское число строк
                       StepUserRow = SaperUtils.createStepUserRow();

                       //Вводим пользовательское число столбцов
                       StepUserCol = SaperUtils.createStepUserCol();
                     }

                   //Хороший шаг
                   if (field[StepUserRow][StepUserCol] == 0 && provPovtor[StepUserRow][StepUserCol] == 0) {

                       provPovtor[StepUserRow][StepUserCol] = provPovtor[StepUserRow][StepUserCol] + 1;
                       //Количество открытых клеток
                       sum = sum + 1;

                       //Если открыли последнюю свободную клетку, то игра пройдена
                       if (sum == raznostIshodn){
                           System.out.println();
                           System.out.println("Поле пройдено");
                           System.out.println();
                           break;}

                       for (int i = 0; i < provPovtor.length; i++) {
                           for (int j = 0; j < provPovtor[i].length; j++) {
                               if (provPovtor[i][j] == -1) {
                                   System.out.print("=%=");
                               } else if (provPovtor[i][j] == 1){
                                   System.out.print("1  ");
                               } else if (provPovtor[i][j] == 0){
                                   System.out.print("0  ");
                               }
                           }
                           System.out.println();
                       }

                       System.out.println();
                       System.out.println("Повезло");
                       System.out.println();

                       //Вводим пользовательское число строк
                       StepUserRow = SaperUtils.createStepUserRow();

                       //Вводим пользовательское число столбцов
                       StepUserCol = SaperUtils.createStepUserCol();
                       }
                    }
               }

            }