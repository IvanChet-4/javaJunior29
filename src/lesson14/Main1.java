package lesson14;

import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1800, 5, 2.5, "Золото");
        Coin coin2 = new Coin(1834, 5, 2.5, "Золото");
        Coin coin3 = new Coin(1234, 4, 3, "а");
        Coin coin4 = new Coin(1235, 6, 4, "За");
        Coin coin5 = new Coin(1236, 7, 6.5, "как");

        TreeSet<lesson14.Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

     CoinSort.printCoinByMetall(coins);
        CoinSort.printCoinByNominal(coins);
    }
}