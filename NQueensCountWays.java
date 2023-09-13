public class NQueensCountWays {
    static int count=0;
    public static void nQueens(char board[][],int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
           if(isSafe(board, row, j)){
             board[row][j]='Q';
            nQueens(board, row+1);
            board[row][j]='.';
           }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("-----------ChessBoard-----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
              System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row,j=col;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              board[i][j]='.';
            }
        }
        nQueens(board, 0);
        System.out.println("total number of ways in N-Queen :"+count);

    }
}
