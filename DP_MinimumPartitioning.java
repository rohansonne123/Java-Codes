public class DP_MinimumPartitioning {
    public static int MinPart(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int w=sum/2;
        int DP[][]=new int[n+1][w+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
               if(arr[i-1]<=j){
                //valid
                int ans1=arr[i-1]+DP[i-1][j-arr[i-1]];
                //invalid
                int ans2=DP[i-1][j];

                DP[i][j]=Math.max(ans1,ans2);
               }else{
                //invalid
                int ans2=DP[i-1][j];
                DP[i][j]=ans2;
               }
            }
        }
        int sum1=DP[n][w];
        int sum2=sum-sum1;

        return Math.abs(sum1-sum2);
    }
    public static void main(String args[]){
        int arr[]={1,6,11,5};
        System.out.println(MinPart(arr));

    }
}
