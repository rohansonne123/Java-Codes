import java.util.*;
public class reverseStack {  
    public static void PushBottom(Stack<Integer> s,int key){
        if(s.isEmpty()){
            s.push(key);
            return;
        } 
        int top=s.pop();
        PushBottom(s,key);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){ 
    if(s.isEmpty()){
     return;
    } 
    int top=s.pop();
    reverse(s);
    PushBottom(s,top);
    } 
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s. pop());
        }
    }
    public static void main(String args[]){
         Stack<Integer> s=new Stack<>(); 
         s.push(1);
         s.push(2);
         s.push(3);  
         reverse(s); 
         printStack(s);

    }
}
