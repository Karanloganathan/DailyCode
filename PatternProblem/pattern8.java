import java.util.*;
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pattern(num);
    }

    static void pattern(int n){
        for(int row=0;row<n;row++){

int totalnoofspaces=n-row+1;
for(int s=0;s<totalnoofspaces;s++){
    System.out.print(" ");
}
int totalcolsinrow=2*row+1;
for(int col=0;col<totalcolsinrow;col++){
    System.out.print("*");
}

System.out.println();
        }
    }
}

/*
 
      *
     ***
    *****
   *******
  *********
 */