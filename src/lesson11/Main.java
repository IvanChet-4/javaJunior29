package lesson11;

public class Main {
    //Класс                    Интерфейс
    //-переменные               -переменные (public, static, final)
    //-конструкторы             -нет конструкторов т.к. абстрактность
    //-методы                   -все методы (public abstract)

    //абстрактные классы - смешанный класс (помимо двух выше перечисленных)
    //-переменные
    //-конструкторы
    //-методы
    //1-невозможно создать объект
    //2-могут быть абстакт методы (без тела)

    //Object (для всех всегда)
    //ZooAnimal
    //AbstrctAnimal (общие повторяющиеся методы; абстрактный класс минус дублирование кода)
    //Tiger             Slon          Medved  (реализуем лишь уникальные методы)

    //4-е парадигмы ООП
    //1) инкапсуляция - регулировка области видимости(модификатор доступа)
    //-перед классом, переменной, конструктором, методом
    //2) наследование - чтобы убрать дубляж кода
    //3) полиморфизм - /**
    //Это свойство джавы, которое проявляется в момент запуска программы
    //свойство позволяет работать с разными типами данных как с одним и тем же типом
    //но реализация программы отрабатывает как-будто мы работаем с разными типами
    //**/
    //4) абстрактность (двух уровневое приложение за счет интерфейсов)
    //новая парадигма; интерфейсов может быть неограниченное количество


    //Tiger[] tiger = new Tiger[6];
    //Abst[] tiger = new Abst[6];
    //ZooAn[] tiger = new ZooAn[6];
    //Object[] tiger = new Object[6];
    //Разница в количестве методов. Приоритет нижний вариант Abst.

    public static void main(String[] args) {
        Slon slon1 = new Slon();
        Slon slon2 = new Slon();
        Tigr tigr1 = new Tigr();
        Tigr tigr2 = new Tigr();
        Medved medved1 = new Medved();
        Medved medved2 = new Medved();

  AbstractAnimal[] animals= new AbstractAnimal[6];
        animals[0] = medved1;
        animals[1] = medved2;
        animals[2] = tigr1;
        animals[3] = tigr2;
        animals[4] = slon1;
        animals[5] = slon2;

  //for each

        for (AbstractAnimal currentAnimal:animals){
            currentAnimal.voice();//проявление полиморфизма
        }


    }


}
