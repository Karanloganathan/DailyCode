import java.util.*;
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int  n){
        for(int row=1;row<=n;row++){

            int totalnoofspaces=n-row;
            for(int s=0;s<totalnoofspaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}

/*
 
    *
   **
  ***
 ****
*****
 */