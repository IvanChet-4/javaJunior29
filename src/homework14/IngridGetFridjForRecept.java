package homework14;

import java.util.HashMap;

public class IngridGetFridjForRecept {

    private HashMap<String, Integer> products = new HashMap<>();

    //добавить продукт в рецепт
    public void putProduct(String product, int value){
        if(products.containsKey(product)){
            products.put(product, value + products.get(product));
        }else{ products.put(product, value);
        }
    }
    //вывести на экран
    public void printAllProducts(){
        for (String product:products.keySet()) {
            System.out.println(product + "-" + products.get(product));
        }
    }

    //забрать продукты
    public void getProduct(String product, int value){
        if (!products.containsKey(product)){
      //      System.out.println("Такого продукта нет-" + product);
            return;
        }
        if (products.get(product) < value){
        //    System.out.println("Мы взяли только " + products.get(product) + "." + "Еще не хватает - " + (value - products.get(product)) + ".");
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - value);
        //System.out.println("Все взяли - " + product + " " + value);
    }

}
