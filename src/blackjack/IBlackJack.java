package blackjack;

public interface IBlackJack {

    void addPlayer(IPlayer player);

    void dealTwoCards();

    void dealAllCards();

    void printWinner();

}
