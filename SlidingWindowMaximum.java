import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    static class MAX implements Comparable<MAX>{
        int val;
        int idx;
        public MAX(int val,int idx){
            this.val=val;
            this.idx=idx;
        }

        @Override
        public int compareTo(MAX m2){
            return m2.val-this.val; //MaxHeap in PQ
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];
        PriorityQueue <MAX> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(new MAX(arr[i],i));
        }
        res[0]=pq.peek().val;
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0&&pq.peek().idx<=i-k){
                pq.remove();
            }
            pq.add(new MAX(arr[i],i));
            res[i-k+1]=pq.peek().val;
        } 

        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
