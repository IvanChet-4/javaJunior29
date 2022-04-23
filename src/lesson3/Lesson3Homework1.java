package lesson3;

public class Lesson3Homework1 {
    public static void main(String[] args) {

       //Вводные
       char[] chars = {2, 4, 45, 3, 64, 3, 5};
       int summelem = 0;

       //Цикл суммирования элементов массива
       for (int i = 0;i < chars.length; i++){
            summelem += chars[i];
        }

       //Вывод суммы элементов массива
        System.out.println(summelem);
    }
}
