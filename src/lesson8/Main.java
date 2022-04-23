package lesson8;

public class Main {
    //ДЗ создать типы:
    //овал, круг, прямоугольник, квадрат
    //отдельный класс Фигура поля класса: название, материал
    //дочерний класс круг поля: радиус
    //от класса круг идет овал поля: второй радиус
    //квадрат и прямоугольник






// *фигура
    //имя
    //путь к картинки
    //*овал
    //extends все что в классе фигура принадлежит овал
    //добавляем радиус 1 и радиус 2
    //наследование
    //является ли дочерним классом овал фигура
    public static void main(String[] args){
        Pramoygolnik pramoygolnik1 = new Pramoygolnik(3,5);
        Pramoygolnik pramoygolnik2 = new Pramoygolnik(3,5);
    int plPram1 = pramoygolnik1.ploshad();
        System.out.println(plPram1);

        int perPram1 = pramoygolnik1.periment();
        System.out.println(perPram1);

        System.out.println(pramoygolnik1.equals(pramoygolnik2));
        //pramoygolnik1.

        //Переопределение метода - переписываем логику родительского метода
        System.out.println(pramoygolnik1.hashCode());
        System.out.println(pramoygolnik2.hashCode());


        System.out.println(pramoygolnik1.toString());
//notify, wait -переопределяем в многопоточных задачах

    }


}
