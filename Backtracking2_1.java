//permutation
public class Backtracking2_1 {
    public static void main(String args[]){
        int[] coin={1,2,3,4,5};
        int amount=4;
        Premutation(coin, amount, " ");
    }
    public static void Premutation(int[] coin,int amount,String ans){
            if(amount==0){
                System.out.println(ans);
                return;
            }
        for(int i=0;i<coin.length;i++){
            
            // if(amount>=coin[i]){
            //     Premutation(coin, amount-coin[i], ans+coin[i]);
            // }
            if(amount>=coin[i]){
                amount-=coin[i];
                Premutation(coin,amount,ans+coin[i]);
                amount+=coin[i];
            }
        }
    }
}
