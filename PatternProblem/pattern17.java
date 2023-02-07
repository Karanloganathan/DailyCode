import java.util.*;
import java.util.Scanner;
public class pattern17 {
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
              System.out.print(col);
        }

        System.out.println();
    
}
}

    }

/*
 5
12345
 1234
  123
   12
    1
 */