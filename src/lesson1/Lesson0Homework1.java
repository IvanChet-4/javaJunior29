package lesson1;

public class Lesson0Homework1 {

    public static void main(String[] args) {
        //Исходные переменные
        int money = 1000;
        System.out.println("Исходное количество денег:" + money);
        int pizza = 230;
        int bubblegum = 26;
        double cuker = 2.5;

        //Вычисления:
int bypizza = money / pizza;
int afterbypizza = money % pizza;
int bybubblegum = afterbypizza / bubblegum;
int afterbybubblegum = afterbypizza % bubblegum;
int bycuker = (int) (afterbybubblegum / cuker);
double ostatok = afterbybubblegum - bycuker * cuker;

//Вывод значений
        System.out.println("Количество купленной пиццы:" + bypizza);
        System.out.println("Количество купленной жевательной резинки:" + bybubblegum);
        System.out.println("Количество купленных конфет:" + bycuker);

        //Проверка соответствия исходному значению, контрольная сумма:
        //int sum = (int)(ostatok + bypizza * pizza + bybubblegum * bubblegum + bycuker * cuker);
        //System.out.println("Должно быть ровно исходному количеству денег (переменная money)" + sum);

        //Если сдача равна целому числу, то преобразуем ответ в целое число:
        if (ostatok % 1 == 0){
      int ostatokint = (int) (ostatok);
       System.out.println("Сдача:" + ostatokint);
    }else if (ostatok % 1 != 0){
            System.out.println("Сдача:" + ostatok);
        }
    }}

