public class FabonnaciDP {
    public static int fab(int n){
        if(n==0 || n==1){
            return n;
        }
        return fab(n-1)+fab(n-2);
    }
    //Now here we using the DP for optimizing the code
    public static int fab(int n,int f[]){
        if(n==0||n==1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n]=fab(n-1,f)+fab(n-2,f);
        return f[n];
    }
    //Now we solve the same problem of DP by using Tabulation Concept
    public static int TabulationFab(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=6;
        int f[]=new int[n+1];
        System.out.println(fab(n,f));
        System.out.println(TabulationFab(n));

    }
}
