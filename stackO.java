import java.util.*;
public class stackO { 
    static class stack{
        static ArrayList<Integer> list=new ArrayList<>(); 
        //isempty 
        public static boolean isEmpty(){
            return list.size()==0;
        } 
        public static void push(int data){
                
               list.add(data);
        } 
        public static int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            } 
            int val=list.remove(list.size()-1);
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int val=list.remove(list.size()-1);
            return val;
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
