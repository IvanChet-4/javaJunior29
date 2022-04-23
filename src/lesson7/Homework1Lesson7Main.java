package lesson7;

public class Homework1Lesson7Main {

        public static void main(String[] args) {

            //Круг
            //=======================================================================
            Homework1Lesson7Figure.Krug krug1 = new Homework1Lesson7Figure.Krug("Круг", 1, 2, 3, 4);
            // System.out.println(krug1.getDiametr());

            String krug1Name = krug1.getName();
            int krug1Radius = krug1.getRadius();
            int krug1Diametr = krug1.getDiametr();
            int krug1Perimetr = krug1.getPerimetr();
            int krug1Square = krug1.getSquare();

            System.out.println();
            System.out.println("Название круга : " + krug1Name);
            System.out.println("Радиус круга: " + krug1Radius);
            System.out.println("Диаметр круга: " + krug1Diametr);
            System.out.println("Периметр круга: " + krug1Perimetr);
            System.out.println("Площадь круга: " + krug1Square);

            System.out.println();
            //============================================================


            //Треугольник
            //========================================================
            Homework1Lesson7Figure.Treugol treugol1 = new Homework1Lesson7Figure.Treugol("Треугольник", 1, 2, 3);

            String treugol1Name = treugol1.getName();
            int treugol1Storona1 = treugol1.getStorona1();
            int treugol1Storona2 = treugol1.getStorona2();
            int treugol1Storona3 = treugol1.getStorona3();

            System.out.println("Название треугольника : " + treugol1Name);
            System.out.println("Сторона треугольника 1 : " + treugol1Storona1);
            System.out.println("Сторона треугольника 2 : " + treugol1Storona2);
            System.out.println("Сторона треугольника 3 : " + treugol1Storona3);

            System.out.println();
            //============================================================


            //Прямоугольник
            //========================================================
            Homework1Lesson7Figure.Pryamougol pryamougol1 = new Homework1Lesson7Figure.Pryamougol("Прямоугольник", 1, 2, 3, 4);

            String pryamougol1Name = pryamougol1.getName();
            int pryamougol1Storona1 = pryamougol1.getStorona1();
            int pryamougol1Storona2 = pryamougol1.getStorona2();
            int pryamougol1Storona3 = pryamougol1.getStorona3();
            int pryamougol1Storona4 = pryamougol1.getStorona4();

            System.out.println("Название прямоугольника : " + pryamougol1Name);
            System.out.println("Сторона прямоугольника 1 : " + pryamougol1Storona1);
            System.out.println("Сторона прямоугольника 2 : " + pryamougol1Storona2);
            System.out.println("Сторона прямоугольника 3 : " + pryamougol1Storona3);
            System.out.println("Сторона прямоугольника 4 : " + pryamougol1Storona4);

            System.out.println();
            //============================================================


            //Квадрат
            //========================================================
            Homework1Lesson7Figure.Kvad kvad1 = new Homework1Lesson7Figure.Kvad("Квадрат", 1, 2, 3, 4);

            String kvad1Name = kvad1.getName();
            int kvad1Storona1 = kvad1.getStorona1();
            int kvad1Storona2 = kvad1.getStorona2();
            int kvad1Storona3 = kvad1.getStorona3();
            int kvad1Storona4 = kvad1.getStorona4();

            System.out.println("Название квадрата : " + kvad1Name);
            System.out.println("Сторона квадрата 1 : " + kvad1Storona1);
            System.out.println("Сторона квадрата 2 : " + kvad1Storona2);
            System.out.println("Сторона квадрата 3 : " + kvad1Storona3);
            System.out.println("Сторона квадрата 4 : " + kvad1Storona4);

            System.out.println();
            //============================================================


            //Овал
            //========================================================
            Homework1Lesson7Figure.Oval oval1 = new Homework1Lesson7Figure.Oval("Овал", 1, 2, 3, 4);

            String oval1Name = oval1.getName();
            int oval1Radius1 = oval1.getRadius1();
            int oval1Radius2 = oval1.getRadius2();
            int oval1Diametr1 = oval1.getDiametr1();
            int oval1Diametr2 = oval1.getDiametr2();

            System.out.println("Название овала : " + oval1Name);
            System.out.println("Радиус овала 1 : " + oval1Radius1);
            System.out.println("Радиус овала 2 : " + oval1Radius2);
            System.out.println("Диаметр овала 1 : " + oval1Diametr1);
            System.out.println("Диаметр овала 2 : " + oval1Diametr2);

            System.out.println();
        }
    }