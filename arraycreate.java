import java.util.*;


public class arraycreate {
    public static void main(String[] args) {
        //direct initialisation
        String[] playlist = new String [3]; // like this we can directly mentione the string as well String[] playlist = ["Aaluma Doluma","Vaa chellam Vaa Vaa Chellam","Poo nee Poo"];
        
        //playlist[0] = "SONG1";
        //playlist[1] = "SONG1";
        //playlist[2] = "SONG1";
        //System.out.println(playlist[2]);

        //getting input from the user
        Scanner scan = new Scanner(System.in);
        playlist[0]= scan.nextLine();
        playlist[1]= scan.nextLine();
        playlist[2]= scan.nextLine();
        System.out.println(playlist[2]);

    }
}
