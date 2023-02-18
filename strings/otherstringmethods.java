import java.util.*;
import java.util.Scanner;
 class otherstringmethods {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
System.out.println(Arrays.toString(name.toCharArray()));
System.out.println(name.toLowerCase());
System.out.println(name.toUpperCase());

char ch=sc.next().charAt(0);
System.out.println(name.indexOf(ch));

System.out.println(" kunal  ".strip());
System.out.println(Arrays.toString(name.split(" ")));
    }
}

/*
 OUTPUT
[k, a, r, a, n]
karan
KARAN
a
1 //a
4 //n
kunal
[karan, loganathan]
 */