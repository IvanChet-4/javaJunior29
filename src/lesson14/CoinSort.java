package lesson14;

import java.util.Collection;
import java.util.TreeSet;

public class CoinSort {
    public static void printCoinByMetall(TreeSet<Coin> coins){
        TreeSet<Coin> coinsByMetall = new TreeSet<>(new SortByMetallComparator());
        //Способ сортировки, если нет, то сортировку по классу в начале
        coinsByMetall.addAll(coins);
        for (Coin coin:coinsByMetall){
            System.out.println(coin);
        }
    }
    public static void printCoinByNominal(TreeSet<Coin> coins){
        TreeSet<Coin> coinsByMetall = new TreeSet<>();
        //Способ сортировки, если нет, то сортировку по классу в начале
        coinsByMetall.addAll(coins);
        for (Coin coin:coinsByMetall){
            System.out.println(coin);
        }
    }

    public static void printCoinByYearFromTo(){

    }
}
