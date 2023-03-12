import java.util.*;
import java.util.Scanner;
public class areaofCircle {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
    double r,area;
     r=ss.nextDouble();
    area=Math.PI*(r*r);
System.out.printf("%.3f",area);
ss.close();
    }
}

/*Using format() Method of String class
Using round() method of Math class *//
