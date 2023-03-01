public class pattern26 {
    public static void main(String[] args){
        int num=5;
        pattern(num);
    }

    static void pattern(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<2*n-1;col++){
                if((row+col==2)||(col-row==2 && col<=4)||(row==3 && col==3)||(row-col==2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
