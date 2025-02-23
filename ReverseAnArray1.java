
package reverseanarray1;
import java.util.Arrays;
public class ReverseAnArray1 {
    public static void reversearr(int arr[]){
        int start=0, end=arr.length-1,temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int arr[]={3,4,2,78,43};
        reversearr(arr);
        
    }
    
}
