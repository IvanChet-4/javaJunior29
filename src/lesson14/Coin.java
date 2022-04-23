package lesson14;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private int year;
    private int nominal;
    private double diametr;
    private String metall;

    public Coin() {
    }

    public Coin(int year, int nominal, double diametr, String metall) {
        this.year = year;
        this.nominal = nominal;
        this.diametr = diametr;
        this.metall = metall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "year=" + year +
                ", nominal=" + nominal +
                ", diametr=" + diametr +
                ", metall='" + metall + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return year == coin.year && nominal == coin.nominal && Double.compare(coin.diametr, diametr) == 0 && Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, nominal, diametr, metall);
    }

    @Override
    public int compareTo(Coin o) {
        //сортировка по диаметру, номиналу, году, материалу
       //this - первая монета
        //o-вторая монета
        if (this.getDiametr() != o.getDiametr()){
            return Double.compare(this.getDiametr(),o.getDiametr());
        }
        if (this.getNominal() != o.getNominal()){
            return this.getNominal() - o.getNominal();
        }
        if (this.getYear() != o.getYear()){
            return this.getYear() - o.getYear();
        }
        if (this.getMetall().equals(o.getMetall())){
            return this.getMetall().compareTo(o.getMetall());
        }
        return 0;
    }
}
