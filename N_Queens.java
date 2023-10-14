
package collage;


public class N_Queens {
    public static boolean isSafe(char[][] board,int row,int col){
        for (int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for (int i=row-1,j=col-1; i>=0 && j>= 0 ; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for (int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void Board(char [][]board,int row){
        if(row == board.length){
            Print(board);
            return;
        }
        for (int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                Board(board,row+1);
                board[row][j] = '.';
            }
        }
    }

    public static void Print(char[][] board){
        System.out.println("------------chess Board -----------");

        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                if (chars[j] == 'Q') {
                    System.out.print(chars[j] + " ");
                } else {
                    System.out.print("x" + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];

        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                board[i][j] = '.';
            }
        }
        Board(board,0);
    }
}
