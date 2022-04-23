package lesson10;

public class Bus extends Vehicle {
    private int people_count;
    private int max_people;

    public Bus() {
    }

    //setter один вариант
    //второй правильнее
    public Bus(int people, int max_people, double petrol, double max_petrol) {
        super(max_petrol, petrol);// ссылка на родительский класс
        this.people_count = people;
        this.max_people = max_people;
    }

    public int getPeople_count() {
        return people_count;
    }

    public int getMax_people() {
        return max_people;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.people_on_base = Base.people_on_base + people_count;
    }

    @Override
    public boolean leave() {
        if(Base.people_on_base < 1){return false;}
        if(Base.vehicles_on_base < 1){return false;}
        double needsPetrol = getTank_volume() - getPetrol_amount();
        if(needsPetrol > Base.petrol_on_base){return false;}
        Base.people_on_base--;
        Base.vehicles_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - needsPetrol;

        int needsPeople = max_people;
        if (Base.people_on_base >= needsPeople){Base.people_on_base = Base.people_on_base - needsPeople;}else{Base.people_on_base = 0;}
        return true;
    }

    }