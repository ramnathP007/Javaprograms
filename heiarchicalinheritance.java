class Animal {                                  // Super Class
    void eat(){
        System.out.println("The animal can eat");
    }
    
}

class Dog extends Animal{                      // first level inheritance
    void bark(){
        System.out.println("The Dog Barks");
    }
}

class cat extends Animal{                        // Second level inheritance
    void meow(){
        System.out.println("Cat can meow");
    }

}


// One Super Class and one derived class is call Single inheritance
public class Singleinheritance {

    public static void main(String[] args) {

        cat d1 = new cat();
        Dog d2 = new Dog();

        d2.eat();
        d1.eat();
    }
}


// Multilevel Animal --> Dog --> Puppy

/* Heiarchical 

Animal --> Dog

Animal --> Cat


*/ 
