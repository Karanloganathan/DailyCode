import java.util.*;
import java.util.Scanner;
public class sumofnumbersinarange2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
            System.out.println(b*(b+1)/2-a*(a+1)/2+a);

            sc.close();
    }
}
// Time complexity : O(1)
// Space complexity : O(1)
