import java.util.*;
public class DP_EditDistance {
    public static int EditDistance(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int DP[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(j==0){
                    DP[i][0]=i;
                }
                if(i==0){
                    DP[0][j]=j;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    DP[i][j]=DP[i-1][j-1];
                }else{
                    DP[i][j]=Math.min(DP[i-1][j],Math.min(DP[i][j-1],DP[i-1][j-1]))+1;
                }
            }
        }
        return DP [n][m];
    }
    public static void main(String args[]){
        String str1="Intention";
        String str2="Execution";
        System.out.println(EditDistance(str1, str2));
    }
}
