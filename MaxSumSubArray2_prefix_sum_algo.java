
package maxsumsubarray2;

//prefix sum algorithm
public class MaxSumSubArray2 {
    public static void maxsum(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr=i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(maxsum<curr){
                    maxsum=curr;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsum(arr);
               
    }
    
}
