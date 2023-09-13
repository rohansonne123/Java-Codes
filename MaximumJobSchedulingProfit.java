import java.util.*;
public class MaximumJobSchedulingProfit {
    public static void main(String args[]){
     int arr[][]={{4,20},{1,10},{1,40},{1,30}};
     Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
     int profit=0;
     int count=0;
     for(int i=arr.length-1;i>=0;i--){
        if(profit<arr[i][0]){
            profit++;
            count+=arr[i][1];
        }
     } 
     System.out.println(count);
    }
}
