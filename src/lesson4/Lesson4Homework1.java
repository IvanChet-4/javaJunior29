package lesson4;

import java.util.Scanner;

public class Lesson4Homework1 {
    public static void main(String[] args) {

        //Выводим информацию на экран
        System.out.println("Выбирите фигуру:");
        System.out.println("1 - квадрат");
        System.out.println("2 - круг");
        System.out.println("3 - овал");
        System.out.println("4 - прямоугольник");
        System.out.println("5 - треугольник");

        //Предлагаем пользователю ввести данные
        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        //Условие распознания введенной фигуры
        //Квадрат
        if (figura.equals("1") || figura.equalsIgnoreCase("квадрат")){

            //Собираем пользовательскую информацию по фигуре
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            System.out.println("Введите сторону квадрата:");
            String storonakvad = scanner.nextLine();

            //Преобразуем из string в int
            int a = Integer.parseInt(storonakvad);

            //Условия нахождения площади и периметра фигуры
            if (action.equalsIgnoreCase("Площадь")){
                System.out.println("Площадь квадрата равно =" + (a * a));
            }else{
                System.out.println("Периметр квадрата равно =" + (a * 4));
            }

            //Круг
        }else if (figura.equals("2") || figura.equalsIgnoreCase("круг")){

            //Собираем пользовательскую информацию по фигуре
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            System.out.println("Введите радиус круга:");
            String radius = scanner.nextLine();

            //Преобразуем из string в int
            int a = Integer.parseInt(radius);

            //Условия нахождения площади и периметра фигуры
            if (action.equalsIgnoreCase("Площадь" ) ){
                System.out.println("Площадь круга равно =" + (Math.PI * (a * a)));
            }else{
                System.out.println("Периметр круга равно =" + (2 * Math.PI * a));
            }

            //Овал (Эллипс)
        }else if (figura.equals("3") || figura.equalsIgnoreCase("овал")){

            //Собираем пользовательскую информацию по фигуре
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            System.out.println("Введите радиус первой полуоси:");
            String osa = scanner.nextLine();
            System.out.println("Введите радиус второй полуоси:");
            String osb = scanner.nextLine();

            //Преобразуем из string в int
            int a = Integer.parseInt(osa);
            int b = Integer.parseInt(osb);

            //Условия нахождения площади и периметра фигуры
            if (action.equalsIgnoreCase("Площадь" ) ){
                System.out.println("Площадь овала равно =" + (Math.PI * a * b));
            }else{
                System.out.println("Периметр овала равно =" + (2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2))/2)));
            }

            //Прямоугольник
        }else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {

            //Собираем пользовательскую информацию по фигуре
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            System.out.println("Введите длину первой стороны:");
            String storonaa = scanner.nextLine();
            System.out.println("Введите длину второй стороны:");
            String storonab = scanner.nextLine();

            //Преобразуем из string в int
            int a = Integer.parseInt(storonaa);
            int b = Integer.parseInt(storonab);

            //Условия нахождения площади и периметра фигуры
            if (action.equalsIgnoreCase("Площадь" ) ){
                System.out.println("Площадь прямоугольника равно =" + (a * b));
            }else{
                System.out.println("Периметр прямоугольника равно =" + (2 * (a + b)));
            }

         //Треугольник
        }else if (figura.equals("5") || figura.equalsIgnoreCase("треугольник")) {


            //Собираем пользовательскую информацию по фигуре
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            System.out.println("Введите длину первой стороны:");
            String storona1 = scanner.nextLine();
            System.out.println("Введите длину второй стороны:");
            String storona2 = scanner.nextLine();
            System.out.println("Введите длину третьей стороны:");
            String storona3 = scanner.nextLine();

            //Преобразуем из string в int
            int a = Integer.parseInt(storona1);
            int b = Integer.parseInt(storona2);
            int c = Integer.parseInt(storona3);

            //Условия нахождения площади и периметра фигуры
            if (action.equalsIgnoreCase("Площадь" ) ){
                System.out.println("Площадь треугольника равно =" + (Math.sqrt(((a + b + c) * (a + b + c - a) * (a + b + c - b) * (a + b + c - c)))));
            }else{
                System.out.println("Периметр треугольника равно =" + (a + b + c));
            }
        }
    }
}