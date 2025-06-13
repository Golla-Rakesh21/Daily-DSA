public class Recrussion_coin_no_heads{
    public static void main(String[] args) {
        int n=3;
        String ans="";
        printtoss(n,ans);
    }
    public static void printtoss(int n,String ans){
        if(n==0){
            System.out.println(ans+" ");
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
        printtoss(n-1, ans+'H');
        }
        printtoss(n-1, ans+'T');
    }
}
