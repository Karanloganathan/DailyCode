public class sb {
    public static void main(String[] args){
        StringBuilder bd=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            bd.append(ch); //abcdefghijklmnopqrstuvwxyz
        }
        System.out.println(bd);
        System.out.println(bd.toString());

        bd.deleteCharAt(0); //bcdefghijklmnopqrstuvwxyz
        System.out.println(bd);

        bd.reverse();      //zyxwvutsrqponmlkjihgfedcb
        System.out.println(bd);
    }
}
