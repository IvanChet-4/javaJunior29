package lesson11;

public abstract class AbstractAnimal implements ZooAnimal{
   //abstract разрешает недореализовывать какие-нибудь методы
    private int age;
    private String name;
    private String description;

    public AbstractAnimal() {
    }

    public AbstractAnimal(int age, String name, String description) {
        this.age = age;
        this.name = name;
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void run() {
        System.out.println(this.name + " бегает");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " прыгает");
    }

    public abstract void printHaveShvost();

}
