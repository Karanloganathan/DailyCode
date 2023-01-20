import java.util.*;
import java.util.Scanner;
public class reverseofanumber {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        int c=ss.nextInt();
        int rem=0,rev=0;
         while(c!=0){
            rem=c%10;
rev=rev*10+rem;
c=c/10;
         }
         System.out.println(rev);
        ss.close();
    }
}
           
