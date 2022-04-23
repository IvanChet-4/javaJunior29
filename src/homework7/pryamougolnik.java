package homework7;

public class pryamougolnik {

    //Прямоугольник
    public static class Pryamougolnik{

      private String name;
      private int storona1;
      private int storona2;
      private int storona3;
      private int storona4;

      //Constructor
        public Pryamougolnik(String name, int storona1, int storona2, int storona3, int storona4) {
            this.name = name;
            this.storona1 = storona1;
            this.storona2 = storona2;
            this.storona3 = storona3;
            this.storona4 = storona4;
        }

        //Setter
        public void setName(String name) {
            this.name = name;
        }

        public void setStorona1(int storona1) {
            this.storona1 = storona1;
        }

        public void setStorona2(int storona2) {
            this.storona2 = storona2;
        }

        public void setStorona3(int storona3) {
            this.storona3 = storona3;
        }

        public void setStorona4(int storona4) {
            this.storona4 = storona4;
        }

        //Getter
        public String getName() {
            return name;
        }

        public int getStorona1() {
            return storona1;
        }

        public int getStorona2() {
            return storona2;
        }

        public int getStorona3() {
            return storona3;
        }

        public int getStorona4() {
            return storona4;
        }
    }
}
