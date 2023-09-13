import java.util.Stack;
public class pushBottom { 
    public static void PushBottom(Stack<Integer> s,int key){
        if(s.isEmpty()){
          s.push(key); 
          return;
        } 
        int top=s.pop();
        PushBottom(s,key); 
        s.push(top);
    }
    public static void main(String args[]){
       Stack<Integer> s=new Stack<>(); 
       s.push(1);
       s.push(2);
       s.push(3); 
       PushBottom(s,4);
       while(!s.isEmpty()){
       System.out.println(s.peek());
       s.pop();
       }
    }
}
