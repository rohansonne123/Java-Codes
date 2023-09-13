public class QueueUsingArray {
    static class Queue{
        int arr[];
        int rare;
        int size;
        int front;
        Queue(int n){
            this.size=n;
            this.arr=new int[size];
            this.rare=-1;
            this.front=-1;
        }
        public boolean isEmpty(){
            return rare==-1;
        }

        public void add(int data){
            if(rare==size-1){
                return;
            }
            
            rare=rare+1;
            arr[rare]=data;

        }
        public int remove(){
            if(isEmpty()){
                return -1;
            }
            front=front+1;
            int val=arr[front];
            return val;
        }
        public int peek(){
            return arr[front+1];
        }
    }
    public static void main(String args[]){
      Queue q=new Queue(5);
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }
    }
}
