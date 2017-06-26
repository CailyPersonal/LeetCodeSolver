package Solution.No40To79;

/**
 * V1.0  - CailyPersonal
 * <p>
 * 2017/6/26 - created.
 */

/**
 * @No. 79
 * @title Word Search
 * @link https://leetcode.com/problems/word-search/#/description
 */
public class No79 {

    private final static char INVALID_CHAR = 0;

    public boolean exist(char[][] board, String word) {

        char[] array = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (array[0] == board[i][j]){
                    board[i][j] = INVALID_CHAR;
                    if(exist(board, array, 1, i, j))  return true;
                    else board[i][j] = array[0];
                }
            }
        }

        return false;
    }

    private boolean exist(char[][] board, char[] word, int index, int lastRow, int lastCol) {

        if (index == word.length) return true;

        // Try heading right.
        if (lastCol < board[0].length - 1 && board[lastRow][lastCol + 1] == word[index]) {
            board[lastRow][lastCol + 1] = INVALID_CHAR;

            if (exist(board, word, index + 1, lastRow, lastCol + 1)) return true;
            else board[lastRow][lastCol + 1] = word[index];
        }

        // Try heading top.
        if (lastRow > 0 && board[lastRow - 1][lastCol] == word[index]) {
            board[lastRow - 1][lastCol] = INVALID_CHAR;
            if (exist(board, word, index + 1, lastRow - 1, lastCol)) return true;
            else board[lastRow - 1][lastCol] = word[index];
        }

        // Try heading left.
        if (lastCol > 0 && board[lastRow][lastCol - 1] == word[index]) {
            board[lastRow][lastCol - 1] = INVALID_CHAR;
            if (exist(board, word, index + 1, lastRow, lastCol - 1)) return true;
            else board[lastRow][lastCol - 1] = word[index];
        }

        // Try heading bottom.
        if (lastRow < board.length - 1 && board[lastRow + 1][lastCol] == word[index]) {
            board[lastRow + 1][lastCol] = INVALID_CHAR;
            if (exist(board, word, index + 1, lastRow + 1, lastCol)) return true;
            else board[lastRow + 1][lastCol] = word[index];
        }

        return false;
    }
}
