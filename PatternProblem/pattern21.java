import java.util.*;
import java.util.Scanner;
public class pattern21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
        for(int row=0;row<n;row++){
            int totalnoofspaces=2*n-row;
            for(int spaces=0;spaces<totalnoofspaces;spaces++){
                System.out.print(" ");
            }
            int totalcolsinrow=row+1;
for(int col=1;col<=totalcolsinrow;col++){
    System.out.print(col);
}

for(int col=row;col>0;col--){
    System.out.print(col);
}

           
            System.out.println();
        }
    
    }
}

/*
 OUTPUT
 
          1
         121
        12321
       1234321
      123454321
 */