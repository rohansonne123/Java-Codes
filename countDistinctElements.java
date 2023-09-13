import java.util.*;
public class countDistinctElements {
    public static void main(String args[]){
        int arr[]={1,4,2,3,4,2,5,6,7,2};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        System.out.println(hs.size());
    }
}
