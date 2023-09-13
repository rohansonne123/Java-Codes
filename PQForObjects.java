import java.util.*;
import java.util.PriorityQueue;
public class PQForObjects {
    static class student implements Comparable<student>{
        String name;
        int rank;
        public student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
      PriorityQueue <student> pq=new PriorityQueue<>();
      pq.add(new student("rohan",4));
      pq.add(new student("rohit",6));
      pq.add(new student("prashant",8));

      while(!pq.isEmpty()){
          System.out.println(pq.peek().name+"-->"+pq.peek().rank);
          pq.remove();
      }
    }
}
