import java.util.*;
public class ConnectNRopes {
    public static void main(String args[]){
       PriorityQueue <Integer> pq=new PriorityQueue<>();
       int arr[]={4,2,3,6};
       int cost=0;
       for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
       } 
       while(pq.size()>1){
           int min=pq.remove();
           int max=pq.remove();
           cost+=min+max;
           pq.add(min+max);
       }
       System.out.println(cost);
    }
}
