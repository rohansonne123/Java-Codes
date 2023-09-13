import java.util.*;
public class StackOperationsUsingLL {
    static class stack{
    static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    
    }
       static LinkedList ll=new LinkedList();
       static node head;
       public boolean isEmpty(){
        return head==null;
       }
       public void push(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
       }
       public int pop(){
        if(head==null){
            return -1;
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
      stack s=new stack();
      s.push(1);
      s.push(2);
      s.push(3);
      while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
      }
    }
}
