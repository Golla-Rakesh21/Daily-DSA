public class Recrussion_coin_count{
    public static void main(String[] args) {
        int n=3;
        String ans="";
        System.out.println(printtoss(n,ans));
    }
    public static int printtoss(int n,String ans){
        if(n==0){
            System.out.println(ans+" ");
            return 1;
        }
        int a=printtoss(n-1, ans+'H');
        int b=printtoss(n-1, ans+'T');

        return a+b;
    }
}