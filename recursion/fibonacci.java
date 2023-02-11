import java.util.*;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fibo(num));
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);  //this is not a function call
        }
    }
}
