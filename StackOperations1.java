import java.util.*;
public class StackOperations1 {
    static class stack{
        ArrayList<Integer> arr=new ArrayList<>();
        public boolean isEmpty(){
            return arr.size()==0;
        }
        public void push(int data){
          arr.add(data);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int val=arr.remove(arr.size()-1);
            return val;
        }
        public int peek(){
            return arr.get(arr.size()-1);
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
