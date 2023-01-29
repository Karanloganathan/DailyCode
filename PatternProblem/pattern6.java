import java.util.*;
import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
        for(int row=0;row<2*n;row++){
            int totalcolsinrows=row>n?2*n-row:row;

            //totalnoofspaces
            int noofspaces=n-totalcolsinrows;
            for(int s=0;s<noofspaces;s++){
               System.out.print(" ");
            }

            //totalcolsinrow
            for(int col=0;col<totalcolsinrows;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
