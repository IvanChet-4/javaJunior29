package homework11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Вставка 100 элементов в середину списка LinkedList
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(new Integer(i));
        }

        long start=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            //200000 индекс вставка
            list.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis()-start));

        //Вставка 100 элементов в середину списка ArrayList
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list2.add(new Integer(i));
        }

        long start2=System.currentTimeMillis();

        for (int i=0;i<100;i++){
            list2.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для ArrayList (в миллисекундах) = " + (System.currentTimeMillis()-start2));
    }
    }