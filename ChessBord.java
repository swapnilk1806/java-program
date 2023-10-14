
package collage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ChessBord {
    public static void Board(char [][] board,int row){
        if(row == board.length){
            PrintQ(board);
            return;
        }
        for (int i=0; i< board.length; i++){
            board[row][i] = 'Q';
            Board(board,row+1);
            board[row][i] ='.';
        }
    }

    public static void PrintQ(char board[][]){
        System.out.println("------------chess Board -----------");
        for (int i=0; i<board.length; i++){
            for (int j=0; j< board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char [][]board = new char[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j< n; j++){
                board[i][j] = '.';
            }
        }
        Board(board,0);
//
//        List<LinkedList<Integer>> ll = new LinkedList<>();
//        LinkedList<Integer> l1 = new LinkedList<>();
//        l1.add(13);
//        l1.add(14);
//        l1.add(78);
//
//        LinkedList<Integer> l2 = new LinkedList<>();
//        l2.add(78);
//        l2.add(14);
//        l2.add(13);
//        l2.add(89);
//        ll.add(l1);
//        ll.add(l2);
//
//
//        for (int i=0; i<ll.size(); i++){
//            LinkedList<Integer> LL = ll.get(i);
//            for (int j=0; j< LL.size(); j++){
//                System.out.print(LL.get(j) + " ");
//            }
//            System.out.println();
//        }


    }
}
