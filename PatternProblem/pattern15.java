import java.util.*;
import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
        int m=2*n;
        for(int row=0;row<=m;row++){                   //up
            for(int col=0;col<=m;col++){                //left
                int index=Math.min(Math.min(row,col),Math.min(m-row,m-col));   //down,right
                System.out.print(index + " ");
            }

            System.out.println();
        }
    }
}

/*
 OUTPUT
0 0 0 0 0 0 0 0 0 0 0 
0 1 1 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 2 2 1 0
0 1 2 3 3 3 3 3 2 1 0
0 1 2 3 4 4 4 3 2 1 0
0 1 2 3 4 5 4 3 2 1 0
0 1 2 3 4 4 4 3 2 1 0
0 1 2 3 3 3 3 3 2 1 0
0 1 2 2 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0 0 0 
 */