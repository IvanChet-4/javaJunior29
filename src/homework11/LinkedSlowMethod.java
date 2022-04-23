package homework11;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedSlowMethod {
        public static void main(String args[]) {

            // Создаем список
            LinkedList<String> list = new LinkedList<String>();

            // Добавляем 10 элементов
            list.add("Element 1");
            list.add("Element 2");
            list.add("Element 3");
            list.add("Element 4");
            list.add("Element 5");
            list.add("Element 6");
            list.add("Element 7");
            list.add("Element 8");
            list.add("Element 9");
            list.add("Element 10");

            //GET
            //===================================
            // Выводим весь список
            System.out.println("Выводим созданный LinkedList:" + list);

            System.out.println("Цикл for для get начался.......");

            long start=System.currentTimeMillis();
            // Выводим элементы методом get()
            for(int i = 0; i<list.size(); i++) {
                System.out.printf("Элемент с индексом %s : %s \n", i , list.get(i));
            }
            System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis()-start));
            System.out.println("Цикл for для get закончился.......");
            //===================================

            LinkedList<String> list2 = new LinkedList<String>();

            // Добавляем 10 элементов
            list2.add("Element 1");
            list2.add("Element 2");
            list2.add("Element 3");
            list2.add("Element 4");
            list2.add("Element 5");
            list2.add("Element 6");
            list2.add("Element 7");
            list2.add("Element 8");
            list2.add("Element 9");
            list2.add("Element 10");

            //SET
            //===================================
            // Список
            System.out.println("LinkedList:" + list2);
            System.out.println("Цикл for для set начался.......");
            long start2=System.currentTimeMillis();
            for (String alpha : list2)
            {
                System.out.println(alpha);
            }
            Set<String> alphaSet = new HashSet<String>(list2);
            System.out.println("\n Set values .....");
            for (String alpha : alphaSet)
            {
                System.out.println(alpha);
            }
            System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis()-start2));
            System.out.println("Цикл for для set закончился.......");
            //===================================
        }
    }