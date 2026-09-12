class A {                      // Derived Class
        int one = 1;
}

class B extends A{                      // Derived Class
        int two = 2;
}

class C extends B{                      // Derived Class
        int three = 3;
}

// This is multilevel inheritenace since we extends the A to B and extends B to C

// One Super Class and one derived class is call Single inheritance
public class Singleinheritance {
    public static void main(String[] args) {
        C ob1 = new C();
        System.out.println(ob1.one);
        System.out.println(ob1.two);
        System.out.println(ob1.three);
        
    }
}
