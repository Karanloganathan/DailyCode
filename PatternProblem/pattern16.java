import java.util.*;
import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
        int original=n;                                   //if n=5
        int m=2*n;
        for(int row=0;row<=m;row++){                   //we want till m 
            for(int col=0;col<=m;col++){
                int index=original-Math.min(Math.min(row,col),Math.min(m-row,m-col));  //5-0=5,5-1=4,5-2=3,5-3=2,5-4=1,5-5=0
                System.out.print(index + " ");
            }

            System.out.println();
        }
    }
}

/*
 OUTPUT
5 5 5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 3 3 4 5
5 4 3 2 2 2 2 2 3 4 5
5 4 3 2 1 1 1 2 3 4 5
5 4 3 2 1 0 1 2 3 4 5
5 4 3 2 1 1 1 2 3 4 5
5 4 3 2 2 2 2 2 3 4 5
5 4 3 3 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5 5 5
 */