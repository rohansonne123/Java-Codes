public class MinArrayJumps {
    public static int MinArray(int arr[]){
       int n=arr.length;
       int DP[]=new int[n];
       DP[n-1]=0;
       
       for(int i=n-2;i>=0;i--){
        int steps=arr[i];
        int ans=Integer.MAX_VALUE;
        for(int j=i+1;j<=steps+i;j++){
            ans=Math.min(ans,arr[j]+1);
        }
        DP[i]=ans;
       }
       return DP[0];

    }
    public static void main(String args[]){
        int arr[]={2,3,1,1,4};
        System.out.println(MinArray(arr));
    }
}
