public class DP_CoinChange {
    public static int CoinChange(int val[],int sum){
        int DP[][]=new int[val.length+1][sum+1];
        for(int i=0;i<val.length;i++){
            DP[i][0]=1;
        }
        for(int i=1;i<val.length+1;i++){
            for(int j=1;j<sum+1;j++){
                if(val[i-1]<=j){
                    //include
                    DP[i][j]=DP[i][j-val[i-1]]+DP[i-1][j];
                }else{
                    //exclude
                    DP[i][j]=DP[i-1][j];
                }
            }
        }
        return DP[val.length][sum];
    }
    public static void main(String args[]){
      int val[]={2,5,3,6};
      int sum=10;
      System.out.println(CoinChange(val, sum));
    }
}
