package lesson15;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Иван",4);
        Student student2 = new Student(2,"Елена",2);
        Student student3 = new Student(3,"Инна",1);
        Student student4 = new Student(4,"Петр",5);
        Student student5 = new Student(1,"Иван",4);




        TreeMap<Student,Integer> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });

        treeMap.put(student1,2);
        treeMap.put(student2,3);
        treeMap.put(student3,5);
        treeMap.put(student4,1);
        treeMap.put(student5,6);
        //сортирует по таблице ASCII
        System.out.println(treeMap);
        //comparable - норм сортировка
        //compareto -

     //  new String().compareTo(treeMap);//возвращает целочисленное значение

    }
}
