public class DP_LongestCommonSubSequence {
    //Longest Common Sub-Sequence Recursive approach
    public static int LCS(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }

        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return LCS(str1,str2,n-1,m-1)+1;
        }else{
            int ans1=LCS(str1,str2,n-1,m);
            int ans2=LCS(str1,str2,n,m-1);

            return Math.max(ans1,ans2);
        }
    }
    //Longest Common Sub-Sequence Memoization step
    public static int LCS(String str1,String str2,int n,int m,int DP[][]){
        if(n==0 || m==0){
            return 0;
        }

        if(DP[n][m]!=-1){
            return DP[n][m];
        }else{
            if(str1.charAt(n-1)==str2.charAt(m-1)){
                return DP[n][m]=LCS(str1,str2,n-1,m-1,DP)+1;
            }else{
                int ans1=LCS(str1,str2,n-1,m,DP);
                int ans2=LCS(str1,str2,n,m-1,DP);

                return DP[n][m]=Math.max(ans1,ans2);
            }
        }
    }
    public static void main(String args[]){
        String str1="abcde";
        String str2="abe";
        int n=str1.length();
        int m=str2.length();
      //  System.out.println(LCS(str1, str2, n, m));
       int DP[][]=new int[n+1][m+1];
       for(int i=0;i<n+1;i++){
        for(int j=0;j<m+1;j++){
            DP[i][j]=-1;
        }
       }
       System.out.println(LCS(str1, str2, n, m, DP));
    }
}
