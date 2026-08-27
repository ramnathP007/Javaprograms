import java.util.*;
public class onetotenevennumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int a = scan.nextInt();
        System.out.println("Enter the ending number");
        int b = scan.nextInt();
        int evencount = 0;
        for (int i=a;i<b;i++)
        {
            if (i%2==0){
                evencount=evencount+1;
                
            }
        }
        System.out.println(evencount+" Even numbers from "+a+" to "+b);
    }
}
