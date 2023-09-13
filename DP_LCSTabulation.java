public class DP_LCSTabulation {
    public static int LCS(String str1,String str2,int n,int m,int DP[][]){
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    DP[i][j]=DP[i-1][j-1]+1;
                }else{
                    int ans1=DP[i-1][j];
                    int ans2=DP[i][j-1];
                    DP[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return DP[str1.length()][str2.length()];
    }
    public static void main(String args[]){
        String str1="abcde";
        String str2="abe";
        int n=str1.length();
        int m=str2.length();
        int DP[][]=new int[n+1][m+1];
        System.out.println(LCS(str1, str2, n, m, DP));
    }
}
