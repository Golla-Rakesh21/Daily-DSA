
import java.util.Arrays;

public class Backtracking_Cmbination2{
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        Arrays.sort(arr);
        int target=8;
        bc(arr, target,0,"",0);
    }
    public static void bc(int[] arr,int target,int idx,String ans,int sum){
        if(sum==target){
            System.out.println(ans);
            return;
        }

        for(int i=idx;i<arr.length;i++){
            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }
            
            bc(arr, target, i+1, ans+arr[i],sum+arr[i]);
        }
    }
}