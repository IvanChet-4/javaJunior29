package homework7;

public class krug {

    //Круг
    public static class Krug{
        private String name;
        private int radius;

        //Constructor
        public Krug(String name, int radius) {
            this.name = name;
            this.radius = radius;
        }

        //public Krug(){}

        //Setter
        public void setName(String name) {this.name = name;}

        public int setRadius(int radius) {
            if (radius > 0) {
                this.radius = radius;
            } else {
                System.out.println("Ошибка! Радиус не может быть отрицательным числом!");
            }
            return radius;
        }

        //Getter
        public String getName() {
            return name;
        }

        public int getRadius() {
            if (radius == 1){
                radius = radius + 7;
                return radius;
            }else{
            return radius;
        }}
    }
}