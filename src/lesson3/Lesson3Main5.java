package lesson3;

public class Lesson3Main5 {
    public static void main(String[] args) {
        String email = "skkhdfskdj@ldjf";
        //1 - Содержиться ли собачка
        //2 - а только одна
        //3 - начало и конеч не может быть с символа
        //4 - ...
       // email.contains()
       //split - разрезать - вернется массив кусочков стринг

        String[] parts0fEmail = email.split("@");
        System.out.println(parts0fEmail);
        if (parts0fEmail.length == 1){
            System.out.println("Пароль не содержит собачку");
            if (parts0fEmail.length > 2){
                System.out.println("Пароль содержит несколько собачек");
            }
        }

    }
}
