import java.util.*;
import java.util.LinkedList;
public class DoublyLL{ 
    public class node{
      int data;
      node next;
      node prev;
      public  node(int data){
        this.next=null;
        this.data=data; 
        this.prev=null;
      }
    } 
     public static node head;
     public static node tail;
    public void addFirst(int data){ 
      node newnode=new node(data);
      if(head==null){
        head=tail=newnode; 
        return;
      } 
      newnode.next=head; 
      size++;
      head=newnode;
      newnode.prev=null;
    } 
    public void print(){
      node temp=head;
      while(temp!=null){
        System.out.print(temp.data+"<->");
        temp=temp.next;
      } 
      System.out.println("null");

    }  
    public int removeFirst(){
      if(head==null){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
      } 
      if(head.next==null){
       int val=head.data;
        head=tail=null;
        return val;

      } 
      int val=head.data;
      head=head.next; 
      size--;
      head.prev=null;
      return val;
    } 
    public void revrese(){
      node pre=null;
      node curr=head;
      node next;
      while(curr!=null){
        next=curr.next;
        curr.next=pre; 
        curr.prev=next;
        pre=curr;
        curr=next;
      } 
      head=pre;
    } 
    public void addLast(int data){ 
      node newnode=new node(data);
      if(head==null){
        head=tail=newnode;
        return;
      } 
      node temp=head; 
      while(temp.next!=null){
        temp=temp.next;
      } 
      temp.next=newnode;
      newnode.next=null;
      newnode.prev=temp;
    } 
    public void removeLast(){
      if(head==null){
        System.out.println("LL is empty");
        return;
      }  
      if(head.next==null){
        head=tail=null;
        return;
      }
      node temp=head; 
      while(temp.next.next!=null){
        temp=temp.next;
      }  
      temp.next=null;
      
    }
    public static int size=0;
    public static void main(String[] args){ 
        DoublyLL ll=new DoublyLL(); 
        ll.addFirst(1); 
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5); 
        ll.addLast(6); 
        ll.removeLast();
        ll.print(); 
        ll.removeFirst(); 
        ll.print(); 
        ll.revrese(); 
        ll.print();
    
    }
}