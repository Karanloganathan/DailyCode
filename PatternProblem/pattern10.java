import java.util.*;
import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }
    
    static void pattern(int n){
       for(int row=0;row<n;row++){

int totalnoofspaces=n-row+1;
for(int spaces=0;spaces<totalnoofspaces;spaces++){
    System.out.print(" ");
}
int totalnoofcols=row+1;
for(int cols=0;cols<totalnoofcols;cols++){
        System.out.print("*"+" ");
}
System.out.println();
       }
    
         }
}
