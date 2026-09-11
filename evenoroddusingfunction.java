import java.util.*;
public class Find {
    int evenorodd (int num){
        int result = num%2;
        return result;
    }
    
    public static void main (String[] args)
    {
        Find obj1=new Find();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int value = obj1.evenorodd (num);
        if (value==0){
            System.out.println(num+" "+"is a even number");
        }
        else{
            System.out.println(num+" "+"is a odd number");
        }
    }
        
}
