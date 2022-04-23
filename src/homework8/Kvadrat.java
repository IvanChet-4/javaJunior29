package homework8;

import java.util.Objects;

public class Kvadrat extends Figure{

    private int storona;

    public Kvadrat() {
    }

    public Kvadrat(String name, String material) {
        super(name, material);
    }

    public Kvadrat(int storona) {
        this.storona = storona;
    }

    public Kvadrat(String name, String material, int storona) {
        super(name, material);
        this.storona = storona;
    }

    public int getStorona() {
        return storona;
    }

    public void setStorona(int storona) {
        this.storona = storona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kvadrat kvadrat = (Kvadrat) o;
        return storona == kvadrat.storona;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), storona);
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "storona=" + storona +
                '}';
    }
}
