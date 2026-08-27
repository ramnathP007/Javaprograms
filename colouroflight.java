import java.util.*;
public class colouroflight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Colour of the Light:");
        String Color = scan.nextLine();
        if(Color.equals("red")){
            System.out.println("STOP");
        }
        else if (Color.equals("yellow")){
            System.out.println("WAIT");
        }
        else if (Color.equals("green")){
            System.out.println("GO");
        }
    }
}
