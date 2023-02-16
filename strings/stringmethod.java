import java.util.*;
//import java.util.Scanner;
public class stringmethod {
    public static void main(String[] args){
      //  Scanner sc=new Scanner(System.in);
       
String n1=new String("karan");
String n2=new String("kk");
        System.out.println(n1==n2);

        System.out.println(n1.equals(n2));

        //to get character
        System.out.println(n1.charAt(0));
        output();
    }

    static void output(){

        //System.out.println(56);
        Integer num=new Integer(56);
        System.out.println(num.toString());
        System.out.println(num);
        System.out.println(new int[]{1,2,3});
        System.out.println(Arrays.toString(new int[]{1,2,3}));
    }
}
