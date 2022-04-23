package homework9;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Vehicle {

public int getMaxLoad = getMaxLoadInCar();//максимальная вместительность груза
public int getCurrentLoad = getCurrentLoadNow(getMaxLoad);//текущая масса груза в тоннах


    public static int getMaxLoadInCar() {
        int[] maxLoadInCar = {10, 4, 8, 20};
        int maxLoadInCarRand = ThreadLocalRandom.current().nextInt(0, maxLoadInCar.length);
        int getMaxLoad = maxLoadInCar[maxLoadInCarRand];
        //System.out.println("getMaxLoad : " + getMaxLoad + "\n");
        return getMaxLoad;
    }

    public static int getCurrentLoadNow(int getMaxLoad) {
        int min = 0;
        int max = 20;
        int getCurrentLoad = min + (int) (Math.random()*max);
        while (getMaxLoad < getCurrentLoad){
            if (getMaxLoad < getCurrentLoad){
            getCurrentLoad = min + (int) (Math.random()*max);
        }break;}

        //System.out.println("getCurrentLoad : " + getCurrentLoad + "\n");
        return getCurrentLoad;
    }


    public static void arriveTruck(){
    }

    public static void leaveTruck(){
    }

}
