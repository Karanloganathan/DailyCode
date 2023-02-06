import java.util.*;
import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
}

static void pattern(int n){
    for(int row=1;row<2*n;row++){
      int sp=row > n?2 * n - row:row;
        for(int spaces=0;spaces<n-sp;spaces++){
              System.out.print("  "); //extra spaces
        }

        for(int col=sp;col>=1;col--){
          System.out.print(col+" ");
        }
        for(int col=2;col<=sp;col++){
          System.out.print(col+" ");
        }
       System.out.println();
    } 
}
}
/*
        
 */