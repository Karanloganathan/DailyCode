import java.util.*;
import java.util.Scanner;
public class combination {
    public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
int combination=n*(n-1)/2;
System.out.println(combination);
    }
}
