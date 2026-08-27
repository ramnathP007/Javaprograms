import java.util.Scanner;

public class greatertwonumnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the Second number");
        int b = scan.nextInt();
        String result = (a>b)?a+" is greater":b+" is greater";
        System.out.println(result);
    }
}
