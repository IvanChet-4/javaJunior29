package homework14;
//ДЗ
// Два ХэшМэп
// Создать рецепт
// Проверить наличие
// Добавить ингридиенты
// Приготовить
//

import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

//ЧАСТЬ 1 Создаем холодильник с продуктами

        //Грузим продукты в холодильник
        Fridj fridj = new Fridj();
        fridj.putProduct("Бананы", 2);
        fridj.putProduct("Яблоко", 5);
        fridj.putProduct("Груша", 7);
        fridj.putProduct("Бананы", 4);

        //Выводим на экран, что погрузили
        System.out.println("В холодильнике следующие продукты :");
        fridj.printAllProducts();

//==========================================================

//ЧАСТЬ 2 Создаем рецепты, выбираем нужный рецепт
// и создаем Hashmap с ингридиентами для того или иного рецепта

        //Добавляем рецепты
        ReceptsForTwoIngrid recept1 = new ReceptsForTwoIngrid(1, "Рецепт 1", "Бананы", 2, "Груша", 8);
        ReceptsForTwoIngrid recept2 = new ReceptsForTwoIngrid(2, "Рецепт 2", "Яблоко", 2, "Груша", 2);

        //Будем использовать второй хэшмэп
        //для временного хранения нужных ингридиентов
        IngridGetFridjForRecept IGFFR = new IngridGetFridjForRecept();

        //Показать доступные рецепты
//        System.out.println(recept1);
//        System.out.println(recept2);

        //вводим номер рецепта и получаем то,
        // что нужно для приготовления
        int vvod = 0;
        System.out.println("Выбирите рецепт, введите число 1 или 2 : ");
        Scanner scanner = new Scanner(System.in);
        vvod = Integer.parseInt(scanner.nextLine());
//      System.out.println(vvod);

        //Добавляем в хэшмэп ингридиенты из рецептов
        if (vvod == 1) {
            //добавляем
            IGFFR.putProduct(recept1.getFoods1(), recept1.getFoodsValue1());
            IGFFR.putProduct(recept1.getFoods2(), recept1.getFoodsValue2());
        }
        if (vvod == 2) {
            //добавляем
            IGFFR.putProduct(recept2.getFoods1(), recept2.getFoodsValue1());
            IGFFR.putProduct(recept2.getFoods2(), recept2.getFoodsValue2());
        } else if (vvod != 1 && vvod != 2) {
            System.out.println("Введен неверный номер рецепта... ");
        }

//          System.out.println("vvod - " + vvod);
            //вывести что есть в ингридиентах к рецепту
            if (vvod == 1 || vvod == 2) {
            System.out.println("По выбранному рецепту необходимо : ");
            IGFFR.printAllProducts();
            System.out.println("\n");}else {
                System.out.println(" ");
            }
//============================================================

