import java.util.*;
public class Store {

    int getsoap(int money){    // void menthod or function cannot return so we should mention the data type of the return value
        int soap_price = 18;
        int rem = money - soap_price;
        return rem;
    }

    public static void main (String[] args)
    {
        Store obj1=new Store();
        int remainder = obj1.getsoap(20);
        System.out.println(remainder);
    }    
}
