import java.util.*;
import java.util.Scanner;
public class arraymethods {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int[] ar1=new int[n];

System.out.println("Enter data in array");
System.out.println();
for(int i=0;i<ar1.length;i++){
    ar1[i]=sc.nextInt();
    }
System.out.println(Arrays.toString(ar1));

//arraysort(ar1);
//arrayequals(ar1);
//arraycopyof(ar1);
//arrayaslist();
//arraybinarysearch(ar1);
//arraybinarysearchextend(ar1);
arrayspliterator(ar1);
}

static void arraysort(int vr[]){
Arrays.sort(vr);                                //sort method
System.out.println(Arrays.toString(vr));
}

static void arrayequals(int vr[]){
    Scanner ss=new Scanner(System.in);
int[] ar2=new int[3];
System.out.println("Enter data in array");
System.out.println();
for(int i=0;i<ar2.length;i++){
    ar2[i]=ss.nextInt();
    }

    System.out.println(Arrays.equals(vr,ar2));  //equalmethod -return boolean
}

static void arraycopyof(int vr[]){
    Scanner sc=new Scanner(System.in);
int[] ar2=Arrays.copyOf(vr, 6);         //copyof
System.out.println(Arrays.toString(ar2));   
ar2[5]=6;
System.out.println(Arrays.toString(ar2));  

int startindex=sc.nextInt();
int endindex=sc.nextInt();
int[] ar3=Arrays.copyOfRange(vr, startindex, endindex);  //copyofRange
System.out.println(Arrays.toString(ar3));  
}

//asList -array return list,  use wrapper class
static  void arrayaslist(){
    Integer a[]=new Integer[]{1,2,3,4}; 
    List<Integer>li=Arrays.asList(a);
System.out.println(li);
}
static void arraybinarysearch(int vr[]){
    Scanner sc=new Scanner(System.in);
    Arrays.sort(vr);                                //sort method
    System.out.println(Arrays.toString(vr));
int key=sc.nextInt();
    System.out.println(Arrays.binarySearch(vr,key));
    }

    static void arraybinarysearchextend(int vr[]){
        Scanner sc=new Scanner(System.in);
        Arrays.sort(vr);                                //sort method
        System.out.println(Arrays.toString(vr));
        int startindex=sc.nextInt();
int endindex=sc.nextInt();
    int key=sc.nextInt();
        System.out.println(Arrays.binarySearch(vr,startindex,endindex,key));
        }

        static void arrayspliterator(int vr[]){
            Scanner sc=new Scanner(System.in);
            int startindex=sc.nextInt();
int endindex=sc.nextInt();
System.out.println(Arrays.spliterator(vr,startindex,endindex));
        }
}

//fil()
