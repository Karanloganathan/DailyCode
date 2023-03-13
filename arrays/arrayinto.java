import java.util.*;
import java.util.Scanner;
public class arrayintro{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] ar=new int[n];

         for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
         }

         for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");  //1 2 3
         }
         //using for-each loop
         for(int num:ar){
            System.out.print(num+" ");  //1 2 3
         }

         System.out.println(Arrays.toString(ar)); //[1, 2, 3]
        
    }
}
