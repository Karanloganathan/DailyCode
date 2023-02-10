import java.util.*;
import java.util.Scanner;
public class additionoftwonumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(addi(num));
    }

    static int addi(int n){
        int sum=0;

        if(n==5){
            return n;
        }
        sum+=n;
        return addi(n+1);
    }
}
