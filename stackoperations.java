import java.util.*;
public class stackoperations { 
    static class stack{ 
        // static ArrayList<Integer> list=new ArrayList<>();
        // static boolean isEmpty(){
        //     return list.size()==0;
        // } 
        // //push 
        // public static void push(int data){
        //     list.add(data);
        // } 
        // //pop 
        // public static int pop(){
        //     int val=list.get(list.size()-1); 
        //     list.remove(list.size()-1);
        //     return val;
        // } 
        // //peek 
        // public static int peek(){
        //    return  list.get(list.size()-1);
        // }  
        static class node{
            int data;
            node next;
            node(int data){
                this.data=data;
                this.next=null;
            }
        } 
        static node head;
        static LinkedList ll=new LinkedList(); 
        static boolean isEmpty(){
            return head==null;
        } 
        //push 
        public static void push(int data){
            node newnode=new node(data);  
            if(head==null){
                head=newnode; 
                return;
            }
            newnode.next=head;
            head=newnode;
        } 
        //pop 
        public static int pop(){ 
            if(isEmpty()){
                return -1;
            }
            int val=head.data;
            head=head.next;
            return val;
        } 
        //peek 
        public static int peek(){ 
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
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
