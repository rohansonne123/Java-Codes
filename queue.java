public class queue { 
     static class Queue{
      static int arr[];
      static int front;
      static int size; 
      static int rear;
       Queue(int data){ 
        size=data;
        arr=new int[size];
        rear=-1;
        front=-1;
      } 
      public static boolean isEmpty(){
          return front==-1;
      } 
      public static void add(int data){
        if(rear==size-1){
            return;
        } 
        rear=rear+1;
        arr[rear]=data;
      } 
      public static int remove(){
        if(isEmpty()){
            return -1;
        } 
        if(front==-1){
          front=0;
        }
        int val=arr[front++];
        return val;
      } 
      public static int peek(){
        if(isEmpty()){
            return -1;
        } 
        return arr[0];
      }
    } 

    public static void main(String args[]){
        Queue q=new Queue(5); 
        q.add(1);
        q.add(2);
        q.add(3); 
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
