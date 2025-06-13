public class Recrussion_coin_problem{
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
        printtoss(n-1, ans+'H');
        printtoss(n-1, ans+'T');
    }
}


//output:-

// HHH 
// HHT 
// HTH 
// HTT
// THH
// THT
// TTH
// TTT