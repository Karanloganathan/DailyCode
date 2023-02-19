import java.util.*;
import java.util.Scanner;
public class sumofsubarray {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
int[] ar1=new int[n];

System.out.println("Enter data in array");

for(int i=0;i<ar1.length;i++){
    ar1[i]=sc.nextInt();
    }

sumarray(ar1);
    }

    static void sumarray(int ar1[]){
        int sum=0;

for(int start=0;start<ar1.length;start++){
       int temp=0;
    for(int end=start;end<ar1.length;end++){
          temp+=ar1[end];
        System.out.print(temp+" ");
          sum+=temp;
        }
    }
   System.out.println(sum);
}
    }

