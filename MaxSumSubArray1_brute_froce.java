
//max sub array brute force

package maxsumsubarray1;
public class MaxSumSubArray1 {
    public static void maxsumsubarray(int arr[]){
      int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int curr=0;
                for(int k=i;k<=j;k++){
                    curr=curr+arr[k];
                }
                System.out.println(curr);
                if(maxsum<curr){
                    maxsum=curr;
                }
            }
        }
        System.out.println("max sum : "+maxsum );
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsumsubarray(arr);
    }
    
}
