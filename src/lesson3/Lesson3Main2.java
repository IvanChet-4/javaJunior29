package lesson3;

public class Lesson3Main2 {
    public static void main(String[] args) {
        //массив целых чисел 4,7,5,2,9; Напечатать сумму четных чисел.
        char[] chars = {4, 7, 5, 2, 9};
        int summchet = 0;
        for (int i = 0; i < 5; i++){
            if (chars[i]%2 == 0) {
                summchet += chars[i];
            }
        }
        System.out.println(summchet);
    }
}
