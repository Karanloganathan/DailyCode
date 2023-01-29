import java.util.*;
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
        for(int row=0;row<2*n;row++){
            int totalcolsinrows=row>n?2*n-row:row;
            for(int col=0;col<totalcolsinrows;col++){
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
****
***
**
*

 */