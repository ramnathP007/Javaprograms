import java.util.*;

/**
 * score
 */
public class score {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the Score:");
            int score = scan.nextInt();
            if (score < 50) {
                System.out.println("You need to Improve");
            }

            else if (score >= 50 && score <= 70) {
                System.out.println("Good Job");
            }

            else{
                System.out.println("Excellent Performance");
            }
        }
}