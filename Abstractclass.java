abstract class Vehicle{  // If a class has a abstract method it should be in a abstract class

    abstract void speed(); // An abstract method should not have any body and if there is a abstract function then it should be overrided in the derived class

    void brand()
    {
        System.out.println("XYZ Brand");
    }
}

class Bike extends Vehicle {
    void speed(){
        System.out.println("25km/hr");
    }
}

class car extends Vehicle {
    
    void speed(){
        System.out.println("43km/hr");
    }
}

public class Mainclass {
    public static void main(String[] args) {
    }    
}
