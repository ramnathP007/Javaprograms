import java.util.*;
public class evenorodd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digit to check it is even or odd");
        int digit = scan.nextInt();
        if (digit%2==0) {
            System.out.println("The given"+" "+digit+" is a even number");
        }
        else{
            System.out.println("The given"+digit+"is a odd number");
        }

    }
}
