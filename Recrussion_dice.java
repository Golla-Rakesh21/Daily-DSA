public class Recrussion_dice{
    public static void main(String[] args){
        BoardDice(4, 0, "");
    }
    public static void BoardDice(int n,int curr,String ans){
        if(n==curr){
            System.out.println(ans+" ");
            return;
        }
        if(curr>n){
            return;
        }
        BoardDice(n, curr+1, ans+'1');
        BoardDice(n, curr+2, ans+'2');
        BoardDice(n, curr+3, ans+'3');
    }
}