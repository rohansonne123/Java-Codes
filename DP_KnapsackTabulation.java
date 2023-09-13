public class DP_KnapsackTabulation {
    public static int knapsackTab(int val[],int wt[],int W,int DP[][]){
        for(int i=0;i<=val.length;i++){
            DP[i][0]=0;
        }
        for(int j=0;j<=W;j++){
            DP[0][j]=0;
        }
        for(int i=1;i<DP.length;i++){
            for(int j=1;j<DP[0].length;j++){
                int v=val[i-1];
                int w=wt[i-1];
                if(w<=j){
                    //include 
                    int inCost=v+DP[i-1][j-w];
                    //exclude
                    int exCost=DP[i-1][j];

                    DP[i][j]=Math.max(inCost,exCost);
                }else{
                    //exclude
                    DP[i][j]=DP[i-1][j];
                }
            }
        }
        return DP[val.length][W];
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int DP[][]=new int[val.length+1][W+1];
        System.out.println(knapsackTab(val, wt, W, DP));
        
    }
}
