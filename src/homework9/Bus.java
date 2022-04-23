package homework9;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Vehicle {
    public int getMaxPeople = peopleSeatTeamInCar();//количество пассажирских мест без водителя
    public int getPeopleCount = peopleCountInCarNow(getMaxPeople);//количество людей в машине сейчас


//         public static void main(String[] args) {
//        int getMaxPeople = peopleSeatTeamInCar();//количество пассажирских мест без водителя
//        int getPeopleCount = peopleCountInCarNow(getMaxPeople);//количество людей в машине сейчас
//    }

    public static int peopleSeatTeamInCar() {
        int[] peopleVolume = {10, 4, 8, 20};
        int peopleVolumeRand = ThreadLocalRandom.current().nextInt(0, peopleVolume.length);
        int getMaxPeople = peopleVolume[peopleVolumeRand];
        //System.out.println("getMaxPeople : " + getMaxPeople + "\n");
        return getMaxPeople;
    }

    public static int peopleCountInCarNow(int getMaxPeople) {
        int min = 0;
        int max = 20;
        int getPeopleCount = min + (int) (Math.random()*max);
        while (getMaxPeople < getPeopleCount){
            if (getMaxPeople < getPeopleCount){
                getPeopleCount = min + (int) (Math.random()*max);
            }break;}
      //  System.out.println("getPeopleCount : " + getPeopleCount + "\n");
        return getPeopleCount;
    }


    public static void arriveBus(){
    }

    public static void leaveBus(){
    }


}



