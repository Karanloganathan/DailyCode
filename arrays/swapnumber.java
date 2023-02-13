import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class swapnumber {
    public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int[] ar= new int[n];

for(int i=0;i<ar.length;i++){
    ar[i]=sc.nextInt();
}  

System.out.println("BEFORE SWAPPING");
System.out.println(Arrays.toString(ar));

int index1=sc.nextInt();
int index2=sc.nextInt();

System.out.println("AFTER SWAPPING");
swap(ar,index1,index2);
System.out.println(Arrays.toString(ar));
    }

    static void swap(int[] ar,int index1,int index2){
        int temp=ar[index1];
        ar[index1]=ar[index2];
        ar[index2]=temp;
    }
}

/*
 OUTPUT
4
2
4
6
8
[2, 4, 6, 8]
 */