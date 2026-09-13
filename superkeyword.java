class Animal{
    
    Animal(String name){ // this is not a default constructor as we manually given a argument. so this should be called manually in the derived class which inherits the super class
        
        System.out.println(name);
    }

    void makesound(){
        System.out.println("Animal makes sound");
    }
}


class Dog extends Animal{

    Dog(){
        super("Monkey"); // By default the super keyword is called but here the argument will not be passed so we need to explicitly give the arguments
        super.makesound();    // We can access the field and functions of the super class using the super keyword
        System.out.println("Dog");
    }
}

public class Mainclass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        
/*

when a Object of a class is created it will defaultly call the constractor and here the dog class inherits the Animal super class and 
and the constractor of the super class is called first and then the derived class constractor

*/

    }    
}
