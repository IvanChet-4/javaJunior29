package homework8;

import java.util.Objects;

public class Oval extends Krug{

    private int radius2;

    public Oval() {
    }

    public Oval(String name, String material) {
        super(name, material);
    }

    public Oval(int radius) {
        super(radius);
    }

    public Oval(String name, String material, int radius) {
        super(name, material, radius);
    }

    public Oval(int radius, int radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    public Oval(String name, String material, int radius, int radius2) {
        super(name, material, radius);
        this.radius2 = radius2;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oval oval = (Oval) o;
        return radius2 == oval.radius2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius2);
    }

    @Override
    public String toString() {
        return "Oval{" +
                "radius2=" + radius2 +
                '}';
    }
}
