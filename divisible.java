import java.util.Scanner;

/**
 * divisible
 */
public class divisible {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the digit to check:");
        int digit = scan.nextInt();
        if (digit%3==0 && digit%5==0) {
            System.out.println("Given Digit is divisible by"+" "+digit);
        }
        else{
            System.out.println("Digit is not divisible by"+" "+digit);
        }
        
    }
}