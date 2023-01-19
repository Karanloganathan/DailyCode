import java.util.*;
import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        int c=ss.nextInt();
int sum=0;
while(c!=0){
    sum+=c%10;
    c=c/10;
}

System.out.println(sum);
    }
}
