package homework8;

import java.util.Objects;

public class Figure {

    private String name;
    private String material;

    public Figure() {
    }

    public Figure(String name, String material) {
        this.name = name;
        this.material = material;
    }
    //Getter
    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    //equals and hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return name.equals(figure.name) && material.equals(figure.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, material);
    }
    //to string
    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
