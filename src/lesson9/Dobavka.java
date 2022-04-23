package lesson9;

public abstract class Dobavka implements Baking{

    Baking baking;
    public Dobavka(Baking baking) {
        this.baking = baking;
    }

    @Override
    public void about() {
        System.out.println(getDescription() + "и его цена" + getPrice());
    }



}
