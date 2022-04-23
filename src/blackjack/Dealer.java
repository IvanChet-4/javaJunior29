package blackjack;

public class Dealer extends Player implements IDealer {

    public Dealer() {
        super("Крупье");
    }

    @Override
    public boolean needMoreCards() {
        if (countValuesHand() < 18) {

        return true;}
        return false;
    }


}
