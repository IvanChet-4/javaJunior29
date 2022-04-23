package lesson13;

import java.util.HashSet;


//Collection
//list                           set
//Arraylist; linkedlist;         Hashset
//Хаотично;  Сшиты;              (механизм хеширования)


public class Main {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("qqq");
        strings.add("www");
        strings.add("rrr");
        strings.add("eee");
        System.out.println(strings);
    }
}
