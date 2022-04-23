package lesson3;

public class Lesson3Main1 {
    public static void main(String[] args) {
        //вывести гласные буквы из массива
        char[] chars = {'r', 'e', 'g', 'y', 'o', 'i', 'h', 's'};
    for (int i = 0; i < chars.length; i++){
        if (chars[i] == 'o' || chars[i] == 'a' || chars[i] == 'i' || chars[i] == 'y' || chars[i] == 'u'){
            System.out.println(chars[i]);
        }
    }
    }
}
