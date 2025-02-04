
package selectionsort;

import java.util.Arrays;
public class SelectionSort {
    public void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
             if(arr[min]!=arr[i]){
                 int temp = arr[min];
                 arr[min] = arr[i];
                 arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
       int[] arr={9,6,7,4,8,3,2};
       SelectionSort ss=new SelectionSort();
       ss.sort(arr);
    }
    
}
