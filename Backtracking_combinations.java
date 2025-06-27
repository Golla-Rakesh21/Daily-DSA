import java.util.ArrayList;
import java.util.List;

public class Backtracking_combinations {
    public static void main(String args[]){
        int[] arr={1,2,3,4};
        int n=arr.length;
        int k=2;
        int len=0;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ll2=new ArrayList<>();
        combin(arr,0,k,n,0,"",ll,ll2);
        System.out.println(ll2);
    }
    public static void combin(int[] arr,int idx,int k,int n,int len,String ans,List<Integer> ll,List<List<Integer>> ll2){

        if(len==k){
            ll2.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<n;i++){
            ll.add(arr[i]);
            combin(arr,i+1,k,n,len+1,ans+arr[i],ll,ll2);
            ll.remove(ll.size()-1);
        }

    }
}
