import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;

        do{
            System.out.println("Enter a Number > than 10");
            count = scan.nextInt();
        }while(count<10);



    }
}
