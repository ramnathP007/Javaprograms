import java.util.*;
public class Store {

    int sum(int a,int b){    // void menthod or function cannot return so we should mention the data type of the return value
        int sum = a+b;
        return sum;
    }

    public static void main (String[] args)
    {
        Store obj1=new Store();
        int remainder = obj1.sum(20,10);
        System.out.println(remainder);
    }    
}
