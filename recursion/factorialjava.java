import java.util.*;
import java.util.Scanner;
public class factorialjava {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fact(num));
    }

    static int fact(int n){
        int st=(n==0)?1:n*fact(n-1);   //optimized approach using ternary operator
        return st;
    }
}
//int st=(n==0)?1:n*fact(n-1);
/* 
if(n==0){
    return 1;
}

    return n*fact(n-1);
} */