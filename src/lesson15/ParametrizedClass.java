package lesson15;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedClass {
    public static void main(String[] args) {
        Example<Double> stringExample = new Example<>();
       // Example<Integer, Double> stringExample = new Example<>();
        //stringExample.
     //   List<Object> objecrs = new ArrayList<String>();
        //left compile  right runtime
     //   List<?> objecrs = new ArrayList<String>();
       //?-superclass любой тип
        List<String> strings = new ArrayList<>();
        strings.add("sdsd");
        strings.add("sdsd");
        strings.add("sdsd");
        strings.add("sdsd");
        stringExample.printElementCollection(strings);



    }
}
//тип данных узнаем при использовании T,E,K,V (МОЖНО И ПРОИЗВОЛЬНЫЕ, обычно больше 4-х не бывает)
//class Example<T, E> {
//    T value;
//    E value1;
//
//    public void showValue() {
//        System.out.println(value1);
//        System.out.println(value);
//    }

    class Example<T extends Number> {
    T value;



    public <V> void printElementCollection(List<V> values) {
        for (V v:values ) {
            System.out.println(v);
        }
    }

//    public <R, L> R mapper(L from,R to){
//
//    }

}