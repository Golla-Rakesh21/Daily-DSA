//circular linked list full code and its execution 
package cll;
public class CLL {
    public Node tail;
    public Node head;
    public int size;
    public class Node{
        public int data;
        public Node next;
    }
    //creating the node in circular linked list.
    //time complexity-o(1) space complexity -o(1)
    public Node createNode(int value){
        Node node=new Node();
        node.data=value;
        node.next=node;
        head=node;
        tail=node;
        size++;
        return head;
    }
    
    //insertion of nodes in circular singly linked list.
    public void insertStart(int value){
        Node temp=head;
        Node node=new Node();
        node.data=value;
        node.next=temp;
        head=node;
        tail.next=head;
    }
    
    public void insertEnd(int value){
        Node node =new Node();
        node.data=value;
        node.next=head;
        tail.next=node;
        tail=node;
    }
    public void Insert(int value,int location){
        if(head==null){
            createNode(value);
        }
        else if(location==0){
            insertStart(value);
        }
        else if(location>=size){
            insertEnd(value);
        }
        else{
            Node node =new Node();
            node.data=value;
            Node temp=head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            Node nextnode=temp.next;
            temp.next=node;
            node.next=nextnode;
        }
        size++;
    }
    public void printcll(){
        if(size==0){
            System.out.println("circular linked list is empty"+ null);
        }
        else{
        int i=0;
        Node temp=head;
        while(i<size){
            System.out.print(temp.data);
            
            i++;
            temp=temp.next;
            System.out.print("->");
        }
        System.out.println("node links to firstnode");
        }
    }
    public void deletefirst(){
       if(size==0){
           System.out.println("Linked list is null");
       }
       else if(size==1){
           System.out.println(head.data);
           head=tail=null;
       }
        else
       {  
        Node temp;
        temp=head;
        Node nextnode=temp.next;
        System.out.println("deleted node : "+temp.data);
        head=nextnode;
        tail.next=head;
        
      } 
       size--;
    }
    public void deletelast(){
         if(size==0){
           System.out.println("Linked list is null");
       }
       else if(size==1){
           System.out.println(head.data);
           head=tail=null;
       }else{
           Node temp=head;
           while(temp.next!=tail){
               temp=temp.next;
           }
           System.out.println("deleted node : "+temp.next.data);
           temp.next=head;
           tail=temp;
       }
        size--;
    }
    public void deleteSpecific(int location){
        if(location==1){
            deletefirst();
        }
        else if(location==size){
            deletelast();
        }
        else{
            Node temp=head;
            int index=1;
            while(index<location-1){
                temp=temp.next;
                index++;
            }
            System.out.println("deleted node: "+temp.next.data);
            temp.next=temp.next.next;
        }
        size--;
    }
    public void deleteentire(){
        head=tail=null;
        size=0;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        CLL cll=new CLL();
         cll.createNode(20);
         cll.Insert(21, 0);
         cll.Insert(22, 1);
         cll.Insert(23, 2);
         cll.Insert(24, 3);
         cll.Insert(27, 2);
        System.out.println(cll.head.data);
        System.out.println(cll.tail.next.data);
        System.out.println(cll.size);
        cll.printcll();
        cll.deletefirst();
        cll.printcll();
        System.out.println(cll.tail.next.data);
        cll.deletelast();
        cll.printcll();
        System.out.println(cll.tail.next.data);
        cll.deleteSpecific(3);
        cll.printcll();
        System.out.println(cll.tail.next.data);
        cll.deleteentire();
        cll.printcll();
        
    
    }
    
}
