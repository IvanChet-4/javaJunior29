package homework14;

import java.util.Objects;

public class ReceptsForTwoIngrid {
//класс для рецептов из двух ингридиентов
//hascode, equals, getter, setter, constructor
    private int number;
    private String name;
    private String foods1;
    private int foodsValue1;
    private String foods2;
    private int foodsValue2;

    public ReceptsForTwoIngrid() {
    }

    public ReceptsForTwoIngrid(int number, String name, String foods1, int foodsValue1, String foods2, int foodsValue2) {
        this.number = number;
        this.name = name;
        this.foods1 = foods1;
        this.foodsValue1 = foodsValue1;
        this.foods2 = foods2;
        this.foodsValue2 = foodsValue2;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoods1() {
        return foods1;
    }

    public void setFoods1(String foods1) {
        this.foods1 = foods1;
    }

    public int getFoodsValue1() {
        return foodsValue1;
    }

    public void setFoodsValue1(int foodsValue1) {
        this.foodsValue1 = foodsValue1;
    }

    public String getFoods2() {
        return foods2;
    }

    public void setFoods2(String foods2) {
        this.foods2 = foods2;
    }

    public int getFoodsValue2() {
        return foodsValue2;
    }

    public void setFoodsValue2(int foodsValue2) {
        this.foodsValue2 = foodsValue2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceptsForTwoIngrid that = (ReceptsForTwoIngrid) o;
        return number == that.number && foodsValue1 == that.foodsValue1 && foodsValue2 == that.foodsValue2 && Objects.equals(name, that.name) && Objects.equals(foods1, that.foods1) && Objects.equals(foods2, that.foods2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, foods1, foodsValue1, foods2, foodsValue2);
    }


    @Override
    public String toString() {
        return "ReceptsForTwoIngrid{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", foods1='" + foods1 + '\'' +
                ", foodsValue1=" + foodsValue1 +
                ", foods2='" + foods2 + '\'' +
                ", foodsValue2=" + foodsValue2 +
                '}';
    }


}
