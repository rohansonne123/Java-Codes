import java.util.*;
public class MaximumSubarrayWith0Sum {
    public static void main(String args[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={15,2,-2,-8,1,7,10,23};
        int sum=0;
        int ln=0;
        for(int j=0;j<arr.length;j++){
          sum+=arr[j];
          if(map.containsKey(sum)){
            ln=j-map.get(sum);
          }else{
            map.put(arr[j],j);
          }
        }
        System.out.println(ln);
    }
}
