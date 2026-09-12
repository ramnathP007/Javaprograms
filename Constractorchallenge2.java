class Vehicle{
    String brand;
    int year;
    void startEngine(){

    }
}


class car extends Vehicle{
    String fuelType;
    @Override 
    void startEngine(){
        System.out.println("Car Engine Starts");
    }

    void drive(){
        System.out.println("Car is driving");
    }

}


class truck extends Vehicle{
    int loadCapacity;
    @Override 
    void startEngine(){
        System.out.println("Truck engine starts");
    }

    void haul(){
        System.out.println("Truck is hauling");
    }
}


/**
 * Mainclass
 */
public class Mainclass {
    public static void main(String[] args) {
    
        car c1 = new car();
        c1.brand = "BMW";
        c1.year = 2020;
        c1.startEngine();
        c1.drive();

        truck t1 = new truck();
        t1.brand = "Benz";
        t1.year = 2025;
        t1.startEngine();
        t1.haul();

    }
}
