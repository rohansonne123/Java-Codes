import java.util.*;
public class dequeInQueue {
    public static void main(String args[]){
     Deque <Integer> deque=new LinkedList<>(); 
      deque.addFirst(1); 
      deque.addFirst(2); 
      deque.addLast(4);
      deque.addLast(5); 
      System.out.println(deque); 
      deque.removeFirst();
      deque.removeLast();
      System.out.println(deque); 
      
      System.out.println(deque.getFirst()); 
      System.out.println(deque.getLast());
      
    }
}
