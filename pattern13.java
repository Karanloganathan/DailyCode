import java.util.*;
import java.util.Scanner;
public class pattern13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
     for(int row=n;row>=1;row--){
        
 int totalnoofspaces=n-row;
 for(int spaces=0;spaces<totalnoofspaces;spaces++){
    System.out.print("  ");
 }

          for(int col=row;col>=1;col--){
            System.out.print(col+" ");
        }
        
        for(int col=2;col<=row;col++){
            System.out.print(col+" ");
        }
        
          System.out.println();
     } 
        
}
}

/*
 5
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1
 */