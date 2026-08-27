import java.util.*;

/**
 * loaneligibility
 */
public class loaneligibility {
 
    public static void main(String[] args) {
        //get inputs salary and age
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = scan.nextInt();
        System.out.println("Enter Your Salary:");
        int salary = scan.nextInt();
        //logic starts
        if (salary>=20000 || age<25) {
            //get inputs loan amount
            System.out.println("Enter the required loan amount:");
            int loanamt = scan.nextInt();

            //logic starts
            if (loanamt<=50000) {
                System.out.println("You are Eligible for the Loan..!");
            }
            else{
                System.out.println("You are Not Eligible for the Loan..!");
            }
        }
        else{
            System.out.println("You are not Eligible for the loan");
        }
        
    }
}