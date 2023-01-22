import java.util.*;
import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=0,sum=0,rev;
while(num!=0){
    rev=num%10;
    sum+=(int)Math.pow(2,i)*rev;
    num/=10;
    i++;
}
    System.out.println(sum);
    }
}
