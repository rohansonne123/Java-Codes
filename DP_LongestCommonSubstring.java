public class DP_LongestCommonSubstring {
    public static int LongestSubstring(String str1,String str2,int n,int m){
        int DP[][]=new int[n+1][m+1];
        int ans=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    DP[i][j]=DP[i-1][j-1]+1;
                    ans=Math.max(ans,DP[i][j]);
                }else{
                    DP[i][j]=0;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String str1="abcde";
        String str2="abdge";
        int n=str1.length();
        int m=str2.length();
        System.out.println(LongestSubstring(str1, str2, n, m));
    }
}
