import java.util.*;
public class CircularQueue1 {
    static class Queue{
        int arr[];
        int size;
        int rear;
        int front;
        Queue(int n){
            this.size=n;
            this.arr=new int[size];
            this.front=-1;
            this.rear=-1;
        }
        public boolean isFull(){
            return rear+1%size==front;
        }
        public boolean isEmpty(){
            return front==-1&& rear==-1;
        }

        public void add(int data){
            if(isFull()){
                return;
            }

            if(front==-1){
                front=0;
            }
            rear=rear+1%size;
            arr[rear]=data;
        }

        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int val=arr[front];
            if(front==rear){
                front=rear=-1;
            }else{
                front=front+1%size;
            }
            
            return val;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];

        }
    }
    public static void main(String args[]){
      Queue q=new Queue(5);
      q.add(1);
      q.add(2);
      q.add(3);
      System.out.println(q.remove());
      q.add(4);
      System.out.println(q.remove());

      q.add(5);
      while(!q.isEmpty()){
        System.out.println(q.remove());
      }
    }
}
