import java.util.*;
import java.util.Scanner;
public class hashset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer>pro=new HashSet<Integer>();
        for(int i=0;i<5;i++){              //pro.size()
         int st=sc.nextInt();
        pro.add(st);
        }

        System.out.println(pro);    //gives unordered 
 //anotherhashset(pro);
//removehashset(pro);
iterate(pro);
 }

 static void anotherhashset(HashSet<Integer>pro){
    Scanner sc=new Scanner(System.in);
    HashSet<Integer>fiveeven=new HashSet<>(pro);
System.out.println(fiveeven);
HashSet<Integer>nextfive=new HashSet<>();

for(int i=0;i<fiveeven.size();i++){
    int st=sc.nextInt();
nextfive.add(st);                           //add()
}
fiveeven.addAll(nextfive);                  //addAll()
System.out.println(fiveeven);
 }

 static void removehashset(HashSet<Integer>pro){
    Scanner ss=new Scanner(System.in);
    HashSet<Integer>pp=new HashSet<>(pro);
    System.out.println(pp);
   int element=ss.nextInt();
  //  pp.remove(element);

//remove()
    boolean result=pp.remove(element);
    System.out.println("remove result->"+result);
    System.out.println(pp);

//removeAll()
HashSet<Integer>evennumbers=new HashSet<>();
int b=ss.nextInt();
for(int i=0;i<=b;i++){
    int st=ss.nextInt();
evennumbers.add(st);                           
}

pp.removeAll(evennumbers);
System.out.println(pp);

//clear()
pp.clear();
System.out.println(pp);
 }

 static void iterate(HashSet<Integer>pro){
    
for(Integer it:pro){
    System.out.print(it+" ");
}

pro.forEach(pk->System.out.print(pk+"\n"));
 }
}


/*
 OUTPUT
 removehashset()
5
1
2
3
4
[1, 2, 3, 4, 5]
[1, 2, 3, 4, 5]
3
remove result->true
[1, 2, 4, 5]
1
3
2
[1, 4, 5]
[]
 */
