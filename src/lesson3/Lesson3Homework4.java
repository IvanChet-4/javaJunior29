package lesson3;

public class Lesson3Homework4 {
    public static void main(String[] args) {

        //Вводные данные
        int[] chars = {2, 4, 45, 3, 64, 3, 5};
        int j = 1;

        //Цикл
        for (int i = 0; i < chars.length; i++){

            //Условие для проверки четности суммы соседних элементов
            if (j < chars.length && (chars[i] + chars[j]) % 2 == 0){

                //Вывод элементов массива сумма которых четная
                System.out.println("Элемент массива 1");
                System.out.println(chars[i]);
                //System.out.println("Порядковый номер элемента массива 1");
                //System.out.println(i);
                System.out.println("Элемент массива 2");
                System.out.println(chars[j]);
                //System.out.println("Порядковый номер элемента массива 2");
                //System.out.println(j);
            }

            //Переменная для выборки второго элемента массива
            j = j + 1;
            }
        }
    }