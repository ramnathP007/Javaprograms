//Enhanced for loop also called as for each loop which makes the iteration easy

//Used for int and string array

import java.util.Scanner;

public class School{

    public static void main(String[] args){

        //normal for loop

        int num[] = {12,45,67,89};
 
        //for(int i=0;i<4;i++){
          //  System.out.println(num[i]);
       // }

        // For each loop
  
        for(int var:num){   // first var=num[0],second var=num[1]
            System.out.println(var);
        }
    }
}


