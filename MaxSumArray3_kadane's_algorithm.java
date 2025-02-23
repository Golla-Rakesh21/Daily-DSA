package maxsumarray3;
//kadane's algorithm
public class MaxSumArray3 {
    public static void maxsum(int arr[]){
    int maxsum=Integer.MIN_VALUE;
    int curr=0;
    for(int i=0;i<arr.length;i++){
        curr=curr+arr[i];
        if(curr<0){
            curr=0;
        }
        maxsum=Math.max(curr,maxsum);
        
    }
    System.out.println(maxsum);
    
}
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsum(arr);
    }
    
}
