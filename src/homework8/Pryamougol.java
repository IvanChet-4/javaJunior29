package homework8;

import java.util.Objects;

public class Pryamougol extends Kvadrat{

    private int storona2;

    public Pryamougol() {
    }

    public Pryamougol(String name, String material) {
        super(name, material);
    }

    public Pryamougol(int storona) {
        super(storona);
    }

    public Pryamougol(String name, String material, int storona) {
        super(name, material, storona);
    }

    public Pryamougol(int storona, int storona2) {
        super(storona);
        this.storona2 = storona2;
    }

    public Pryamougol(String name, String material, int storona, int storona2) {
        super(name, material, storona);
        this.storona2 = storona2;
    }

    public int getStorona2() {
        return storona2;
    }

    public void setStorona2(int storona2) {
        this.storona2 = storona2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pryamougol that = (Pryamougol) o;
        return storona2 == that.storona2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), storona2);
    }

    @Override
    public String toString() {
        return "Pryamougol{" +
                "storona2=" + storona2 +
                '}';
    }
}
