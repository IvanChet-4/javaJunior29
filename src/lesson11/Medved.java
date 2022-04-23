package lesson11;

public class Medved extends AbstractAnimal{
    @Override
    public void printHaveShvost() {
        System.out.println("Нет хвоста");
    }

    @Override
    public void voice() {
        System.out.println("ррррыууу");
    }
}
