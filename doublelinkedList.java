import java.util.*;
public class doublelinkedList { 
    static class node{
        int data;
        node next; 
        node prev;
        node(int data){
            this.data=data;
            this.next=null; 
            this.prev=null;
        }  
    }
        public static void addFirst(int data){ 
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return;
            } 
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        } 
        public static void addLast(int data){ 
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
            newnode.prev=temp;
            tail=newnode;
        } 
        public static void addMiddle(int idx,int data){
             if(head==null||head.next==null){
                   addFirst(data);
                   return;
             } 
             node newnode=new node(data);
             int i=0;
             node temp=head;
             while(i!=idx-2){
                temp=temp.next;
             } 
             temp.next=newnode;
             newnode.next=temp.next.next;
             temp.next.next.prev=newnode;

             
        } 
        public static int  removeFirst(){
           if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
           } 
           int val=head.data;
           head=head.next;
           head.prev=null;
           return val;
        } 
        public static int removeLast(){
            if(head==null){
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
               }  
               node temp=head;
               while(temp.next.next!=null){
                temp=temp.next;
               } 
               int val=temp.data;
               temp.next=null; 
               
               return val;
        } 
        public static void print(){
            if(head==null){
                System.out.println("DLL is empty");
                return;
            } 
            node temp=head;  
            System.out.print("null");
            while(temp.next!=null){
                System.out.print("<--"+ temp.data+"-->"); 
                temp=temp.next;
            } 
            System.out.print("null"); 
            System.out.println();
        } 
        public static int size(){
          node temp=head; 
          int i=0;
          while(temp.next!=null){
             temp=temp.next; 
             i++;
          } 
          return i;
        }
       
        public static node head;
        public static node tail;
    
    public static void main(String args[]){
        doublelinkedList dll=new doublelinkedList(); 
        dll.addFirst(1); 
        dll.addLast(2); 
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        System.out.println("require Doublely linkedlist is");
        dll.print();
        dll.removeFirst();
        dll.removeLast();
        System.out.println("Doublely LinkedList after removing first and last is"); 
        dll.print(); 
        System.out.println("the size of Doublely Linkedlist is "+ dll.size());

    }
}
