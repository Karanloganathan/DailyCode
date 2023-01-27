import java.util.*;
import java.util.Scanner;

public class loop1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern1(num);
        }
  
  
  static void pattern1(int n){for(int row=1;row<=n;row++){
                
//every rows,run the col
                
for(int col=1;col<=row;col++){
System.out.print("*");
}
                
//when one row is printed ,we need a newline
                
System.out.println();
    }
}
}
