import java.util.*;
public class stringperformance {
 public static void main(String[] args){
loweralphabet();
upperalphabet();
 }  
 
 static void loweralphabet(){
    for(int i=0;i<26;i++){
        char ch=(char)('a'+i);
        System.out.print(ch);  //abcdefghijklmnopqrstuvwxyz
    }

    System.out.println();
 }
 

 static void upperalphabet(){
    for(int i=0;i<65;i++){
        char ch=(char)('A'+i);
        System.out.print(ch);
    }
 }
}
//time complexity is O(N^2)