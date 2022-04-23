package lesson8;

import java.util.Objects;

public class Pramoygolnik extends Object{

    private int a;
    private int b;

    public Pramoygolnik() {
    }

    public Pramoygolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int ploshad() {
        //this - неявный входящий параметр (или pryamoygolnik1 or 2)
        return this.a * this.b;
    }
        public int periment() {
            return (this.a + this.b) * 2;
        }

//Аннотация
    //equals hashcode - переменные, конструктор(), конструктор, геттеры, сеттеры, обязательно, equals, hashcode
    @Override
    public boolean equals(Object o) {
       //o - pramoygolnik2
        //this - pryamoygolnik1
        if (this == o)
            return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        Pramoygolnik that = (Pramoygolnik) o; //приведение

        if (this.a != that.a) return false;

        return a == that.a && b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
//to string - обязательно переопределяем
    @Override
    public String toString() {
        return "Pramoygolnik{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}