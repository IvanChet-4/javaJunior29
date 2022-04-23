package lesson7;

public class Student {
// 1 - переменные (поля класса) они же характеристики объекта
private String name;
private String surname;
private int age;

//2 - конструкторы (особый метод, который вызывается в момент создания нового объекта, после слова new)
public Student(int age, String name, String surname){
this.age = age;
this.name = name;
this.surname = surname;
}

    //3 - методы
public void setAge(int age){
    //явный входящий параметр age (14)
    //неявный входящий параметр - this (student1)
    this.age = age;
}
    public int getAge(){
        return this.age;
    }

}
