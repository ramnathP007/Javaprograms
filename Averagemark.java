import java.util.*;
public class Averagemark {
    public static void main(String[] args){
        //getting the variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Score of E");
        int E  = scan.nextInt();
        System.out.println("Enter the Score of T");
        int T  = scan.nextInt();
        System.out.println("Enter the Score of M");
        int M  = scan.nextInt();
        System.out.println("Enter the Score of S");
        int S  = scan.nextInt();
        System.out.println("Enter the Score of So");
        int So = scan.nextInt();

        //Logic
        int avg = (E+T+M+S+So)/5;
        if (avg < 35){

            System.out.println("Your Average is:"+avg);
            System.out.println("Additional class is required");
        }
        else{
            System.out.println("Your Average is:"+avg);
            System.out.println("You are good to go");
        }
    }
}
