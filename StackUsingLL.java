import java.util.*;
public class StackUsingLL {  
    static class stack{ 
        static class node{
            int data;
            node next;
            node(int data){
                this.data=data;
                this.next=null;
            }
        } 
       

        static LinkedList<Integer> ll=new LinkedList<>(); 
        static node head;
        static node tail;
    

        //isempty 
         static boolean isEmpty(){
            return head==null;
        } 
        static void push(int data){
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
               
                return;
            }
            newnode.next=head;
            head=newnode;
            
        }
        static int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            } 
            int val=head.data;
            head=head.next; 
            return val;

        } 
        static int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }  
            return head.data;
        }
    }
    public static void main(String args[]){
        stack s=new stack(); 
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
