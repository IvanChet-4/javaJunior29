package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //int -->integer
        //double -->Double
        //char -->Character
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(0,999);
        numbers.remove(9);// удаляет или объект или объект по индексу
        numbers.set(0, 444);//замена
        System.out.println(numbers);

        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(4);
        numbers1.add(7);
        numbers1.add(9);
        numbers1.add(0,999);
        numbers1.remove(9);// удаляет или объект или объект по индексу
        numbers1.set(0, 444);//замена
        System.out.println(numbers1);
        //ArrayList LinkedList
        //методы одинаковые; скорость отработки определенных методов в этом разница
        //ДЗ самый слабый метод в Linked List tests

    }
}
