package Solution;

/**
 * Created by caily on 6/26/17.
 */

/**
 * @No. 74
 * @title Search a 2D Matrix
 * @link https://leetcode.com/problems/search-a-2d-matrix/#/description
 */
public class No74 {

    /**
     * @AC true
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        if(0 == row) return false;

        int col = matrix[0].length;
        if(0 == col) return false;

        int rowLo = 0, rowHi = matrix.length - 1,rowMid = 0;

        while(rowHi >= rowLo){
            rowMid = (rowLo + rowHi) / 2;

            if(matrix[rowMid][0] > target) rowHi = rowMid - 1;
            else if(matrix[rowMid][col - 1] < target) rowLo = rowMid + 1;
            else break;
        }

        if(rowHi < rowLo) return false;
        else{

            int lo = 0, hi = col - 1, mid = 0;

            while(hi >= lo){
                mid = (lo + hi) / 2;

                if(matrix[rowMid][mid] == target) return true;
                else if (matrix[rowMid][mid] > target) hi = mid - 1;
                else lo = mid + 1;
            }

        }

        return false;
    }
}
