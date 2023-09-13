import java.util.*;
public class queue1 {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static node head;
        static node tail;
    static class Queue{
        static LinkedList<Integer> ll=new LinkedList<>();
      public static boolean isEmpty(){
            return head==null;
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
        public int remove(){
            if(head==null){
                return -1;
            }
            if(head.next==null){
                int val=head.data;
                head=null;
                return val;
            }
            int val=head.data;
            head=head.next;

            return val;
        }

        public int peek(){
        
            return head.data;
        }
    }
    public static void main(String args[]){
      Queue q=new Queue();
      q.add(1);
      q.add(2);
      q.add(3);
      while(!q.isEmpty()){
        System.out.println(q.remove());
      }
    }
}
