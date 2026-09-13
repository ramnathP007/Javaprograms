class Person{
    String name;
    Person (String name){
        this.name = name;
        System.out.println(name);
    }
}

class employee extends Person {

    employee (String name){
        super(name);
    }

    int employeeid;

}

public class Mainclass {
    public static void main(String[] args) {
        employee p1 = new employee("John");

    }    
}
