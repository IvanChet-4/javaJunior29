package lesson19;

public class Main {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        CopyWithNio copyWithNio = new CopyWithNio();
        CopyWithApache copyWithApache = new CopyWithApache();
//        CopyWithGuava copyWithGuava = new CopyWithGuava();




//        long start4 = System.currentTimeMillis();
//        copyWithGuava.copy("C:\\Users\\MTSUser\\Downloads\\wireless-workbench-win-6.13.1.zip", "3.zip");
//        long end4 = System.currentTimeMillis();
//        System.out.println("Копирование с помощью Guava : " + (end4 - start4));

        long start3 = System.currentTimeMillis();
        copyWithApache.copy("C:\\Users\\MTSUser\\Downloads\\wireless-workbench-win-6.13.1.zip", "3.zip");
        long end3 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Apache : " + (end3 - start3));

        long start2 = System.currentTimeMillis();
        copyWithNio.copy("C:\\Users\\MTSUser\\Downloads\\wireless-workbench-win-6.13.1.zip", "2.zip");
        long end2 = System.currentTimeMillis();
        System.out.println("Копирование с помощью nio : " + (end2 - start2));

        long start1 = System.currentTimeMillis();
        copyWithOneByte.copy("C:\\Users\\MTSUser\\Downloads\\wireless-workbench-win-6.13.1.zip", "1.zip");
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование с помощью одного байта буфера : " + (end1 - start1));
    }
}
