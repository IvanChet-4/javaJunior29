package lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestStudent {

    public static void filteringByAge(List<Student> students, int age){
        for (Student student : students) {
            if (student.getAge() < age) System.out.println(student);
        }
    }

    public static void filteringByCourse(List<Student> students, int course){
        for (Student student : students) {
            if (student.getCourse() < course) System.out.println(student);
        }
    }

    public static void filteringByCondition(List<Student> students, int age, int id, String firstName){
        for (Student student : students) {
            if (student.getAge() > age && student.getId() <= id && student.getFirstName().endsWith(firstName))
                System.out.println(student);
        }

    }

    public static void filteringByCheck(List<Student> students, StudentPredicate predicate){
        for (Student student : students) {
            if (predicate.check(student)) System.out.println(student);
        }
    }

public static void printStudent(List<Student> students, Consumer<Student> consumer){
    for (Student student : students) {
        consumer.accept(student);
    }
}
    public static void main(String[] args) {
        Student student = new Student(1,"Alex","Petrov",3,7.5,27);
        Student student1 = new Student(2,"Elena","Lenena",1,8.1,23);
        Student student2 = new Student(3,"Ivan","Ivanov",3,9.5,31);
        Student student3 = new Student(4,"Denis","Sidorov",5,6.3,34);
        Student student4 = new Student(5,"Inna","Minina",4,9.0,24);
        Student student5 = new Student(6,"Pavel","Krylov",1,7.0,26);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        filteringByAge(students, 25);
        System.out.println("------------\n");
        filteringByCourse(students, 2);
        System.out.println("------------\n");
        filteringByCondition(students,25,3,"a");
        System.out.println("------------\n");


        Predicate<Student> predicate = (Student s) -> s.getMarkAvg() < 9.0;
        filteringByCheck(students, (Student std) -> {return std.getId() > 2;});


        printStudent(students, s ->{
            System.out.println(s);
            s.setCourse(s.getCourse()+1);
            s.setAge(s.getAge()+1);
            System.out.println(s);
            System.out.println(s.getMarkAvg());
        });

        System.out.println("--------------------");
        printStudent(students, System.out::println);
        students.forEach(System.out::println);//href on method!!!!

//(students, std -> return std.getId() > 2);
// {;return;}
        //()-no parametrs
        //two parameters ()

    }
}

interface StudentPredicate{
    boolean check(Student student);
}
//class StudentPredicateImpl implements StudentPredicate{
//    @Override
//    public boolean check(Student student) {
//        return student.getFirstName().endsWith("v");
//    }
//}

//for lambda need 1 interface and 1 abstract method!!!!!!!