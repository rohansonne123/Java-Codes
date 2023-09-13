public class queueLinkedList {  
    static class node{
        int data; 
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        } 
       
    } 
    static class Queue{
         public static node head=null;
         public static node tail=null;
         public static boolean isEmpty(){
            return head==null &&tail==null;
         }   
         public static void add(int data){ 
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return;
            } 
            tail.next=newnode;
            tail=newnode;
         }    
         public static int remove(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            } 
            int val=head.data;
            head=head.next;
            return val;
         } 
         public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            } 
            return head.data;
         }
    }
    
    public static void main(String args[]){
        Queue q=new Queue(); 
        q.add(1);
        q.add(2);
        q.add(3); 
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
