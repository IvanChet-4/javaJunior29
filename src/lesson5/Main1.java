package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        //Страна, Время, количество дней, цена, звезды
        String[][] tours = {
                {"Италия", "40000", "7 дней", "самолет", "4 звезды"},
                {"Франция", "50000", "5 дней", "самолет", "4 звезды"},
                {"Норвегия", "86000", "6 дней", "автобус", "3 звезды"},
                {"Норвегия", "110000", "7 дней", "самолет", "5 звезды"},
                {"Мальдивы", "200000", "3 дней", "самолет", "3 звезды"},
                {"Мальдивы", "250000", "8 дней", "автобус", "3 звезды"},
                {"Италия", "60000", "11 дней", "самолет", "4 звезды"}
        };// {{}} 1-я строка, построчный ввод массива

        //1 - выбор тура по бюджету
        Scanner scanner = new Scanner(System.in);
        //System.out.println("На какой бюджет расчитываете?");
        //String moneyToTrip = scanner.nextLine();

        //То что сделали на занятии, предел расчитываемого бюджета
        //ToursUtils.printToursByMoney(tours, moneyToTrip);
        //Средняя стоимость тура
        //ToursUtils.printAverageCost(tours);

        //ДЗ Выбор тура по указанной пользователем стране; Средняя стоимость тура по указанной стране
        System.out.println("В какую страну желаете отправиться?");
        String CountryTour = scanner.nextLine();
        ToursUtils.printCountryTour(tours, CountryTour);

        //ДЗ Выбор тура по указанной длительности
        System.out.println("На сколько дней планируете тур?");
        String CoutDayTour = scanner.nextLine();
        ToursUtils.printCoutDayTour(tours, CoutDayTour);


        }

}
