public class DP_CountBST {
    public static int calculateBST(int n){
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
        System.out.println(calculateBST(n));
    }
}
