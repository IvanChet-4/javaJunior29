package lesson7;

public class Main2 {
    //ДЗ Создать типы круг треугольник прямоугольник квадрат овал
    // прописать в них нужные поля класса абс (сами определяем как чего)
    // гет сет и конструкторы
    //создать маин по одному объекту класса и установить им все характеристики


    public static void main(String[] args) {
        Tovar tovar = new Tovar("Мышка",2000);
        Proizvoditel lg = new Proizvoditel("LG");
        lg.setDescription("Это Корейский производитель");
        lg.setPathToImage("cddd///");
        tovar.setProizvoditel(lg);

        User user = new User("vasya_pupkin", "Вася Пупкин",100);
user.setPathToAvatar("c://");
Otziv otziv = new Otziv();
otziv.setUser(user);
otziv.setRatig(5);
otziv.setMainText("Покупал все ок");

tovar.addOtzivToTovar(otziv);
        System.out.println();

    }


}
