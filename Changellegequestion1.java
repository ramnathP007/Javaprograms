class Animal{
    String name;
    int age;
    void makesound(){
        System.out.println("Animal makes Sound");
    }

}

class Dog extends Animal{
    String breed;

    @Override 
    void makesound(){
        System.out.println("Dog Barks....");
    }

    void fetch(){
        System.out.println("Dog is fetching");
    }
}


class Cat extends Animal{
    String colour;

    @Override 
    void makesound(){
        System.out.println("Cat is Meows....");
    }

    void climb(){
        System.out.println("Cat is climbing");
    }
}



public class Mainclass {

    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.name = "XYZ";
        a1.age = 5;
        a1.makesound();

        Dog d1 = new Dog();
        d1.name = "Timmy";
        d1.age = 2;
        d1.breed = "Golden Retirever";
        d1.fetch();

        Cat c1 = new Cat();
        c1.name = "Pinky";
        c1.age = 4;
        c1.colour = "Brown";
        c1.makesound();
        c1.climb();
    }
    
}
