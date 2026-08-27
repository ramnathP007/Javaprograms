import java.util.*;
public class printnumbersdivbythreeandfive {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your start number");
        int a = scan.nextInt();
        System.out.println("Enter Your end number");
        int b = scan.nextInt();
        int count = 0;
        for (int i=a;i<b;i++)
        {
            if (i%3==0 && i%5==0) {
                count= count+1;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
