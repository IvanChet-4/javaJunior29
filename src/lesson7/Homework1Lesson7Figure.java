package lesson7;

public class Homework1Lesson7Figure {
    //Круг, треугольник, прямоугольник, квадрат, овал

    //Круг
    //==============================================
    public static class Krug {

        private String name;
        private int radius;
        private int diametr;
        private int perimetr;
        private int square;

        //Constructor Krug
        public Krug(String name, int radius, int diametr, int perimetr, int square) {
            this.name = name;
            this.radius = radius;
            this.diametr = diametr;
            this.perimetr = perimetr;
            this.square = square;
        }

        //Setter Krug
        public void setName(String name) {
            this.name = name;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public void setDiametr(int diametr) {
            this.diametr = diametr;
        }

        public void setPerimetr(int perimetr) {
            this.perimetr = perimetr;
        }

        public void setSquare(int square) {
            this.square = square;
        }

        //Getter Krug
        public String getName() {
            return name;
        }

        public int getRadius() {
            return radius;
        }

        public int getDiametr() {
            return diametr;
        }

        public int getPerimetr() {
            return perimetr;
        }

        public int getSquare() {
            return square;
        }
    }
    //============================================

    //Треугольник
    //================================================
    public static class Treugol {

        private String name;
        private int storona1;
        private int storona2;
        private int storona3;

        //Constructor Treugol
        public Treugol(String name, int storona1, int storona2, int storona3) {
            this.name = name;
            this.storona1 = storona1;
            this.storona2 = storona2;
            this.storona3 = storona3;
        }

        //Setter Treugol
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

        //Getter Treugol
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
    }
    //============================================

    //Прямоугольник
    //================================================
    public static class Pryamougol {

        private String name;
        private int storona1;
        private int storona2;
        private int storona3;
        private int storona4;

        //Constructor Pryamougol
        public Pryamougol(String name, int storona1, int storona2, int storona3, int storona4) {
            this.name = name;
            this.storona1 = storona1;
            this.storona2 = storona2;
            this.storona3 = storona3;
            this.storona4 = storona4;
        }

        //Setter Pryamougol
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

        //Getter Pryamougol
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
    //============================================

    //Квадрат
    //================================================
    public static class Kvad {

        private String name;
        private int storona1;
        private int storona2;
        private int storona3;
        private int storona4;

        //Constructor Kvad
        public Kvad(String name, int storona1, int storona2, int storona3, int storona4) {
            this.name = name;
            this.storona1 = storona1;
            this.storona2 = storona2;
            this.storona3 = storona3;
            this.storona4 = storona4;
        }

        //Setter Kvad
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

        //Getter Kvad
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
    //============================================

    //Овал
    //================================================
    public static class Oval {

        private String name;
        private int radius1;
        private int radius2;
        private int diametr1;
        private int diametr2;

        //Constructor Oval
        public Oval(String name, int radius1, int radius2, int diametr1, int diametr2) {
            this.name = name;
            this.radius1 = radius1;
            this.radius2 = radius2;
            this.diametr1 = diametr1;
            this.diametr2 = diametr2;
        }

        //Setter Oval
        public void setName(String name) {
            this.name = name;
        }

        public void setRadius1(int radius1) {
            this.radius1 = radius1;
        }

        public void setRadius2(int radius2) {
            this.radius2 = radius2;
        }

        public void setDiametr1(int diametr1) {
            this.diametr1 = diametr1;
        }

        public void setDiametr2(int diametr2) {
            this.diametr2 = diametr2;
        }

        //Getter Oval
        public String getName() {
            return name;
        }

        public int getRadius1() {
            return radius1;
        }

        public int getRadius2() {
            return radius2;
        }

        public int getDiametr1() {
            return diametr1;
        }

        public int getDiametr2() {
            return diametr2;
        }
    }
}