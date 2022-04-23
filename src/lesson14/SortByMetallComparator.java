package lesson14;

import java.util.Comparator;

public class SortByMetallComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        //O1 первая монета
        //O2 вторая монета
        if (!o1.getMetall().equals(o2.getMetall())){
            return o1.getMetall().compareTo(o2.getMetall());
        }
        if (o1.getDiametr() != o2.getDiametr()){
            return Double.compare(o1.getDiametr(),o2.getDiametr());
        }
        if (o1.getNominal() != o2.getNominal()){
            return o1.getNominal() - o2.getNominal();
        }
        if (o1.getYear() != o2.getYear()){
            return o1.getYear() - o2.getYear();
        }
        return 0;
    }
    }
