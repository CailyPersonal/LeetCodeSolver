package Solution.No40To79;

import java.util.ArrayList;
import java.util.List;

/**
 * V1.0  - CailyPersonal
 * <p>
 * 2017/6/20 - created.
 */

/**
 * @No. 51
 * @Title N-Queens
 * @Link https://leetcode.com/problems/n-queens/#/description
 */
public class No51 {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> conditions = new ArrayList<>();

        char[][] chessboard = new char[n][n];

        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard.length;j++){
                chessboard[i][j]='.';
            }
        }

        search(conditions, chessboard, 0);

        return conditions;
    }

    public void search(List<List<String>> conditions, char[][] chessboard, int row) {

        for (int i = 0; i < chessboard.length; i++) {

            if (verify(row, i, chessboard)) {
                chessboard[row][i] = 'Q';

                if (row == chessboard.length - 1) {
                    List<String> list = new ArrayList<>();

                    for (char[] items : chessboard) {
                        list.add(new String(items));
                    }

                    conditions.add(list);
                    chessboard[row][i] = '.';
                    return;
                } else search(conditions, chessboard, row + 1);
                chessboard[row][i] = '.';
            }
        }
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
