import java.util.*;
public class queueJCF {
    public static void main(String args[]){
       // Queue q=new LinkedList<>(); 
       Queue q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3); 

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
