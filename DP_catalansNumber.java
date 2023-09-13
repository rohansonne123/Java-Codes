import java.util.Arrays;

public class DP_catalansNumber {
    public static int catalanRec(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans+=catalanRec(i)*catalanRec(n-i-1);
        }
        return ans;
    }
    public static int cataMemo(int n,int DP[]){
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;
        if(DP[n]!=-1){
            return DP[n];
        }
        for(int i=0;i<=n-1;i++){
            ans+=cataMemo(i, DP)*cataMemo(n-i-1, DP);
        }
        DP[n]=ans;
        return DP[n];
    }
    public static int cataTab(int n){
        int DP[]=new int[n+1];
        DP[0]=1;
        DP[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                DP[i]+=DP[j]*DP[i-j-1];
            }
        }
        return DP[n];
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(catalanRec(n));
        int DP[]=new int[n+1];
        Arrays.fill(DP,-1);
        System.out.println(cataMemo(n, DP));
        System.out.println(cataTab(n));
    }
}
