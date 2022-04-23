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

        //Грузим продукты в холодильник
        Fridj fridj = new Fridj();
        fridj.putProduct("Бананы",2);
        fridj.putProduct("Яблоко",5);
        fridj.putProduct("Груша",7);
        fridj.putProduct("Бананы",4);

        //Выводим на экран, что погрузили
        //fridj.printAllProducts();
 //=====================================================

        //Добавляем рецепты
        ReceptsForTwoIngrid recept1 = new ReceptsForTwoIngrid(1, "Рецепт 1", "Бананы", 2, "Груша", 2);
        ReceptsForTwoIngrid recept2 = new ReceptsForTwoIngrid(2, "Рецепт 2", "Яблоко", 2, "Груша", 2);

        //Будем второй хэшмэп использовать для временного хранения нужных ингридиентов
        IngridGetFridjForRecept IGFFR = new IngridGetFridjForRecept();

        //Показать доступные рецепты
//        System.out.println(recept1);
//        System.out.println(recept2);

        //вводим номер рецепта и получаем то, что нужно для приготовления
        int vvod = 0;
        System.out.println("Выбирите рецепт, введите число 1 или 2 : ");
        Scanner scanner = new Scanner(System.in);
        vvod = Integer.parseInt(scanner.nextLine());
        //System.out.println(vvod);
        if (vvod == 1){
          //зачищаем
            IGFFR.getProduct(recept1.getFoods1(), recept1.getFoodsValue1());
            IGFFR.getProduct(recept1.getFoods2(), recept1.getFoodsValue2());
            IGFFR.getProduct(recept2.getFoods1(), recept2.getFoodsValue1());
            IGFFR.getProduct(recept2.getFoods2(), recept2.getFoodsValue2());
            //добавляем
            IGFFR.putProduct(recept1.getFoods1(), recept1.getFoodsValue1());
            IGFFR.putProduct(recept1.getFoods2(), recept1.getFoodsValue2());
            //System.out.println(recept1.getFoods2());
        } if (vvod == 2) {
            //зачищаем
            IGFFR.getProduct(recept1.getFoods1(), recept1.getFoodsValue1());
            IGFFR.getProduct(recept1.getFoods2(), recept1.getFoodsValue2());
            IGFFR.getProduct(recept2.getFoods1(), recept2.getFoodsValue1());
            IGFFR.getProduct(recept2.getFoods2(), recept2.getFoodsValue2());
            //добавляем
            IGFFR.putProduct(recept2.getFoods1(), recept2.getFoodsValue1());
            IGFFR.putProduct(recept2.getFoods2(), recept2.getFoodsValue2());
        }else if (vvod != 1 && vvod != 2){
            System.out.println("Введено неверное значение... ");
        }
        //вывести что есть в ингридиентах к рецепту
       // System.out.println("vvod - " + vvod);
        //IGFFR.printAllProducts();

//============================================================

//достаточно ли ингридиентов в холодильнике
        if (vvod == 1){
            int ingridient1 = 0;
            int ingridient2 = 0;
            ingridient1 = fridj.getProvValue(recept1.getFoods1());
            ingridient2 = fridj.getProvValue(recept1.getFoods2());
            System.out.println("ingridient 1 " + ingridient1);
            System.out.println("ingridient 2 " + ingridient2);
            if (ingridient1 >= recept1.getFoodsValue1()){
                fridj.getProduct(recept1.getFoods1(), recept1.getFoodsValue1());
                fridj.printAllProducts();
            }
            if (ingridient2 >= recept1.getFoodsValue2()){
                fridj.getProduct(recept1.getFoods2(), recept1.getFoodsValue2());
                fridj.printAllProducts();
            }


            //  System.out.println(fridj.get("Basil"));
           // for (Map.Entry<String, Integer> entry: fridj.entrySet()){}


//            String NameFood = recept1.getFoods1();
//            int FoodValue = recept1.getFoodsValue1();
//            fridj.getProv(NameFood, FoodValue);



        }



        //Рецепт
       // ReceptsIngridients recept = new ReceptsIngridients();

        //Ингридиенты к рецепту
        //ReceptsIngridients ingridients = new ReceptsIngridients();

        //Вывод для просмотра данных
        //fridj.printAllProducts();


//        System.out.println(fridj + "\n");
//        System.out.println(recept);
//        System.out.println(fridj);
//        fridj.printAllProducts();
//        fridj.getProduct("Сливы",2);
//        fridj.getProduct("Яблоко",2);

    }
}
