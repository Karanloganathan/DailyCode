import java.util.*;
import java.util.Map;
import java.util.Scanner;
public class hashmap {
    public static void main(String[] args){
        //examaple to map numbers to string.
 Map<String,Integer>numberMapping=new HashMap<>(); //intialization
Scanner ss=new Scanner(System.in);
        //add key-value pair to map
for(int i=0;i<5;i++){
String key=ss.nextLine();
numberMapping.put(key,i);        //put()
}

System.out.println(numberMapping);
//check if empty
System.out.println(numberMapping.isEmpty());  //empty()
//size method
System.out.println(numberMapping.size());    //size()
//key exists in the hashmap.


String st=numberMapping.containsKey("4")?"exist":"not exist"; //contains()
System.out.println(st);

String sr=numberMapping.containsValue(4)?"exist":"not exist";
System.out.println(sr);

//get value by key
Integer v1=numberMapping.get("4");
System.out.println(v1);

//to remove keys from hashmap
numberMapping.remove("one");
System.out.println(numberMapping);

//get only keys from hashmap
Set<String>keys=numberMapping.keySet();
System.out.println(keys);

//to get values from hashmap
Collection<Integer>val=numberMapping.values();
System.out.println(val);

for(Map.Entry<String,Integer>entry:numberMapping.entrySet()){  //entry<> is an interface
    System.out.println("key->"+entry.getKey()+"values->"+entry.getValue());
}

//using forEach
numberMapping.forEach((key,i)->{
    System.out.println("key"+key);
    System.out.println("value"+i);
});
    }
}
