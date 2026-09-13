package package_one;

class Student{
    int mark = 0;
    static String teacher = "Praveen";

    static void display(){
        System.out.println("Hello");
    }
}
public class Mainclass {

    static int a = 10;
    public static void main(String[] args) { // Static function can access only a static variable
        Student.teacher = "Luke";
        Student.display();
        System.out.println(Student.teacher);
        System.out.println(a);
    }
    
}



/*

Static variables and functions can be accessed through the class name itself and it need no obj need to created

the last assigned static variable be set for all the objects

static function can only access the static variable only


static block function is called only when the class is loaded

ie

public class Mainclass{

static {
    System.out.println("Hey there");
}

public static void main(String[] args) { 
        Mainclass m1 = new Mainclass();
        Mainclass m2 = new Mainclass();
    }
}

Output:
Hey there
(Since the mainclass is called only once)

*/
