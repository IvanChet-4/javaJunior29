package homework14;

import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.Date;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

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
            return;
        }
        products.put(product, products.get(product) - value);
    }

    public void prepareIngrid() {
        System.out.println("\n");
        for (String product:products.keySet()) {
            System.out.println("Берем " + product + " в количестве " + products.get(product) + " штук ;");
        }
        System.out.println("Кидаем в кастрюлю...");
        System.out.println("Ждем 60 сек...");
        timer1();
    }

    public static void timer1() {
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable = new Runnable() {
            int countdownStarter = 60;

            public void run() {

                System.out.println(countdownStarter);
                countdownStarter--;

                if (countdownStarter < 0) {
                    System.out.println("Готово!");
                    scheduler.shutdown();
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }
}