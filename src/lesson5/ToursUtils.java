package lesson5;

public class ToursUtils {
    //1 - выбор тура по бюджету
    //2 - Выбор тура по стране дз
    //3 - Средняя стоимость тура куда угодно
    //4 - Средняя стоимость тура в какую-то страну дз
    //5 - печатать туры от ... дней и более (задает пользователь) дз

    public static void printToursByMoney(String[][] tours, String moneyToTrip) {
   //moneyToTrip - 100000
        int moneyFromUser = Integer.parseInt(moneyToTrip);
   for (int i = 0; i < tours.length; i++){
       String tourCostStr = tours[i][1];
       int tourCost = Integer.parseInt(tourCostStr);
       if ((tourCost > moneyFromUser - 20000) && (tourCost < moneyFromUser + 20000)){
           System.out.printf("Тур: %s, %s руб, %s, транспорт - %s, отель - %s \n",
                   tours[i][0],tours[i][1],tours[i][2],tours[i][3],tours[i][4]);
       }}}

    public static void printAverageCost(String[][] tours){
        int summa = 0;
        for (int i = 0; i < tours.length; i++){
            String tourCostStr = tours[i][1];
            int tourCost = Integer.parseInt(tourCostStr);
            summa = summa + tourCost;
        }
        System.out.println("Средняя стоимость тура:" + summa/tours.length + "рублей");
    }

    //======================================================
    //Домашнее задание
    //пункты 2, 4
    //Выбор тура по указанной стране и средняя стоимость
    public static void printCountryTour(String[][] tours,String CountryTour){

        //Переменная для проверки есть ли варианты указанной страны в массиве tour
        int peremschot = 0;

        //Переменная для подсчета средней стоимости тура в выбранную страну
        int sredCost = 0;

        //Цикл выбора элементов массива tour
        for (int i = 0; i < tours.length; i++) {
            //Условие для проверки с игнорированием регистра введенных букв
            if (CountryTour.equalsIgnoreCase(tours[i][0])) {

                //Выводим подходящие варианты
                System.out.printf("Тур: %s, %s руб, %s, транспорт - %s, отель - %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4]);


                //Преобразуем элемент массива tour в переменную tourCountryCost и подсчитываем сумму стоимости подходящих вариантов
                String sredCostTourCountry = tours[i][1];
                int tourCountryCost = Integer.parseInt(sredCostTourCountry);
                sredCost = sredCost + tourCountryCost;
                //Если условие выполниться хотябы один раз,то переменная будет больше нуля
                peremschot++;
            } }

        //Если подходящих вариантов нет, то выводим сообщение об этом
        if (0 == peremschot){
            System.out.println("Туров в данную страну нет");
        }else {
        //Выводим среднюю стоимость тура в выбранную страну
        System.out.println("Средняя стоимость тура:" + sredCost/peremschot + " рублей");
    }}

    //Домашнее задание
    //пункт 5
    //Выбор тура по количчеству дней от х(указывает пользователь) и более
public static void printCoutDayTour(String[][] tours,String CoutDayTour){

    //Переменная для проверки
    int peremschot = 0;

        //Цикл выбора элементов массива tour
    for (int i = 0; i < tours.length; i++) {

        //буферные переменные t1,t2,t3,t4 введенные для преобразования
        //через replaceAll создаем строку с цифрами из исходной
        String t1 = tours[i][2].replaceAll("\\D+","");
        //System.out.print(t1);
        String t2 = CoutDayTour.replaceAll("\\D+","");

        //преобразуем строки в int
        int t3 = Integer.parseInt(t1);
        int t4 = Integer.parseInt(t2);

        //Условие сравнения преобразованных значений
        if (t3 >= t4){

            //Выводим подходящие варианты
            System.out.printf("Тур: %s, %s руб, %s, транспорт - %s, отель - %s \n",
                    tours[i][0],tours[i][1],tours[i][2],tours[i][3],tours[i][4]);

            //Если условие выполниться хотябы один раз,то переменная будет больше нуля
            peremschot++;
        }}

    //Проверка есть ли хоть один подходящий вариант
    if (peremschot == 0){
        System.out.println("Туров такой длительности нет");
        }
    }
}
