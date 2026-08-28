import java.util.*;

public class sumofnumbersinarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] score = new int[5];
        score[0] = scan.nextInt();
        score[1] = scan.nextInt();
        score[2] = scan.nextInt();
        score[3] = scan.nextInt();
        score[4] = scan.nextInt();
        int sum = score[0]+score[1]+score[2]+score[3]+score[4];
        System.out.println(sum);

    }    
}
