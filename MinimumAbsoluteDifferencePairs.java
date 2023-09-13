import java.util.*;
public class MinimumAbsoluteDifferencePairs {
    public static void main(String args[]){
        int A[]={4,5,3,1};
        int B[]={6,2,8,9};
        //sorting both the arrays 
        Arrays.sort(A);
        Arrays.sort(B); 
        int difference=0;
        for(int i=0;i<A.length;i++){
           difference+=Math.abs(A[i]-B[i]);
        } 
        System.out.println("The minimum absolute difference of pairs is :"+difference);
    }
}
