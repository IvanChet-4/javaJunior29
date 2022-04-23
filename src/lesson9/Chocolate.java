package lesson9;

public class Chocolate extends Dobavka{

    public Chocolate(Baking baking) {
        super(baking);
    }

    @Override
    public long getPrice() {
        return 30 + baking.getPrice();
    }

    @Override
    public String getDescription() {
        return baking.getDescription() + "s chocolate";
    }


}
