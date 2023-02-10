import java.util.*;
import java.util.Scanner;
public class additionofnaturalnumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(addi(num));
    }

    static int addi(int n){
       

        if(n==0){
            return n;
        }
        
        return n+addi(n-1);
    }
}
