import java.util.*;
import java.util.Scanner;
public class pattern18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
        for(int row=n;row>=1;row--){
    
            int totalnoofspaces=n-row;
            for(int spaces=0;spaces<totalnoofspaces;spaces++){
                System.out.print(" ");
            }
    
            for(int col=1;col<=row;col++){
                  System.out.print(" "+row);
            }
    
            System.out.println();
        
    }
    }
    /*
     5
55555
 4444
  333
   22
    1
     */

     
}
