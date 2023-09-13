import java.util.*;
public class MaxAreaHistogram { 
    public static void maxareainhistogram(int arr[]){ 
        int maxarea=0;
        int nsr[]=new int[arr.length]; 
        int nsl[]=new int[arr.length];
     //next smaller right 
     Stack<Integer> s=new Stack<>(); 
     for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
              s.pop();
        } 
        if(s.isEmpty()){
            nsr[i]=-1;
        }else{
            nsr[i]=s.peek();
        } 
        s.push(i);
     }
     //next smaller left 
      s=new Stack<>(); 
     for(int i=0;i<arr.length;i++){
        while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
              s.pop();
        } 
        if(s.isEmpty()){
            nsl[i]=-1;
        }else{
            nsl[i]=s.peek();
        } 
        s.push(i);
     }  
     //maximum area 
     for(int i=0;i<arr.length;i++){
        int height=arr[i];
        int width=nsr[i]-nsl[i]-1;
        int currarea=height*width;
        maxarea=Math.max(currarea,maxarea);
     } 
     System.out.println("The maximum area in hiostogram is "+maxarea);

    }
    public static void main(String args[]){
         int arr[]={2,1,5,6,3,2}; 
         maxareainhistogram(arr);
    }
}
