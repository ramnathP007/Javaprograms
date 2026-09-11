import java.util.*;
public class School {
    String passorfail (int num){
        if (num>=35){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }
    
    public static void main (String[] args)
    {
        School obj1 = new School();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String result = obj1.passorfail(num);
        System.out.println(result);
            
    }
}
