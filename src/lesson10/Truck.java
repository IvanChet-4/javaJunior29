package lesson10;

public class Truck extends Vehicle{
    private double goods_count;
    private double max_goods;

    public Truck(){
    }

    public Truck(int goods, int max_goods, double petrol, double max_petrol) {
        super(max_petrol, petrol);// ссылка на родительский класс
        this.goods_count = goods;
        this.max_goods = max_goods;
    }

    public double getGoods_count() {
        return goods_count;
    }

    public double getMax_goods() {
        return max_goods;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.goods_on_base = Base.goods_on_base + goods_count;
    }

    @Override
    public boolean leave() {
        if (Base.people_on_base < 1) {
            return false;
        }
        if (Base.vehicles_on_base < 1) {
            return false;
        }
        double needsPetrol = getTank_volume() - getPetrol_amount();
        if (needsPetrol > Base.petrol_on_base) {
            return false;
        }
        Base.people_on_base--;
        Base.vehicles_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - needsPetrol;

        double needsGoods = max_goods;
        if (Base.goods_on_base >= needsGoods){Base.goods_on_base = Base.goods_on_base - needsGoods;}else{Base.goods_on_base = 0;}
        return true;

        }
    }
