import java.util.*;
import java.util.Scanner;
public class countthedigits {
    public static void main(String[] args){
       Scanner ss=new Scanner(System.in); 
       int N=ss.nextInt();
                int count=0,rev,temp=N; //done mistake.   always use the temp variable
                while(N!=0){
                    rev=N%10;
                    if(rev!=0 && temp % rev == 0){
                        count++;
                    }
                    N=N/10;
                }
                System.out.println(count);
            }
        }
    

