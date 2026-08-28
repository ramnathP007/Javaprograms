import java.util.Scanner;

public class middleelementinarray {
    public static void main(String[] args) {
        //getting the size of the array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of the len of the array");
        int size =scan.nextInt();
        int[] mark = new int[size];
        //Getting the input for the array
        for (int i=0;i<=size-1;i=i+1){ // To reduce the end we need to do n-1
            mark[i] = scan.nextInt();
        }
        //find and print middle number in an array
        int middle = mark[size/2];
        System.out.println("Middle number is:"+middle);
    }
}
