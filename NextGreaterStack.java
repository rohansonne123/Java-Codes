import java.util.Stack;
public class NextGreaterStack { 
    public static void nextgreater(int arr[],int nextmax[]){
        Stack<Integer> s=new Stack<>(); 
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]<arr[i]){
                s.pop();
            } 
            if(s.isEmpty()){
                nextmax[i]=-1;
            }else{
                nextmax[i]=arr[s.peek()];
            } 
            s.push(i);
        } 
        for(int i=0;i<arr.length;i++){
            System.out.println(nextmax[i]);
        }
    }
    public static void main(String[] args){
        int arr[]={6,8,0,1,3}; 
        int nextmax[]=new int[arr.length]; 
        nextgreater(arr,nextmax);
    }
}
