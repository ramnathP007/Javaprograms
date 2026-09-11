//Constractor is a function which is in the class name used to initialise a variable

//In General if we do not initialise a variable it will return a error, but if we call a variable inside a class through the object name it will return a default constructor

/* Eg:


    int a;
    String b;
    System.out.println(a);
    System.out.println(b);
*/
// we will get a error but when we call by like the below we will get 0 for int and null for String by default

    public class Student{
        int marks;
        String name;

        //Constructor

        Student(){
            System.out.println("Hello");
        }


        public static void main (String[] args){
            Student ob1 = new Student ();
            Student ob2 = new Student ();
            // without calling any function the constructor will be called -> output : Hello
            System.out.println(ob1.name);
            System.out.println(ob1.marks);
            //Now as default constractor is called that is 0 and null
 }
        }
        
// we will get null and 0 respectively


