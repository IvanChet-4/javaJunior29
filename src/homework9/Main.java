package homework9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Base base = new Base(1000, 100, 2000, 1000);
        // System.out.println(base);

        int people = base.getPeople_on_base();
        int vehicle = base.getVehicles_on_base();
        int petrol = base.getPetrol_on_base();
        int goods = base.getGoods_on_base();

        int car = scanStep();//Определяем пропустить машину или выпустить
        //System.out.println(car);

        int type = typeCar();
        //System.out.println(type);


    }

//Выбрать тип машины, который необходимо запустить или выпустить
//==========================
    public static int scanStep () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 для прбытия машины или введите 1 для отъезда машины : ");
        int carStep = Integer.parseInt(scanner.nextLine());
        if (carStep != 2 && carStep != 1) {return scanStep ();}
       return carStep;
    }

    public static int typeCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 для прбытия машины или введите 1 для отъезда машины : ");
        int type = Integer.parseInt(scanner.nextLine());
        if (type != 2 && type != 1) {return typeCar();}
        return type;
    }

}