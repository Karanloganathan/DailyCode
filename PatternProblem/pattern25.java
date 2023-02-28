public class pattern25 {
    public static void main(String[] args){
        int num=5;
        pattern(num);
    }

    static void pattern(int n){
        int k=n-1;
        for(int row=k;row>=0;row--){
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
* * * * *
 *     *
  *   *
   * *
    *
 */