package homework13;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        HashSet<Integer> b = new HashSet<>();
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);


        ArrayList<Integer> c = new ArrayList<>();

        ArrayList<Integer> d = new ArrayList<>();

        c.add(1);
        c.add(2);
        d.add(3);
        d.add(4);

        c.retainAll(d);
        System.out.println(c);
   System.out.println(d);

        CollectionUtilsImpl util = new CollectionUtilsImpl();
        System.out.println(util.union(a, b));
        System.out.println(util.intersection(a, b));
        System.out.println(util.unionWithoutDuplicate(a, b));
        System.out.println(util.intersectionWithoutDuplicate(a, b));
        System.out.println(util.difference(a, b));
    }
}