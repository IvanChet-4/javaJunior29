package homework9_1;

public class Main2 {
    public static void main(String[] args) {
        Truck v = new Truck(30, 60, 30, 40);
//
// get
        System.out.println( v.getPetrol_amount() );
        System.out.println( v.getTank_volume() );
        System.out.println();

// init
        Base.vehicles_on_base = 49;
        Base.people_on_base = 99;
        Base.petrol_on_base = 1000.0;
        Base.goods_on_base  = 2000.0;

        System.out.println("Initially:");
        System.out.println( Base.vehicles_on_base );
        System.out.println( Base.people_on_base );
        System.out.println( Base.petrol_on_base );
        System.out.println( Base.goods_on_base );
        System.out.println();

// arrive
        v.arrive();
        System.out.println( "Arrived:" );

        System.out.println( Base.vehicles_on_base );	// arrived
        System.out.println( Base.people_on_base );

        System.out.println( Base.petrol_on_base );	// same
        System.out.println( Base.goods_on_base );
        System.out.println();

// leave
        v.leave();
        System.out.println( "Left:" );

        System.out.println( Base.vehicles_on_base );	// left
        System.out.println( Base.people_on_base );

// should be >1000
        System.out.println( Base.petrol_on_base );	// changed!

        System.out.println( Base.goods_on_base );	// same
        System.out.println();
    }
}
