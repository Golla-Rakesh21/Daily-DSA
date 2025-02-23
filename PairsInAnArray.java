
package pairsinanarray;
public class PairsInAnArray {
    public static void pairs(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total no of terms"+count);
    }
   public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={5,4,7,9,7,3,8,2};
        pairs(arr);
    }
    
}
