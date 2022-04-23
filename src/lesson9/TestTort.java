package lesson9;

public class TestTort {


    public static void main(String[] args){
        Baking baking = new Tort();
        //System.out.println(baking.getDescription() + "и его цена" + baking.getPrice());


        baking = new Crem(baking);
        //System.out.println(baking);
       // System.out.println(baking.getDescription() + "и его цена" + baking.getPrice());
baking.about();
        baking = new Chocolate(baking);
        //System.out.println(baking.getDescription() + "и его цена" + baking.getPrice());
baking.about();
    }



}
//polymorfizm, incapsulacia, nasledovanie
//override  pereopredelenie
//1 sovpadat signaturi ili vxod parametri
//2 sovpadat vxod parametri
//3 izmenit mojno modificator dostupa
//4 vozvr tip