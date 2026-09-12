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

class puppy extends Dog{                        // Second level inheritance
    void weep(){
        System.out.println("Puppy weeps");
    }

}


// One Super Class and one derived class is call Single inheritance
public class Singleinheritance {

    public static void main(String[] args) {

        puppy d1 = new puppy();

        d1.bark();
        d1.eat();
        d1.weep();
    }
}
