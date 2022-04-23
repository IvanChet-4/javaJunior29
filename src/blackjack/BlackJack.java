package blackjack;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {

    private Koloda koloda = new Koloda();
    //Array List один из (безразмерные массивы 3-и вида, коллекции)
    private ArrayList<IPlayer> players = new ArrayList<>();
    //<>- дженерики

    @Override
    public void addPlayer(IPlayer player) {
        players.add(player);
    }

    @Override
    public void dealTwoCards() {
        for (IPlayer player : players) {
            player.addCardToHand(koloda.getRandomCard());
            player.addCardToHand(koloda.getRandomCard());
        }
    }

    @Override
    public void dealAllCards() {
        for (IPlayer player : players) {
            while (player.needMoreCards()) {//полиморфизм
                player.addCardToHand(koloda.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {
//21 21 34 19 18   //21 21
//19 22 34 19 18     //19 19
//19 20 34 19 18 //20
//23 25 34 22 24 //dealer!!!

        //inGame устанавливаем флаг не в игре у кого больше 21
        for (IPlayer player : players) {
            if (player.countValuesHand() > 21) {
                //players.remove(player);
                player.setInGame(false);
            }
        }

        //если у всех перебор, выиграл крупье
        if (countPlayersInGame() == 0) {
            for (IPlayer player : players) {
                if (player instanceof Dealer) {
                    System.out.println("--------");
                    System.out.println("-----ПОБЕДИТЕЛЬ : " + player.getName());
                    player.openHand();
                }
            }
        }
        //узнаем какое чило выигрышное
        //23 34 21 19 21
        int winnerValue = 0;
        for (IPlayer player : players) {
            if (player.isInGame() && player.countValuesHand() > winnerValue) {
                winnerValue = player.countValuesHand();
            }
        }

        //печатаем победителей
        for (IPlayer player : players) {
            if (player.isInGame() && player.countValuesHand() > winnerValue) {
                System.out.println("-----------");
                System.out.println("-----ПОБЕДИТЕЛЬ : " + player.getName());
                player.openHand();
            }
        }
    }

    public int countPlayersInGame() {
        int count = 0;
        for (IPlayer player : players) {
            if (player.isInGame()) {
                count++;
            }
        }
        return count;
    }
}
