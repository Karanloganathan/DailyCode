import java.util.*;
import java.util.Scanner;
public class loop3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern3(num);
    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++){   //there is no change in the outer loop.
            for(int column=1;column<=n-row+1;column++){
                System.out.print("*");
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
            System.out.println();
        }
    }
}
