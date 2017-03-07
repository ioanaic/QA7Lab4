package lab5.oop;

/**
 * Created by Ioana on 3/7/2017.
 */
public class Car extends Vehicle {
    private String name;

    @Override
    public void moves(){
        System.out.println("Car moves");
        this.name="car2";
        super.moves();

        this.stops();
        //super.stops();
    }

    public void stops(){
        System.out.println("Car stops!!!!");
    }

    public static void main(String[] args) {

        Car dacia = new Car();
        dacia.moves();

    }
}

