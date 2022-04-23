package homework14;

import java.util.*;

public class Fridj {
    private HashMap<String, Integer> products = new HashMap<>();

    //name, mass
    //добавить продукт в холодильник
    public void putProduct(String product, int value) {
        if (products.containsKey(product)) {
            products.put(product, value + products.get(product));
        } else {
            products.put(product, value);
        }
    }

    //вывести на экран что в холодильнике
    public void printAllProducts() {
        for (String product : products.keySet()) {
            System.out.println(product + "-" + products.get(product));
        }
    }



//    public void getProv(String product, int value, String NameFoods, int FoodValue){
//        if(product == NameFoods){
//            if (products.get(product) > FoodValue){
//            System.out.println(product +" - "+ products.get(product) + "этого достаточно для приготовления");
//        }
//            if (products.get(product) < FoodValue){
//                System.out.println(product +" - "+ products.get(product) + "этого не достаточно для приготовления");
//            }
//        }else
//        if(product != NameFoods) {
//            System.out.println("Такого нет.");
//        }
//    }
//            return 1;
//        }return 1;}

    //взять продукты из холодильника
    public void getProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет-" + product);
            return;
        }
        if (products.get(product) < value) {
            System.out.println("Мы взяли только  " + products.get(product) + "." + "Еще не хватает - " + (value - products.get(product)) + ".");
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - value);
        System.out.println("Все взяли - " + product + " " + value);
    }


    public int getProvValue(String foods1) {
        for (String product : products.keySet()) {
        if (products.get(foods1) == products.get(product)){
            System.out.println(products.get(product));
            return products.get(product);
        }
        return 0;
    }
        return 0;
}
}