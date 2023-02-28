public class pattern24 {
    public static void main(String[] args){
        int num=5;
        pattern(num);
    }

    static void pattern(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<2*n-1;col++){
                if((row+col==4)||(col-row==4)||(row==4 && col%2==0)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
 OUTPUT
    *    
   * *   
  *   *  
 *     * 
* * * * *
 */