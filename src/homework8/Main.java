package homework8;

public class Main {
    public static void main(String args[]) {

        //Прямоугольник
        Pryamougol pryamougol1 = new Pryamougol("Прямоугольник 1", "metal", 5, 5);
        Pryamougol pryamougol2 = new Pryamougol("Прямоугольник 2", "derevo", 5, 7);
        System.out.println("\n" + pryamougol1.getName() +
                " " + pryamougol2.getName() +
                " " + pryamougol1.getMaterial() +
                " " + pryamougol2.getMaterial() +
                " " + pryamougol1.getStorona() +
                " " + pryamougol2.getStorona() +
                " " + pryamougol1.getStorona2() +
                " " + pryamougol2.getStorona2() +
                " " + pryamougol1.hashCode() +
                " " + pryamougol2.hashCode() +
                "\n");

        //Квадрат
        Kvadrat kvadrat1 = new Kvadrat("Квадрат 1","olovo", 2);
        System.out.println("\n" + kvadrat1.getName() +
                " " + kvadrat1.getMaterial() +
                " " + kvadrat1.getStorona() +
                " " + kvadrat1.hashCode() + "\n");

    //Круг
    Krug krug1 = new Krug("Круг 1","gkl",2);
        System.out.println("\n" + krug1.getName() +
                " " + krug1.getMaterial() +
                " " + krug1.getRadius() +
                " " + krug1.hashCode() + "\n");

        //Овал
        Oval oval1 = new Oval("Овал 1","dsp",2,4);
        System.out.println("\n" + oval1.getName() +
                " " + oval1.getMaterial() +
                " " + oval1.getRadius() +
                " " + oval1.getRadius2() +
                " " + oval1.hashCode() + "\n");

        //Фигура
        Figure figure1 = new Figure("Фигура 1","plastic");
        System.out.println("\n" + figure1.getName() +
                " " + figure1.getMaterial() +
                " " + figure1.hashCode());
    }
}

