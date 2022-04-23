package lesson14_1;
//Ассоциативный массив, индекс в виде уникального ключа

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> tablo = new HashMap<>();
        tablo.put("Динамо", 23);
        tablo.put("ЦСК", 15);
        tablo.put("Спартак", 38);
        tablo.put("Динамо", 10 + tablo.get("Динамо"));

       // System.out.println(tablo);

        //проход с помощью keySet
        for (String comanda : tablo.keySet()) {
            System.out.println(comanda + "-" +tablo.get(comanda));
        }

        //Entry Map.Entry<String, Integer>
        //проход по map
        for (Map.Entry<String,Integer> para: tablo.entrySet()){
            System.out.println(para.getKey() + "-" + para.getValue());

        }

    }
}