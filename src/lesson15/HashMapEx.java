package lesson15;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Иван",4);
        Student student2 = new Student(2,"Елена",2);
        Student student3 = new Student(3,"Инна",1);
        Student student4 = new Student(4,"Петр",5);
        Student student5 = new Student(1,"Иван",4);

        //   Map<String,Student> studentMap = new HashMap<>();
    //массив 16 элементов-корзин(бэккитов), корзина - LinkedList
        // каждый линкедлист типизирован нодой(карточка элемента)
      //  studentMap.put("Биология", student1);
        Map<Student, Double> studentMap = new HashMap<>(32,75);//при загрузке в 75% увеличивается в два раза
        studentMap.put(student5, 6.7);
        studentMap.putIfAbsent(student1, 7.9);



        //коллизия - одинаковый хэшкод у элементов
        List<String> strings = new LinkedList<>();
        studentMap.get(student1);
        System.out.println(studentMap);

        //studentMap.containsKey();

    }

}
