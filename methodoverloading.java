//method overloading is same function name cannot be used twice but same name with different type of arguments can be used for example display() is not the same as display(int a,int b).
import java.util.*;
public class School {
    void sum(int a,int b){
        System.out.println(a+b); 
    }

    void sum(int a,int b,int c){
        System.out.println(a+b+c); 
    }
    
    public static void main (String[] args)
    {
        School obj1 = new School();
        obj1.sum(12,13);
        obj1.sum(12,13,14);
        
            
    }
}
