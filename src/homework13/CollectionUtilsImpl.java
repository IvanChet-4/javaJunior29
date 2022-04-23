package homework13;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils   {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> union = new LinkedList<>();
        //Объединение ab
        union.addAll(a); union.addAll(b);
        return union;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> intersection = new ArrayList<>(a);
        intersection.retainAll(b);
        //Все элементы пересечения повторяются
        intersection.addAll(intersection);
        return intersection;
    }

    @Override
    public List unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> unionWithoutDuplicate = new LinkedList<>(a);
        unionWithoutDuplicate.removeAll(b);
        unionWithoutDuplicate.addAll(b);
        return unionWithoutDuplicate;
    }

    @Override
    public ArrayList<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> intersectionWithoutDuplicate = new ArrayList<>(a);
        //Находим пересечение коллекций
        intersectionWithoutDuplicate.retainAll(b);
        return intersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> a2 = new ArrayList<>(a);
        ArrayList<Integer> difference = new ArrayList<>(a);
       //Находим пересечение, Делаем объединеную коллекцию ab, Удаляем из коллекции ab пересечение a2
        a2.retainAll(b); difference.addAll(b); difference.removeAll(a2);
        return difference;
    }
}