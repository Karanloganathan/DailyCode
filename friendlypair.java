import java.util.*;
import java.util.Scanner;
public class friendlypair {
    static int sumof(int x){
        int sum=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
            sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        int num1=ss.nextInt();
        int num2=ss.nextInt();

        int sum1=sumof(num1);
        int sum2=sumof(num2);

        String st=((sum1/num1)==(sum2/num2))?"are friendly pair":"not a friendly pair";
        System.out.println(num1+" "+num2+st);
    }
}
