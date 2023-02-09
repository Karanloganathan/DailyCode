import java.util.*;
import java.util.Scanner;
public class pattern20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
        int count=1;                                     //we want to use counter variable
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    
    }
}

/*
 OUTPUT
 n=5
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
