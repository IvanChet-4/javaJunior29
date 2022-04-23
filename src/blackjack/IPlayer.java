package blackjack;

public interface IPlayer {

    void addCardToHand(ICard card);

    boolean needMoreCards();

    void openHand();

    int countValuesHand();

    boolean isInGame();
    void setInGame(boolean inGame);
    String getName();
}
