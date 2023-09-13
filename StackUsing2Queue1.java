import java.util.*;
public class StackUsing2Queue1 {
    static class Stack{
        Queue <Integer> q1=new LinkedList<>();

        Queue <Integer> q2=new LinkedList<>();
        public boolean isEmpty(){
            return q1.isEmpty()&&q2.isEmpty();
        }
        public void push(int data){
            if(q1.isEmpty()){
               q2.add(data);
            }else{
                q1.add(data);
            }
        }
        public int pop(){
            int top=-1;
           if(!q1.isEmpty()){
            top=q1.remove();
            while(!q1.isEmpty()){
                q2.add(top);
            }
        }else{
             top=q2.remove();
            while(!q2.isEmpty()){
                 q1.add(top);
            }
        }

            return top;
        }
        
         public int peek(){
             int top=-1;
            if(!q1.isEmpty()){
             top=q1.remove();
             while(!q1.isEmpty()){
                 q2.add(top);
             }
         }else{
              top=q2.remove();
             while(!q2.isEmpty()){
                  q1.add(top);
             }
         }
 
             return top;
        }
    }
    public static void main(String args[]){

    }
}
