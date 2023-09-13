public class DP_StringConversion {
    public static int StringConversion(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int DP[][]=new int[n+1][m+1];

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
        int del=n-DP[n][m];
        int ins=m-(n-del);
        System.out.println("del :"+del+"ins :"+ins);
        return del+ins;
    }
    public static void main(String args[]){
        String str1="abcdef";
        String str2="aceg";
        System.out.println("Total no of operations required :"+ StringConversion(str1, str2));
    }
}
