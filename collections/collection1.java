import java.util.*;
import java.util.Scanner;
 class collection1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Collection<Integer> collect=new ArrayList<>();

        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            collect.add(element);
        }

        System.out.print(collect);

        collect.forEach((element)->{        //lambda function
System.out.println(element);
        });

        for (int st : collect) {         //foreach loop
            System.out.println(st);
        }
        
        int ele=sc.nextInt();
        System.out.println(collect.contains(ele));  //check for one element

        Collection<Integer> collect1=new ArrayList<>();
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            collect1.add(element);
        }
        System.out.println(collect.containsAll(collect)); //check for multiple element
    }
}
