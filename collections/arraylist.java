import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args){
        int n=3;
ArrayList<String>li=new ArrayList<String>();
Scanner sc=new Scanner(System.in);
for(int i=0;i<n;i++){
    String j=sc.nextLine();
    li.add(j);                  //add
}

//addarraylist(li);
//accessarraylist(li);
//removearraylist(li);
iteratearraylist(li);
    }

    static void addarraylist(ArrayList<String>li){  // to pass the arraylist to the function.
        Scanner sc=new Scanner(System.in);
System.out.println("before ");
System.out.println(li);

ArrayList<String>li1=new ArrayList<String>();
for(int i=0;i<li.size();i++){
    String k=sc.nextLine();
    li1.add(k);
}

li.addAll(3,li1);
System.out.println("after");
System.out.println(li);
    }

    /*static void accessarraylist(ArrayList<String>li){
//Scanner cc=new Scanner(System.in);
System.out.println(li.isEmpty());

System.out.println(li.size());


//String be=li.get(2);
//System.out.println(be);

System.out.println(li.set(1,"c#"));
System.out.println(li);
 }*/

 static void removearraylist(ArrayList<String>li){
    //remove
    //removeall
    //clear
    ArrayList<String>li1=new ArrayList<String>();
    li.remove(1);
    System.out.println(li);
li1.add("c++");
li1.add("c");
System.out.println(li1);
    li.removeAll(li1);
    System.out.println(li);
     }


     static void iteratearraylist(ArrayList<String>li){
       //  Iterator<String> it=li.iterator();                        //to iterate
        //while(it.hasNext()){
          //  System.out.print(it.next()+" ");
        //}

        //java 8 stream+lambda
        li.stream().forEach(li1->System.out.println(li1));
     }
     
     //java 8 steam+lambda


    }

/*
 OUTPUT
karan
kiran
vishnu
before 
[karan, kiran, vishnu]
kirak
rakesh
vishali
after
[karan, kiran, vishnu, kirak, rakesh, vishali]
 */

 /*
  OUTPUT
kk
ku
st
false
3
c++
[c, c#, java]
  */
