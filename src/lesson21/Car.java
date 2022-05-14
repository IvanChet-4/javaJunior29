package lesson21;

public class Car implements Comparable<Car> {
    String model;
    String color;
    Integer maxSpeed;
    Engine engine;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;//, Engine engine
        this.color = color;
        this.maxSpeed = maxSpeed;
//        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
//                ", engine=" + engine +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }

    public static class Engine{
        long horsePower;

        public Engine(long horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
//     Car.Engine engine = new Car.Engine(100);
//        System.out.println(engine);
//        Car car = new Car("BMV", "f", 100, engine);
//        System.out.println(car);


    }
}