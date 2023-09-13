import java.util.Arrays;

public class DPMCMProblem {
    public static int MCM(int arr[],int i,int j){
        if(i==j){ //for single matrix cost is 0
            return 0;
        }
        int minCost=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=MCM(arr,i,k);
            int cost2=MCM(arr,k+1,j);
            int cost3=arr[i-1]*arr[k]*arr[j]; //cost of given 2 matrices

            int finalCost=cost1+cost2+cost3;

            minCost=Math.min(minCost, finalCost);
        }

        return minCost;
    }
    public static int MCMMemo(int arr[],int i,int j,int DP[][]){
        if(i==j){
            return 0;
        }
        int minCost=Integer.MAX_VALUE;
        if(DP[i][j]!=-1){
            return DP[i][j];
        }

        for(int k=i;k<=j-1;k++){
            int cost1=MCMMemo(arr, i,k, DP);
            int cost2=MCMMemo(arr, k+1, j, DP);
            int cost3=arr[i-1]*arr[k]*arr[j];

            int finalCost=cost1+cost2+cost3;
            minCost=Math.min(finalCost, minCost);
        }
        return DP[i][j]=minCost;
    }
    public static int MCMTabu(int arr[]){
        int n=arr.length;
        int DP[][]=new int[n][n];
        for(int i=0;i<n;i++){
            DP[i][i]=0;
        }
        
        for(int len=2;len<n;len++){
            for(int i=1;i<=n-len;i++){
               int j=len+i-1;
               DP[i][j]=Integer.MAX_VALUE;
               for(int k=i;k<=j-1;k++){
                int cost1=DP[i][k];
                int cost2=DP[k+1][j];
                int cost3=arr[i-1]*arr[k]*arr[j];

                int finalCost=cost1+cost2+cost3;
                DP[i][j]=Math.min(finalCost, DP[i][j]);
               }
            }
        }
        return DP[1][n-1];
    }
    public static void main(String args[]){
      int arr[]={1,2,3,4,3};
      System.out.println(MCM(arr,1,arr.length-1));
      int n=arr.length;
      int DP[][]=new int[n][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            DP[i][j]=-1;
        }
      }
      System.out.println(MCMMemo(arr,1,n-1,DP));

      System.out.println(MCMTabu(arr));
    }
}
