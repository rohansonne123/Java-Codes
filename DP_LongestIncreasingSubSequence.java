import java.util.*;
public class DP_LongestIncreasingSubSequence {
    public static int LCS(int arr1[],int arr2[]){
        int DP[][]=new int[arr1.length+1][arr2.length+1];
        for(int i=1;i<arr1.length+1;i++){
            for(int j=1;j<arr2.length+1;j++){
                if(arr1[i-1]==arr2[j-1]){
                    DP[i][j]=DP[i-1][j-1]+1;
                }else{
                    int ans1=DP[i-1][j];
                    int ans2=DP[i][j-1];
                    DP[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return DP[arr1.length][arr2.length];
    }
    public static int LIS(int arr1[]){
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int arr2[]=new int[set.size()];
        int i=0;
        for (int key : set) {
            arr2[i]=key;
            i++;
        }
        Arrays.sort(arr2);
        return LCS(arr1,arr2);
    }
    public static void main(String args[]){
        int arr[]={50,3,10,7,40,80};
        System.out.println(LIS(arr));
    }
}
