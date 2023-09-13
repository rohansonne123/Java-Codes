public class DP_TargetSum {
    public static boolean targetsum(int val[],int sum,boolean DP[][]){
        for(int i=0;i<=val.length;i++){
            DP[i][0]=true;
        }

        for(int i=1;i<=val.length;i++){
            for(int j=1;j<=sum;j++){
                int v=val[i-1];
                //include
                if(v<=j && DP[i-1][j-v]){
                    DP[i][j]=true;
                }
                //exclude
                else if(DP[i-1][j]==true){
                    DP[i][j]=true;
                }
            }
        }
        print(DP);
        return DP[val.length][sum];
    }
    public static void print(boolean DP[][]){
        for(int i=0;i<DP.length;i++){
            for(int j=0;j<DP[0].length;j++){
                System.out.print(DP[i][j] +" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int val[]={4,1,7,2,3};
        int target_sum=10;
        boolean DP[][]=new boolean[val.length+1][target_sum+1];
        System.out.println(targetsum(val, target_sum, DP));
    }
}
