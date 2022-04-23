package lesson7;

public class Tovar {
    private String name;
    private int price;
    private Proizvoditel proizvoditel;
    private Otziv[] otzivs = new Otziv[100];

    public Tovar() {
    }

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Proizvoditel getProizvoditel() {
        return proizvoditel;
    }

    public Otziv[] getOtzivs() {
        return otzivs;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProizvoditel(Proizvoditel proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public void setOtzivs(Otziv[] otzivs) {
        this.otzivs = otzivs;
    }

    public void addOtzivToTovar(Otziv otziv){
        for(int i = 0; i < otzivs.length; i++){
            if (otzivs[i] == null){
                otzivs[i] = otziv;
                break;
            }
        }

    }

}
