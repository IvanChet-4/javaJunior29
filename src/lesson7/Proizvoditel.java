package lesson7;

public class Proizvoditel {
    private String name;
    private String description;
    private String pathToImage;

    public Proizvoditel() {
    }

    public Proizvoditel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }
}
