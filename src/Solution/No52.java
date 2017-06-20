package Solution;

/**
 * V1.0  - CailyPersonal
 * <p>
 * 2017/6/20 - created.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @No. 52
 * @Title  N-Queens II
 * @Link https://leetcode.com/problems/n-queens-ii/#/description
 */
public class No52 {
    public int solveNQueens(int n) {

        char[][] chessboard = new char[n][n];

        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard.length;j++){
                chessboard[i][j]='.';
            }
        }

        return search(0, chessboard, 0);
    }

    public int search(int conditions, char[][] chessboard, int row) {

        for (int i = 0; i < chessboard.length; i++) {

            if (verify(row, i, chessboard)) {
                chessboard[row][i] = 'Q';

                if (row == chessboard.length - 1) {
                    chessboard[row][i] = '.';
                    return conditions + 1;
                } else conditions = search(conditions, chessboard, row + 1);
                chessboard[row][i] = '.';
            }
        }

        return conditions;
    }

    private boolean verify(int row, int column, char[][] chessboard) {

        for (int i = 0; i < chessboard.length; i++) {
            if (chessboard[row][i] == 'Q') return false;
            if (chessboard[i][column] == 'Q') return false;

            if (row - i > -1) {
                if (column - i > -1 && chessboard[row - i][column - i] == 'Q') return false;
                if (column + i < chessboard.length && chessboard[row - i][column + i] == 'Q') return false;
            }

            if (row + i < chessboard.length) {
                if (column - i > -1 && chessboard[row + i][column - i] == 'Q') return false;
                if (column + i < chessboard.length && chessboard[row + i][column + i] == 'Q') return false;
            }
        }

        return true;
    }
}
