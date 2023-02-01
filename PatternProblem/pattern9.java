import java.util.*;
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
       for(int row=n;row>0;row--){

        int totalnoofcols=n-row+1;      
for(int col=0;col<totalnoofcols;col++){
    System.out.print(" ");
}

 int totalnoofspaces=2*row-1; 

        for(int spaces=0;spaces<totalnoofspaces;spaces++){
            System.out.print("*");
        }
       System.out.println(); 
       }

System.out.println();
        }
}

