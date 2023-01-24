import java.util.*;
import java.util.Scanner;
public class automorphic {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        int num,square;
        num=ss.nextInt();
square=num*num;

while(square!=0){
   if(num==square%10){
    System.out.println("automorphic");
   }else{
    square/=10;
   }

   
}
//System.out.println(square);
    }
}

//it is wrong.