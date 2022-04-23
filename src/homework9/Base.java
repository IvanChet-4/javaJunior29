package homework9;

import java.util.Objects;

public class Base {
    private int people_on_base; //- количество людей на территории базы;
    private int vehicles_on_base; //- количество транспортных средств на территории базы;
    private int petrol_on_base; //- количество бензина на местной "заправке" (в литрах);
    private int goods_on_base; //- количество "груза" - различных материальных ценностей (в тоннах).

    public Base() {
    }

    public Base(int people_on_base, int vehicles_on_base, int petrol_on_base, int goods_on_base) {
        this.people_on_base = people_on_base;
        this.vehicles_on_base = vehicles_on_base;
        this.petrol_on_base = petrol_on_base;
        this.goods_on_base = goods_on_base;
    }

    public int getPeople_on_base() {
        return people_on_base;
    }

    public void setPeople_on_base(int people_on_base) {
        this.people_on_base = people_on_base;
    }

    public int getVehicles_on_base() {
        return vehicles_on_base;
    }

    public void setVehicles_on_base(int vehicles_on_base) {
        this.vehicles_on_base = vehicles_on_base;
    }

    public int getPetrol_on_base() {
        return petrol_on_base;
    }

    public void setPetrol_on_base(int petrol_on_base) {
        this.petrol_on_base = petrol_on_base;
    }

    public int getGoods_on_base() {
        return goods_on_base;
    }

    public void setGoods_on_base(int goods_on_base) {
        this.goods_on_base = goods_on_base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Base base = (Base) o;
        return people_on_base == base.people_on_base && vehicles_on_base == base.vehicles_on_base && petrol_on_base == base.petrol_on_base && goods_on_base == base.goods_on_base;
    }

    @Override
    public int hashCode() {
        return Objects.hash(people_on_base, vehicles_on_base, petrol_on_base, goods_on_base);
    }


    @Override
    public String toString() {
        return "Base{" +
                "people_on_base=" + people_on_base +
                ", vehicles_on_base=" + vehicles_on_base +
                ", petrol_on_base=" + petrol_on_base +
                ", goods_on_base=" + goods_on_base +
                '}';
    }
}