package homework9;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Vehicle {
    int driverCount = 1; //Количество водителей в транспорте (условия задачи)
    int getMaxTankVolume = getTankVolume();//Объем бензобака
    int getPetrolAmountNow = getPetrolAmount(getMaxTankVolume);//Текущее количество бензина в машине


    public static int getTankVolume() {
        int[] petrolMaxVehicle = {10, 15, 20, 25, 30};
        int petrolMaxVehicleRand = ThreadLocalRandom.current().nextInt(0, petrolMaxVehicle.length);
        int getMaxTankVolume = petrolMaxVehicle[petrolMaxVehicleRand];
        //System.out.println("getMaxTankVolume : " + getMaxTankVolume + "\n");
        return getMaxTankVolume;
    }
    public static int getPetrolAmount(int getMaxTankVolume) {
        int min = 1;
        int max = 30;
        int getPetrolAmountNow = min + (int) (Math.random()*max);
        while (getMaxTankVolume < getPetrolAmountNow){
            if (getMaxTankVolume < getPetrolAmountNow){
                getPetrolAmountNow = min + (int) (Math.random()*max);
            }break;}
        //  System.out.println("getPetrolAmountNow : " + getPetrolAmountNow + "\n");
        return getPetrolAmountNow;
    }

    public static void arriveVehicle(){
    }

    public static void leaveVehicle(){
    }
}