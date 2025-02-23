
package linearsearch;
public class LinearSearch {
    public static int linearsearch(int arr[],int key){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    int position=i+1;
                    
                    return position;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={9,4,5,63,26,24,1};
        int position=linearsearch(arr,24);
        System.out.println("key found at "+position+" position");
    }
    
}
