    public class Student{
        int marks;
        String name;

        //Constructor

        Student (){
            System.out.println("Empty Constractor");
        }

        Student(int a){
            System.out.println("Hello");
            System.out.println(a);
            
        }


        public static void main (String[] args){
            Student ob1 = new Student ();
            Student ob2 = new Student (10);
            
         }
}
        
// we will get null and 0 respectively


