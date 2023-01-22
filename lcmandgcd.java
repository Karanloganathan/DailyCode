import java.util.*;
public class lcmandgcd {
    public static void main(String[] args){
        int x=3,y=9;

        //to find LCM
          int max=Math.max(x,y);
    
         while(true){
            if((max%x==0)&&(max%y==0)){
                System.out.println(max);
                break;                   //important break -->it print only once
            }else{
                max++;
            }
        }

         //to find GCD
        // int a=36,b=42;
         int min=Math.min(x,y);
         while(min>0){
            if((x%min==0)&&(y%min==0)){
                System.out.println(min);
                break;
            }else{
                min--;
            }
         }
    }
}
