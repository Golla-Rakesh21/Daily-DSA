//singly linked list execution
package ll;
   
    
public class LL {
    //creating the structure of the node
     public class Node{
        public int data;
        public Node next;
    }
     //initializing the variables required for linked list
    public Node head;
    public Node tail;
    public int size;
    //creating of node time complexity=o(1),space complexity o(1)
    public Node createsl(int value){
        Node node=new Node();
        node.next=null;
        node.data=value;
        head=node;
        tail=node;
        size=1;
        return head;
    }
//insertion of node time complexity o(n) space complexity o(1)
    public void Insertll(int nodeval,int location){
        Node node=new Node();
        node.data=nodeval;
        if(head==null){
            createsl(nodeval);
        }
        else if(location==0){
            node.next=head;
            head=node;
        }
        else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else{
            Node tempNode = head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=node;
            node.next=nextNode;
        }
        size++;
    }
        
//traversal of singly linked list time complexity o(n) space complexity o(1)
     public void travesal(){
         Node temp=head;
         if(head==null){
             System.out.println("no values in the list");
         }
         else {
             for(int i=0;i<size;i++){
                 System.out.print(temp.data);
                 temp=temp.next;
                 System.out.print("->");
             }
             System.out.println("null");
         }
     }
     //searching in singly linked list time complexity o(n) space complexity o(1)
     public void search(int value){
         Node temp=head;
         int data1;
         if(head==null){
             System.out.println("null");
             return;
         }
         if(head!=null){
             for(int i=0;i<size-1;i++){
                 data1=temp.data;
                 
                 if(value==data1){
                     System.out.println("found the required value at - "+(i+1));
                     return;
                 }   
                 temp=temp.next;
              }
             System.out.println("value not found in linked list");
         }   
     }
     
     //deletion of a node in singly linked list
     public void deletefirst(){
         if(head==null){
             System.out.println("Linked list is null");
         }else if (head == tail) {
        // If there is only one node in the list
        System.out.println("Deleted node: " + head.data);
        head = tail = null;
        size = 0;
         }
         else{
         Node temp=head.next;
         head.next=null;
         System.out.println("deleted node :"+ head.data);
         head=temp;
         size--;
         }
         
    }
     public void deletelast(){
         if(head==null){
             System.out.println("Linked list is null");
         }else if (head == tail) {
        // If there is only one node in the list
        System.out.println("Deleted node: " + head.data);
        head = tail = null;
        size = 0;
         }
         else{
             Node temp = head;
        while (temp.next != tail) { // Traverse to the second-last node
            temp = temp.next;
        }
        System.out.println("Deleted node: " + tail.data);
        temp.next = null; // Remove the reference to the last node
        tail = temp; // Update the tail
        size--; // Decrement the size
         }
     }
public void deletespecific(int location) {
    if (head == null) {
        System.out.println("Linked list is null");
        return;
    } else if (location == 0) {
        deletefirst();
    } else if (location >= size - 1) {
        deletelast();
    } else {
        Node temp = head;
        for (int i = 0; i < location - 1; i++) {
            temp = temp.next;
        }
        System.out.println("Deleted node: " + temp.next.data);
        temp.next = temp.next.next;
        size--; // Decrement size
    }
   
}    
    public void deleteentire(){
        System.out.print("before delete Entire : ");travesal();
        System.out.println("");
        head=tail=null;
        System.out.print("after delete Entire : ");travesal();
    }
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        LL l=new LL();
        System.out.println(l.createsl(20).data);
        l.Insertll(21, 0);
        l.Insertll(22, 1);
        l.Insertll(23, 2);
        l.Insertll(24, 3);
        l.Insertll(27, 2);
        System.out.println(l.head.next.next.data);
        System.out.println(l.size);
        l.travesal();
        l.search(24);
        l.deletefirst();
        l.deletelast();
        l.deletespecific(2);
        l.travesal();
        System.out.println(l.size);
        l.deleteentire();
    }
    
    
}





/*20
27
6
21->22->27->23->24->20->null
found the required value at - 5
deleted node :21
Deleted node: 20
Deleted node: 23
22->27->24->null
3
before delete Entire : 22->27->24->null

after delete Entire : no values in the list
BUILD SUCCESSFUL (total time: 0 seconds)
*/

