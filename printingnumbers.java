import java.util.*;

public class printingnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your start number");
        int a = scan.nextInt();
        System.out.println("Enter Your end number");
        int b = scan.nextInt();
        System.out.println("Printing the numbers");
        for (int i=a;i<=b;i=i+1)
        {
            System.out.println(i);
        }
    }
}
