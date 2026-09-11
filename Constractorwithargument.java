public class Student {

    int marks;
    String name;


    Student (int a, String b){
        marks = a;
        name = b;
    }

    public static void main(String[] args){
        Student ob1 = new Student (32,"John");
        // The above statement is equal to 
        /*
        ob1.marks = 32;
        ob1.name = "John"
        
        */
        Student ob2 = new Student (45,"Mathew");

        // The above statement is equal to 
        /*
        ob1.marks = 45;
        ob1.name = "Mathew"
        
        */

        System.out.println(ob1.marks);
        System.out.println(ob2.name);
        
    }
}
