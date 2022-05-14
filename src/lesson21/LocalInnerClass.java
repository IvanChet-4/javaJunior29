package lesson21;

public class LocalInnerClass {
//    int anInt = 4;
    public void delenie(int a, int b){
       int aa = 10;
        class Delenie{
            int delitel;
            int delimoe;

            public Delenie(int delitel, int delimoe) {
                this.delitel = delitel;
                this.delimoe = delimoe;
            }
            public void devision(){
                System.out.println(delimoe/delitel);
//                System.out.println(anInt);
//            anInt =10;
                System.out.println(aa);
                //aa = 4;

            }
            public void ostatok(){
                System.out.println(delimoe%delitel);
            }
        }
    Delenie delenie = new Delenie(a,b);
        delenie.devision();
        delenie.ostatok();
    }

}

class Test1{
    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.delenie(20,4);


    }
}
