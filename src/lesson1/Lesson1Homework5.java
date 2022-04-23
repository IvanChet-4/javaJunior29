package lesson1;

public class Lesson1Homework5 {
    public static void main(String[] args) {
        int chetnye = 0;
        int nechetnye = 0;
        for (int i = 1; i <= 11; i++) {
            if (i % 2 == 0) {
                chetnye = chetnye + 1;
            } else if (i % 2 == 1) {
                nechetnye = nechetnye + 1;
            }
        }
       // System.out.println(chetnye);
        // System.out.println(nechetnye);
        if (chetnye > nechetnye){
            System.out.println("Больше четных");
        }else if (chetnye < nechetnye){
            System.out.println("Больше нечетных");
        }
    }
}
