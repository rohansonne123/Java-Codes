import java.util.*;
public class recursiveSearchll {  
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static node head; 
    public static int helper(node head,int key){
        if(head==null){
            return -1;
        } 
        if(head.data==key){
            return 0;
        } 
        
       int idx= helper(head.next,key); 
       if(idx==-1){
        return -1;
       }
        return idx+1;
    }
    public static int Recursion( int key){
        return helper(head,key);
    }
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<>(); 
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println(ll);
       System.out.println( Recursion( 1));
    }
}
