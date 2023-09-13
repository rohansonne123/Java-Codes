public class DP_WildCardMatching {
    public static boolean isMatch(String T,String P){
        int n=T.length();
        int m=P.length();

        boolean DP[][]=new boolean[n+1][m+1];
        DP[0][0]=true;

        for(int i=1;i<n+1;i++){
            DP[i][0]=false;
        }
        for(int j=1;j<m+1;j++){
           DP[0][j]= DP[0][j-1];
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(T.charAt(i-1)==P.charAt(j-1) || P.charAt(j-1)=='?'){
                    DP[i][j]=DP[i-1][j-1];
                }else if(P.charAt(j-1)=='*'){
                    DP[i][j]=DP[i][j-1] || DP[i-1][j];
                }else{
                    DP[i][j]=false;
                }
            }
        }
        return DP[n][m];
    }
    public static void main(String args[]){
        String Text="abaaabab";
        String Pattern="ab****ab?b";
        System.out.println(isMatch(Text, Pattern));
    }
}
