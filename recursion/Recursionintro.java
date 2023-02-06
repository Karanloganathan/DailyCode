public class Recursionintro {
    public static void main(String[] args){
        System.out.print("NUMBERS :");
        print(1);

    }

    static void print(int n){

        if(n==5){
            System.out.print(n);
            return;               //if n==5 comes out of the  funtion
        }
System.out.print(n+" ");

print(n+1);   //tail recursion,last function call.
    }
}
/*
 output
 NUMBERS :1 2 3 4 5
 */
