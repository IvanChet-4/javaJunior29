package lesson4;

import java.util.Scanner;
//автоматически io, nio - файлы; util - самое важное; awt - рисовалка
// import java.lang.*
public class Main1 {
    public static void main(String[] args) {
        //front программа с пользовательским интерфейсом
        //дз остальные 4-е варианта
        System.out.println("Выбирите фигуру:");
        System.out.println("1 - квадрат");
        System.out.println("2 - круг");
        System.out.println("3 - овал");
        System.out.println("4 - прямоугольник");
        System.out.println("5 - треугольник");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        //== используется только к примитивным типам
        if (figura.equals("1") || figura.equalsIgnoreCase("квадрат")){
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            System.out.println("Введите сторону квадрата:");
            String storona = scanner.nextLine();
            //преобразование из string в int
            int a = Integer.parseInt(storona);

        if (action.equalsIgnoreCase("Площадь")){
                System.out.println("Площадь квадрата равно =" + (a * a));
        }else{
                System.out.println("Периметр квадрата равно =" + (a * 4));
            }

        }else if (figura.equals("2") || figura.equalsIgnoreCase("круг")){

        }else if (figura.equals("3") || figura.equalsIgnoreCase("овал")){
}else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {
        }else if (figura.equals("5") || figura.equalsIgnoreCase("треугольник")) {


            }

        }
}