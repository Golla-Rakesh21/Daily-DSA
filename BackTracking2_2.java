
import java.util.ArrayList;
import java.util.List;

public class BackTracking2_2 {
    public static void main(String[] args) {
       int amount=4;
       int[] coin={1,2,3,4,5};
       List<Integer> ll=new ArrayList<>();
       List<List<Integer>> ll2=new ArrayList<>();
       //combi(coin, amount, "",0);
       System.out.println(combi(coin, amount,ll,0,ll2)); 

    }
    public static List<List<Integer>> combi(int[] coin,int amount,List<Integer> ll,int x,List<List<Integer>> ll2) {//String ans
        if(amount==0){ 
            System.out.println(ll);
            ll2.add(new ArrayList<Integer>(ll));
            return ll2;
        }
        for(int i=x;i<coin.length;i++){
            if(amount>=coin[i]){
                ll.add(coin[i]); 
                combi(coin, amount-coin[i], ll,i,ll2);
                ll.remove(ll.size()-1);
            }
        }
        return ll2;
    } 
}
