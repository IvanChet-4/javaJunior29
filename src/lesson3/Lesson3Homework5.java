package lesson3;

import java.util.Scanner;

public class Lesson3Homework5 {
    public static void main(String[] args) {
    //1 - Содержиться ли собачка
    //2 - а только одна
    //3 - начало и конеч не может быть с символа
    //4 - ...
    // email.contains()
    //split - разрезать - вернется массив кусочков стринг

    //Вводные данные
    String email = "skkhdfskdj@ldjf";

    //Режем на части по "@"
    String[] parts0fEmail = email.split("@");
    //Выводим количество частей
    System.out.println("Split по символу @, количество частей");
    System.out.println(parts0fEmail.length);

    //Проверка на количество @
        if (parts0fEmail.length == 1){
            System.out.println("Пароль не содержит собачку");
        } else if (parts0fEmail.length == 2){
            System.out.println("Пароль содержит собачку");
        } else if (parts0fEmail.length > 2){
            System.out.println("Пароль содержит несколько собачек");
        }

        //Проверка на наличие спецсимволов
        if (email.contains("+") || email.contains("-") || email.contains("=") || email.contains("<") || email.contains(">") || email.contains("<") || email.contains("!") || email.contains("_") || email.contains("#") || email.contains("$") || email.contains("%") || email.contains("&") || email.contains("*") || email.contains("(") || email.contains(")")) {
            System.out.println("Есть спецсимвол(-ы) в строке email");
        } else {
            System.out.println("Нет спецсимволов в строке email");
        }

        //Пребразуем строку в массив
        char[] emailtoarray = email.toCharArray();
        //Выводим первый элемент массива
        System.out.println("Первый элемент массива");
        System.out.println(emailtoarray[0]);

        //Проверка первого элемента массива на принадлежность к символам (список в условии не полный)
        if (emailtoarray[0] == 's' || emailtoarray[0] == 'd'){
        System.out.println("Первый элемент символ");
        }else{
        System.out.println("Первый элемент не символ");
         }



        //Вводим переменную для обозначения максимального индекса массива
        int dlinnmass = emailtoarray.length - 1;
        //Выводим последний элемент массива
        System.out.println("Последний элемент массива");
        System.out.println(emailtoarray[dlinnmass]);

        //Проверка второго элемента на принадлежность к символам (список в условии не полный)
        if (emailtoarray[dlinnmass] == 's' || emailtoarray[dlinnmass] == 'd'){
            System.out.println("Второй элемент символ");
        }else{
            System.out.println("Второй элемент не символ");
        }

        }
}