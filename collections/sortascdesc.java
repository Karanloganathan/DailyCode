import java.util.*;
public class sortascdesc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>li=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int j=sc.nextInt();
            li.add(j);
        }

System.out.println(li);

sortasc(li);
sortdesc(li);
    }

     static void sortasc(ArrayList<Integer>li){                        //sortascending
        Collections.sort(li);
        System.out.println(li);
     }

     static void sortdesc(ArrayList<Integer>li){                          //sortdescending
      // Collections.sort(li, Collections.reverseOrder());
      Collections.reverse(li);
        System.out.println(li);
     }
}

/*
 OUTPUT
 5
1
2
3
4
7
[1, 2, 3, 4, 7]
[1, 2, 3, 4, 7]
[7, 4, 3, 2, 1]
 */