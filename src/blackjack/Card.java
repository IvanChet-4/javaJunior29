package blackjack;

public class Card implements ICard{

    private String name;
    private int value;

    public Card() {
    }

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void open() {
        System.out.println(name);
    }
}
