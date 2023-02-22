import java.util.ArrayList;
public class operators {
    public static void main(String[] args){
        System.out.println('a'+'b'); //ascii value
        System.out.println("a"+"b");
        System.out.println('a'+3);
        //convert ascii value into alphabet
        System.out.println((char)('a'+3)); //103-d
        System.out.println("a"+1);
        //object
        System.out.println("kk"+new ArrayList<>());
        System.out.println("kunal"+new Integer(56));
        //it won't work
        System.out.println(new Integer(56)+""+new ArrayList<>());
    }
}
