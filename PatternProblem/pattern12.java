import java.util.*;
import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
       
        for(int row=1;row<=n;row++){
            //spaces
        int totalnoofspaces=n-row;
        for(int spaces=0;spaces<totalnoofspaces;spaces++){
                       System.out.print("  "); //extra spaces
        }
 
        
            for(int col=row;col>=1;col--){
                System.out.print(col + " ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+ " ");
            }

            System.out.println();
        }

            System.out.println();
        }

    }