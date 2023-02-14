import java.util.*;
import java.util.Scanner;

class subarray {
    public static void main(String[] args) throws Exception{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
int[] ar1=new int[n];

System.out.println("Enter data in array");

for(int i=0;i<ar1.length;i++){
    ar1[i]=sc.nextInt();
    }

sub(ar1);

    }

    static void sub(int ar1[]){
        for(int start=0;start<ar1.length;start++){
            for(int end=start;end<ar1.length;end++){

            for(int k=start;k<=end;k++){
                System.out.print(ar1[k]+" ");
            }
            System.out.println();
            }
        }
    }

    
}
