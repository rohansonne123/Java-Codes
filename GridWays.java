public class GridWays {
    public static int gridways(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }

        int way1=gridways(i+1, j, n, m); //down move
        int way2=gridways(i, j+1, n, m); //right move

        return way1+way2;
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(gridways(0, 0, n, m));

    }
}