//ЧАСТЬ 3 Проверяем достаточно ли ингридиентов в холодильнике
// если для приготовления достаточно, то забираем из холодильника

        int ingridient1 = 0;
        int ingridient2 = 0;
        int ingridient3 = 0;
        int ingridient4 = 0;
        int prodDostatok = 0;

        if (vvod == 1) {

            ingridient1 = fridj.getProvValue(recept1.getFoods1());
            ingridient2 = fridj.getProvValue(recept1.getFoods2());
//          System.out.println("ingridient 1 " + ingridient1);
//          System.out.println("ingridient 2 " + ingridient2);

            if (ingridient1 >= recept1.getFoodsValue1() && ingridient2 >= recept1.getFoodsValue2()) {

                prodDostatok++;
                fridj.getProduct(recept1.getFoods1(), recept1.getFoodsValue1());
//              fridj.printAllProducts();
                fridj.getProduct(recept1.getFoods2(), recept1.getFoodsValue2());
//              fridj.printAllProducts();

            } else {
                System.out.println("Недостаточно ингридиентов... \n");
                if (ingridient1 < recept1.getFoodsValue1() && ingridient2 < recept1.getFoodsValue2()) {
                System.out.println("Ингридиента " + recept1.getFoods1() + " " + "недостаточно в количестве - " + (recept1.getFoodsValue1() - ingridient1) + " ; Ингридиента " + recept1.getFoods2() + " " + "недостаточно в количестве - " + (recept1.getFoodsValue2() - ingridient2) + " ;");
            }if (ingridient1 < recept1.getFoodsValue1() && ingridient2 >= recept1.getFoodsValue2()){
                System.out.println("Ингридиента " + recept1.getFoods1() + " " + "недостаточно в количестве - " + (recept1.getFoodsValue1() - ingridient1) + " ; Ингридиента " + recept1.getFoods2() + " достаточно ;");
            }if (ingridient1 >= recept1.getFoodsValue1() && ingridient2 < recept1.getFoodsValue2()) {
                    System.out.println("Ингридиента " + recept1.getFoods1() + " достаточно ; " + "Ингридиента " + recept1.getFoods2() + " " + "недостаточно в количестве - " + (recept1.getFoodsValue2() - ingridient2) + " ;");
                }

            }
        }

             if (vvod == 2) {

                ingridient3 = fridj.getProvValue(recept2.getFoods1());
                ingridient4 = fridj.getProvValue(recept2.getFoods2());
//              System.out.println("ingridient 3 " + ingridient3);
//              System.out.println("ingridient 4 " + ingridient4);

                if (ingridient3 >= recept2.getFoodsValue1() && ingridient4 >= recept2.getFoodsValue2()) {

                    prodDostatok++;
                    fridj.getProduct(recept2.getFoods1(), recept2.getFoodsValue1());
//                  fridj.printAllProducts();
                    fridj.getProduct(recept2.getFoods2(), recept2.getFoodsValue2());
//                  fridj.printAllProducts();

                } else {
                    System.out.println("Недостаточно ингридиентов... \n");
                    if (ingridient3 < recept2.getFoodsValue1() && ingridient4 < recept2.getFoodsValue2()) {
                        System.out.println("Ингридиента " + recept2.getFoods1() + " " + "недостаточно в количестве - " + (recept2.getFoodsValue1() - ingridient3) + " ; Ингридиента " + recept2.getFoods2() + " " + "недостаточно в количестве - " + (recept2.getFoodsValue2() - ingridient4) + " ;");
                    }if (ingridient3 < recept2.getFoodsValue1() && ingridient4 >= recept2.getFoodsValue2()){
                        System.out.println("Ингридиента " + recept2.getFoods1() + " " + "недостаточно в количестве - " + (recept2.getFoodsValue1() - ingridient3) + " ; Ингридиента " + recept2.getFoods2() + " достаточно ;");
                    }if (ingridient3 >= recept2.getFoodsValue1() && ingridient4 < recept2.getFoodsValue2()) {
                        System.out.println("Ингридиента " + recept2.getFoods1() + " достаточно ; " + "Ингридиента " + recept2.getFoods2() + " " + "недостаточно в количестве - " + (recept2.getFoodsValue2() - ingridient4) + " ;");
                    }

                }
             }

                if (vvod != 1 && vvod != 2) {
                    System.out.println("\n Введен неверный номер рецепта ... \n");
                }

//==========================================================================================

//ЧАСТЬ 4 Готовим и показываем, что осталось в холодильнике

        //что осталось в холодильнике после того,
        //как забрали ингридиенты на рецепт
        System.out.println("\nВ холодильнике остались следующие продукты : ");
        fridj.printAllProducts();

        if (prodDostatok > 0) {
            IGFFR.prepareIngrid();
        }else {
            System.out.println("\nПриготовление выбранного рецепта невозможно...");
        }

    }
}





//КАША
//            System.out.println(fridj.get("Basil"));
//            for (Map.Entry<String, Integer> entry: fridj.entrySet()){}

//            String NameFood = recept1.getFoods1();
//            int FoodValue = recept1.getFoodsValue1();
//            fridj.getProv(NameFood, FoodValue);

        //Рецепт
//            ReceptsIngridients recept = new ReceptsIngridients();

        //Ингридиенты к рецепту
//            ReceptsIngridients ingridients = new ReceptsIngridients();

        //Вывод для просмотра данных
//            fridj.printAllProducts();

//            System.out.println(fridj + "\n");
//            System.out.println(recept);
//            System.out.println(fridj);
//            fridj.printAllProducts();
//            fridj.getProduct("Сливы",2);
//            fridj.getProduct("Яблоко",2);

         //зачищаем
//            IGFFR.getProduct(recept1.getFoods1(), recept1.getFoodsValue1());
//            IGFFR.getProduct(recept1.getFoods2(), recept1.getFoodsValue2());
//            IGFFR.getProduct(recept2.getFoods1(), recept2.getFoodsValue1());
//            IGFFR.getProduct(recept2.getFoods2(), recept2.getFoodsValue2());