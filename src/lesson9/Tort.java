package lesson9;

public class Tort implements Baking{


    @Override
    public long getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Tort";
    }

    @Override
    public void about() {

    }

}
