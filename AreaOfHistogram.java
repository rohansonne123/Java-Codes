import java.util.*;
public class AreaOfHistogram {
    public static int histogramArea(int arr[],Stack<Integer> s){
       int arr1[]=new int[arr.length];
       int arr2[]=new int[arr.length];
       for(int i=arr.length-1;i>=0;i--){
        int curr=arr[i];
        
        while(!s.isEmpty()&&curr<arr[s.peek()]){
            s.pop();
        }
      
        if(s.isEmpty()){
            arr1[i]=-1;
        }else{
            arr1[i]=s.peek();
        }
        s.push(i);
       }

       for(int i=0;i<arr.length;i++){
        int curr=arr[i];
        
        while(!s.isEmpty()&&curr<arr[s.peek()]){
            s.pop();
        }
        
        if(s.isEmpty()){
            arr2[i]=-1;
        }else{
            arr2[i]=s.peek();
        }
        s.push(i);

       }
        int area=0;
        int currarea;
       for(int i=0;i<arr.length;i++){
        int height=arr[i];
        int weidth=arr1[i]-arr2[i]-1;
        currarea=height*weidth;
        area=Math.max(area,currarea);
       }

       return area;
    }
    public static void main(String args[]){
      int arr[]={2,1,5,6,2,3};
      Stack<Integer> s=new Stack<>();
      int area=histogramArea(arr,s);
      System.out.println(area);
    }
}
