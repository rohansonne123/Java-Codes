public class SudokoSolver {
    public static boolean sudoko(int arr[][],int row,int col){
        // base case
        if(row==9){
            return true;
        }
        
        int nextrow=row,nextcol=col+1;
        if(nextcol==9){
            nextrow=row+1;
            nextcol=0;
        }
        
        if(arr[row][col]!=0){
           return sudoko(arr, nextrow, nextcol);
         } 

        for(int digit=1;digit<=9;digit++){
            if(isSafe(arr, row, col, digit)){
                arr[row][col]=digit;
                //recursion
                if(sudoko(arr, nextrow, nextcol)){
                    return true;
                }
                arr[row][col]=0;   //backtracking step
            }
        
        }
        return false;
    }
    public static boolean isSafe(int arr[][],int row,int col,int digit){
       //col
       for(int i=0;i<arr.length;i++){
         if(arr[i][col]==digit){
            return false;
         }
       }
       //row
       for(int j=0;j<arr.length;j++){
        if(arr[row][j]==digit){
            return false;
        }
       }
       
       //starting row and column of grid
       int sr=(row/3)*3;
       int sc=(col/3)*3;
       for(int i=sr;i<sr+3;i++){
         for(int j=sc;j<sc+3;j++){
            if(arr[i][j]==digit){
                return false;
            }
         }
       }
       return true;
    }
    public static void printSudoku(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
      int arr[][]={{0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3},
                  };
        if(sudoko(arr, 0, 0)){
            System.out.println("solution exist");
        }else{
            System.out.println("solution does not exist");
        }
        printSudoku(arr);
    }
}
