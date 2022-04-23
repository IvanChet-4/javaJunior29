package lesson13;
import java.util.HashSet;
import java.util.Iterator;

public class Main2 {
        public static void main(String[] args) {
            HashSet<String> strings = new HashSet<>();
            strings.add("qqq");
            strings.add("www");
            strings.add("rrr");
            strings.add("eee");
            strings.add("www");
            strings.add("www");
//            System.out.println(strings);
        //Проход с помощью итератора

            for (Iterator<String> iter = strings.iterator();iter.hasNext();) {
                System.out.println(iter.next());
            }
        }
    }