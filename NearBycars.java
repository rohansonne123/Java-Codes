import java.util.PriorityQueue;

public class NearBycars { 
    static class data implements Comparable<data>{
        int x;
        int y;
        int sqrt;
        int i;
        public data(int x,int y,int sqrt,int i){
            this.x=x;
            this.y=y;
            this.sqrt=sqrt;
            this.i=i;
        }
        @Override
        public int compareTo(data s2){
            return this.sqrt-s2.sqrt;
        }
    }
    public static void main(String args[]){
        int arr[][]={{3,3},{5,-1},{-2,4}}; 
        int k=2;
        PriorityQueue <data> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            int sqrt=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
            pq.add(new data(arr[i][0],arr[i][1],sqrt,i));
        } 
        for(int i=0;i<k;i++){
           System.out.println("C"+pq.peek().i);
           pq.remove();
        }

    }
}
