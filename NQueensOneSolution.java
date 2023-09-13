public class NQueensOneSolution {
     public static boolean nQueens(char board[][],int row){
        if(row==board.length){
            
            return true;
        }
        for(int j=0;j<board.length;j++){
           if(isSafe(board, row, j)){
             board[row][j]='Q';
            if(nQueens(board, row+1)){
                return true;
            }
            board[row][j]='.';
           }
        }
        return false;
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
        
        if(nQueens(board, 0)){
            System.out.println("yes solution exist");
            printBoard(board);
        }else{
            System.out.println("solution does not exist");
        }

    }
}
