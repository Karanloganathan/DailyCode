public class pattern28 { 
    public static void main(String[] args){
        int num=5;
        pattern(num);
    }

    static void pattern(int n){
        for(int row=n;row<0;row--){
            for(int col=n;col<0;col--){
                if((row==col)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            
            
            }
            System.out.println();
        }
    }
}
