public class DP_RodCutting {
    public static int RodCutting(int length[],int price[],int RodLength){
        int DP[][]=new int[length.length+1][RodLength+1];
        for(int i=0;i<length.length+1;i++){
            for(int j=0;j<length.length+1;j++){
                if(i==0||j==0){
                    DP[i][j]=0;
                }
            }
        }

        for(int i=1;i<length.length+1;i++){
            for(int j=1;j<length.length+1;j++){
                 if(length[i-1]<=j){
                    DP[i][j]=Math.max(price[i-1]+DP[i][j-length[i-1]],DP[i-1][j]);
                 }else{
                    DP[i][j]=DP[i-1][j];
                 }
                }
            }
            return DP[length.length][RodLength];
        }

        
    
    public static void main(String args[]){
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int RodLength=8;
        System.out.println(RodCutting(length, price, RodLength));
    }
}
