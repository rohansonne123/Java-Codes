import java.util.*;
public class MaximumLengthChainOfPairs {
    public static void main(String args[]){
      int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
      //sorting the 2 nd entities means 1st column
      Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
      int lastend=arr[0][1];
      int count=1;
      for(int i=1;i<arr.length;i++){
        if(arr[i][0]>lastend){
            count++;
            lastend=arr[i][1];
        }
      } 
      System.out.println("The maximum length chain of pairs is :"+count);
    }
}
