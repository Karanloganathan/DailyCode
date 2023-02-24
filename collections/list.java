import java.util.*;
import java.util.List;
class list {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
List<Integer> li=new ArrayList<Integer>();
li.add(0,1);
li.add(1,3);
System.out.print(li+" ");

List<Integer> li1=new ArrayList<Integer>();
for(int i=0;i<n;i++){
int element=sc.nextInt();
li1.add(element);               
}
li.addAll(0,li1);
System.out.print(li+" ");

int j=sc.nextInt();
System.out.println(li.get(j));       //give the output of the element

int index=sc.nextInt();
int k=sc.nextInt();
li.set(index,k);         //update the value.
System.out.print(li);

System.out.println(li.size()); //size() operator.
    }
}
