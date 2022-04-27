package lesson17;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(12);
        } catch (UncurrentAgeException e) {
            e.printStackTrace();
        }
        System.out.println("!!!");
    }
}
