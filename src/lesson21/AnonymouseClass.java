package lesson21;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class AnonymouseClass {

    public static void print(List<String> strings, A a){
        for (String string : strings) {
            if (a.test(string)) System.out.println(string);

        }

    }

    public static void main(String[] args) {
//        List<String> strings = List.of("STD","Model","Car","Every");
// print(strings, new A() {
//     @Override
//     public boolean test(String s) {
//         return s.startsWith("M");
//     }
// });
        Car car = new Car("BMW","Blue", 200);
        Car car2 = new Car("BMW","Blue", 200);
        Car car3 = new Car("BMW","Blue", 200);

        TreeSet<Car> cars = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car car, Car o2) {
                return car.maxSpeed.compareTo(o2.maxSpeed);
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        }

    }

interface A{
    boolean test(String s);
}

class B implements A{

    @Override
    public boolean test(String s) {
        return s.startsWith("f");
    }
}