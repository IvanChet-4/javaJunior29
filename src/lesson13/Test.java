package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
        arrayList.add("seferf" + i);
    }

    long end1 = System.currentTimeMillis();
    System.out.println("ADD  arraylist:" + (end1 - start1));

    long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
        linkedList.add("seferf" + i);
}
    long end2 = System.currentTimeMillis();
    System.out.println("ADD  linkedlist:" + (end2 - start2));

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            linkedList.get(i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("GET  linkedlist:" + (end3 - start3));

        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            arrayList.get(i);
        }
        long end4 = System.currentTimeMillis();
        System.out.println("GET  arraylist:" + (end4 - start4));


        long start5 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            linkedList.set(i, "seferf");
        }
        long end5 = System.currentTimeMillis();
        System.out.println("ADD  arraylist:" + (end5 - start5));
    }
    }