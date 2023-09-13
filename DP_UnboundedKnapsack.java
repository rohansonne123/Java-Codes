public class DP_UnboundedKnapsack {
    public static int Unbounded(int val[],int wt[],int w){
        int DP[][]=new int[val.length+1][w+1];
        for(int i=0;i<=val.length;i++){
            DP[i][0]=0;
        }
        for(int j=0;j<=w;j++){
            DP[0][j]=0;
        }
        for(int i=1;i<=val.length;i++){
            for(int j=0;j<=w;j++){
                if(wt[i-1]<=j){
                DP[i][j]=Math.max(val[i-1]+DP[i][j-wt[i-1]],DP[i-1][j]);
                }else{
                    DP[i][j]=DP[i-1][j];
                }
            }
        }
        return DP[val.length][w];
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println(Unbounded(val, wt, W));
    }
}
