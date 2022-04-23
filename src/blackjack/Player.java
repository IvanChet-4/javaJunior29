package blackjack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer{
private String name;
private ArrayList<ICard> handsCards = new ArrayList<>();
private boolean inGame = true;

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public String getName() {
        return name;
    }

    public Player(String name){
    this.name = name;
}

    @Override
    public void addCardToHand(ICard card) {
     handsCards.add(card);
    }

    @Override
    public boolean needMoreCards() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", ваши карты : ");
        this.openHand();
        System.out.println("-------------------------");
        System.out.println("Нужна ли еще одна карта ? ");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("да")){
            return true;}
    return false;
    }

    @Override
    public void openHand() {
for (ICard card:handsCards){
    card.open();
}
    }

    @Override
    public int countValuesHand() {
    int values = 0;
    for (ICard card:handsCards){
        values = values + card.getValue();
    }
    return values;
    }
}