import java.util.*;
public class arithmetic {

    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sub(int a,int b){
        System.out.println(a-b);
    }

    void mul(int a,int b){
        System.out.println(a*b);
    }

    void div(int a,int b){
        System.out.println(a/b);
    }

    public static void main (String[] args)
    {
        arithmetic obj1=new arithmetic();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = scan.nextInt();
        System.out.println("Enter the value of b:");
        int b = scan.nextInt();
        obj1.sum(a,b);
        obj1.sub(a,b);
        obj1.mul(a,b);
        obj1.div(a,b);
    }    
}
