import java.util.*;
import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
        for(int row=1;row<=n;row++){   //there is no change in the outer loop.
            for(int column=1;column<=row;column++){
                System.out.print(column+" ");
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
            System.out.println();
        }
    }
       
    }

    /*
     5
1       
1 2     
1 2 3   
1 2 3 4 
1 2 3 4 5
     */
