
package bubblesort;
import java.util.Arrays;
public class BubbleSort {

    public void sort(int[] arr ){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={4,5,7,2,5,8};
        BubbleSort bb=new BubbleSort();
        bb.sort(arr);
        
    }
    
}
