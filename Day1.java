package dsa1;
class Singled{
    int arr[]=null;
    //initialization of array
    public Singled(int sizeofarray){
        arr=new int[sizeofarray];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    //inserting elements in array
    public void insert(int location,int valuetobeinserted){
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=valuetobeinserted;
                System.out.println("Successfully inserted");
            }else{
                System.out.println("the cell is already occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }
    public void TraverseArray(){
        try{
            System.out.print("the values in array are : ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        catch(Exception e){
            System.out.println("Array no longer exists!");
        }
    }
    
    //Search for an element in array
    public void SearchElement(int valuetobeSearched){
        for(int i=0;i<arr.length;i++){
           if(arr[i]==valuetobeSearched) {
               System.out.println("The value "+valuetobeSearched+" is fount at the index of "+i);
               return;
           }
        }
        System.out.println(valuetobeSearched+" value not found in the array!");
    }
    
    //Delete value form array
    public void deletevalue(int valuetobedeleted){
    try{
        System.out.println("Before deletion of element : "+java.util.Arrays.toString(arr));
        arr[valuetobedeleted]=Integer.MIN_VALUE;
        System.out.println("After deletion of element : "+java.util.Arrays.toString(arr));
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The value that is provodes is not in the range of array");
    }
   }
}
public class Dsa1 {
    public static void main(String[] args) {
        Singled s=new Singled(5);
        s.insert(0,5);
        s.insert(1,8);
        s.insert(2,7);
        s.insert(3,9);
        s.insert(4,78);
        s.TraverseArray();
        s.SearchElement(78);
        s.SearchElement(896);
        s.deletevalue(0);
    }
    
}


//output
/*
Successfully inserted
Successfully inserted
Successfully inserted
Successfully inserted
Successfully inserted
the values in array are : 5 8 7 9 78 
The value 78 is fount at the index of 4
896 value not found in the array!
Before deletion of element : [5, 8, 7, 9, 78]
After deletion of element : [-2147483648, 8, 7, 9, 78]
BUILD SUCCESSFUL (total time: 0 seconds)
*/
