import java.util.*;
import java.util.Scanner;
public class octaltodecimal {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=0,sum=0,digit;
while(num!=0){
    digit=num%10;
    sum+=(int)Math.pow(8,i)*digit;
    num/=10;
    i++;
}
    System.out.println(sum);
    }
}
