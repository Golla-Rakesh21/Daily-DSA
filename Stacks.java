//stacks implementation
package stacks;

public class Stacks {
    int size;
    int topOfStack;
    int[] arr;

    // Default constructor
    public Stacks() {
        this.size = 10; // Default size is 10
        this.arr = new int[size];
        this.topOfStack = -1;
    }

    // Parameterized constructor
    public Stacks(int size) {
        this.size = size; // Use provided size
        this.arr = new int[size];
        this.topOfStack = -1;
    }
    public int elementsinstack(){
        
        return topOfStack+1;
    }
    public void push(int num) throws Exception{
        if(topOfStack==size-1){
            throw new Exception("Stack is full");
        }
        topOfStack++;
        arr[topOfStack]=num;   
    }
    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("stack is empty");
        }
        int temp=arr[topOfStack];
        topOfStack--;
        return temp;
    }
    public boolean isempty(){
        return topOfStack<0;
    }
    public void display(){
        System.out.print("[");
        for(int i=0;i<=topOfStack;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("]");
    }
    public boolean isfull(){
        return topOfStack+1==size;
    }
    public void peek(){
        System.out.println("The Top Element : "+arr[topOfStack]);
    }
    public static void main(String[] args) throws Exception {
        // Creating a stack with the specified size
        Stacks s = new Stacks(5);
        System.out.println("Stack size: " + s.size); // Should print 23
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.isfull());
        s.pop();
        System.out.println("size of stack after pop: "+ s.elementsinstack() );
        s.display();
        s.peek();
      
    }
}
