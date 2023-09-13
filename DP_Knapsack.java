import java.util.*;
public class DP_Knapsack {
    public static int knapsack(int val[],int wt[],int W,int n,int DP[][]){
        if(W==0 || n==0){
            return 0;
        }
        if(DP[n][W]!=-1){
            return DP[n][W];
        }
        if(wt[n-1]<=W){
            //include 
            int ans1=val[n-1]+knapsack(val,wt,W-wt[n-1],n-1,DP);
            //exclude
            int ans2=knapsack(val,wt,W,n-1,DP);
            DP[n][W]=Math.max(ans1,ans2);
            return DP[n][W];
        }else{
             DP[n][W]=knapsack(val,wt,W,n-1,DP);
            return DP[n][W];
        }
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int DP[][]=new int[val.length+1][W+1];
        for(int i=0;i<DP.length;i++){
            for(int j=0;j<DP[0].length;j++){
                DP[i][j]=-1;
            }
        }
       // System.out.println(knapsack(val,wt,W,val.length));
       System.out.println(knapsack(val, wt, W, val.length,DP));

    }
}
