package homework7;

public class oval {

    //Овал
    public static class Oval{

        private String name;
        private int radius1;
        private int radius2;

        //Constructor
        public Oval(String name, int radius1, int radius2) {
            this.name = name;
            this.radius1 = radius1;
            this.radius2 = radius2;
        }

        //Setter
        public void setName(String name) {
            this.name = name;
        }

        public void setRadius1(int radius1) {
            this.radius1 = radius1;
        }

        public void setRadius2(int radius2) {
            this.radius2 = radius2;
        }

        //Getter
        public String getName() {
            return name;
        }

        public int getRadius1() {
            return radius1;
        }

        public int getRadius2() {
            return radius2;
        }
    }
}
