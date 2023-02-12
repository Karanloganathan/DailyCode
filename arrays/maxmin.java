import java.util.*;
import java.util.Scanner;

public class maxmin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int[] ar=new int[n];
for(int i=0;i<ar.length;i++){
ar[i]=sc.nextInt();
}
System.out.println(maxnum(ar));
System.out.println(minnum(ar));
    }

    static int maxnum(int[] ar){
int maxnum=ar[0];
for(int i=0;i<ar.length;i++){
    if(maxnum<ar[i]){
        maxnum=ar[i];
    }
}
return maxnum;
    }

    static int minnum(int[] ar){
        int minnum=ar[0];
        for(int i=0;i<ar.length;i++){
            if(minnum>ar[i]){
                minnum=ar[i];
            }
        }
        return minnum;
            }
}
