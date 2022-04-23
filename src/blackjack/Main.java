package blackjack;

public class Main {
    public static void main(String[] args) {
 BlackJack blackJack = new BlackJack();

 Player player1 = new Player("Вася");
 Player player2 = new Player("Петя");
 Dealer dealer = new Dealer();

        blackJack.addPlayer(player1);
        blackJack.addPlayer(player2);
        blackJack.addPlayer(dealer);

        blackJack.dealTwoCards();
        blackJack.dealAllCards();
        blackJack.printWinner();
    }

}
