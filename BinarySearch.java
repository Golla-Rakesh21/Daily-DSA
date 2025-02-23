//The array should be sorted;
package binarysearch;
public class BinarySearch {
    public static int binarysearch(int arr[],int key){
        int start=0,end=arr.length;
        
        while(start <=end){
            int mid=(start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                end=mid-1;
            }
            if(key>mid){
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={1,2,3,4,65,76,87,98};
        int x=binarysearch(arr,87);
        if(x==-1){
            System.out.println("The key was not found");
        }
        else{
            System.out.println("The key was found at "+ x);
        }           
    }
    
}
