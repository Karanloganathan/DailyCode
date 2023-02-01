import java.util.*;
import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        int c=ss.nextInt();
        int rev=0,rem=0,temp=c; //one mistake use temperary variable temp,declare the userinput into it. 
        while(temp>0){   //mistake use >0 
//rev=temp%10; reduce the lines
rem=rem*10+temp%10;
temp/=10;
        }
String st=(c==rem)?"palindrome":"not a palindrome";
        System.out.println(st);
    }
}