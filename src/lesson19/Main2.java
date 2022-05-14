package lesson19;

import java.io.RandomAccessFile;

public class Main2 {
    public static void main(String[] args) {


        try {
            RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");
// Записать в файл 10 чисел и закрыть файл
            for (int i = 0; i < 10; i++)
                rf.writeDouble(i * 1.414);//80 байт
            rf.close();
// Открыть файл, записать в него еще одно число и снова закрыть
            rf = new RandomAccessFile("rtest.dat", "rw");
            rf.seek(5 * 8);//отступ 40 байт перешли в 6-е число
            rf.writeDouble(47.0001);//перезатираем
            rf.close();
// Открыть файл с возможностью только чтения "r"
            rf = new RandomAccessFile("rtest.dat", "r");
// Прочитать 10 чисел и показать их на экране
            for (int i = 0; i < 10; i++)
                System.out.println("Value " + i + ": " + rf.readDouble());
            rf.close();

        } catch (Exception e) {
        }
    }
}