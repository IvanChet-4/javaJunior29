package homework8;

import java.util.Objects;

public class Krug extends Figure{

    private int radius;

    public Krug() {
    }
    public Krug(String name, String material) {
        super(name, material);
    }

    public Krug(int radius) {
        this.radius = radius;
    }
    public Krug(String name, String material, int radius) {
        super(name, material);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Krug krug = (Krug) o;
        return radius == krug.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Krug{" +
                "radius=" + radius +
                '}';
    }
}
