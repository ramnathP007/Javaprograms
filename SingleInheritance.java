class Animal {                                  // Super Class
    void eat(){
        System.out.println("The animal can eat");
    }
    
}

class Dog extends Animal{                      // Derived Class
    void bark(){
        System.out.println("The Dog Barks");
    }
}


// One Super Class and one derived class is call Single inheritance
public class Singleinheritance {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.bark();
        d1.eat();
    }
}
