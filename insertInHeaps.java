import java.util.*;
public class insertInHeaps {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void insert(int data){
            arr.add(data);
            int x=arr.size()-1;
            int i=(x-1)/2;
            while(data<arr.get(i)){
                int temp=data;
                arr.set(x,arr.get(i));
                arr.set(i,temp);
                x=i;
                i=(x-1)/2;

            }
        }
        public int peek(){
            return arr.get(0);//we have to find the  minimum element from heap
        } 
        public void hepify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minval=i;
            if(left<arr.size()&&arr.get(minval)>arr.get(left)){
                minval=left;
            }

            if(right<arr.size()&&arr.get(minval)>arr.get(right)){
                minval=right;
            }

            if(minval!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minval));
                arr.set(minval,temp);

                hepify(minval);
            }
        }
        public  int remove(){
            int data=arr.get(0);
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);

            hepify(0);
            return data;
    }

    public boolean isEmpty(){
        return arr.size()==0;
    }
}
    public static void main(String args[]){
      Heap pq=new Heap();
      pq.insert(3);
      pq.insert(4);
      pq.insert(8);
      pq.insert(6);

      while(!pq.isEmpty()){
          System.out.println(pq.peek());
          pq.remove();
      }
    }
}
