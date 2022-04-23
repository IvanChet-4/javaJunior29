package homework7;

public class main {
//Полями класса могут быть переменные которые описывают состояние объекта.

    public static void main(String args[]){

        //Круг
        krug.Krug krug1 = new krug.Krug("Круг 1",-8);
        String krug1Name = krug1.getName();
        int krug1Radius = krug1.getRadius();
        int krug1SetRadius = krug1.setRadius(8);
        System.out.println(krug1SetRadius);

        System.out.println("\n" + "Название круга :" + " " + krug1Name +
                "\n" + "Радиус круга :" + " " + krug1Radius + "\n");

        //Треугольник
        treugolnik.Treugolnik treugolnik1 = new treugolnik.Treugolnik("Треугольник 1", 1,2,3);
        String treugolnik1Name = treugolnik1.getName();
        int treugolnik1Storona1 = treugolnik1.getStorona1();
        int treugolnik1Storona2 = treugolnik1.getStorona2();
        int treugolnik1Storona3 = treugolnik1.getStorona3();

        System.out.println("\n" + "Название треугольника :" + " " + treugolnik1Name +
                "\n" + "Певая сторона треугольника :" + " " + treugolnik1Storona1 +
                "\n" + "Вторая сторона треугольника :" + " " + treugolnik1Storona2 +
                "\n" + "Третья сторона треугольника :" + " " + treugolnik1Storona3 + "\n");

        //Прямоугольник
        pryamougolnik.Pryamougolnik pryamougolnik1 = new pryamougolnik.Pryamougolnik("Прямоугольник 1", 1,2,3,4);
        String pryamougolnik1Name = pryamougolnik1.getName();
        int pryamougolnik1Storona1 = pryamougolnik1.getStorona1();
        int pryamougolnik1Storona2 = pryamougolnik1.getStorona2();
        int pryamougolnik1Storona3 = pryamougolnik1.getStorona3();
        int pryamougolnik1Storona4 = pryamougolnik1.getStorona4();

        System.out.println("\n" + "Название прямоугольника :" + " " + pryamougolnik1Name +
                "\n" + "Первая сторона прямоугольника :" + " " + pryamougolnik1Storona1 +
                "\n" + "Вторая сторона прямоугольника :" + " " + pryamougolnik1Storona2 +
                "\n" + "Третья сторона прямоугольника :" + " " +  pryamougolnik1Storona3 +
                "\n" + "Четвертая сторона прямоугольника :" + " " + pryamougolnik1Storona4 + "\n");

        //Квадрат
        kvadrat.Kvadrat kvadrat1 = new kvadrat.Kvadrat("Квадрат 1", 1, 2,3,4);
        String kvadrat1Name = kvadrat1.getName();
        int kvadrat1Storona1 = kvadrat1.getStorona1();
        int kvadrat1Storona2 = kvadrat1.getStorona2();
        int kvadrat1Storona3 = kvadrat1.getStorona3();
        int kvadrat1Storona4 = kvadrat1.getStorona4();

        System.out.println("\n" + "Название квадрата :" + " " + kvadrat1Name +
                "\n" + "Первая сторона квадрата :" + " " + kvadrat1Storona1 +
                "\n" + "Вторая сторона квадрата :" + " " + kvadrat1Storona2 +
                "\n" + "Третья сторона квадрата :" + " " + kvadrat1Storona3 +
                "\n" + "Четвертая сторона квадрата :" + " " + kvadrat1Storona4 + "\n");

        //Овал
        oval.Oval oval1 = new oval.Oval("Овал 1",1,2);
        String oval1Name = oval1.getName();
        int oval1Radius1 = oval1.getRadius1();
        int oval1Radius2 = oval1.getRadius2();

        System.out.println("\n" + "Название овала :" + " " + oval1Name +
                "\n" + "Первый радиус овала :" + " " + oval1Radius1 +
                "\n" + "Второй радиус овала :" + " " + oval1Radius2 + "\n");
    }
}
