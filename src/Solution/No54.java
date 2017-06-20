package Solution;

import java.util.LinkedList;
import java.util.List;

/**
 * V1.0  - CailyPersonal
 * <p>
 * 2017/6/20 - created.
 */

/**
 * @No. 54
 * @Title Spiral Matrix
 * @Link https://leetcode.com/problems/spiral-matrix/#/description
 */
public class No54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new LinkedList<Integer>();

        boolean OK = false;

        int row = 0, column = 0, all = matrix.length * matrix[0].length, count = 0, turn = 0;

        while(!OK){

            while(column < matrix[0].length - turn){
                list.add(matrix[row][column++]);
                count++;
            }

            row++;column--;

            while(row < matrix.length - turn){
                list.add(matrix[row++][column]);
                count++;
            }

            column--;row--;
            while(column >= turn){
                list.add(matrix[row][column--]);
                count++;
            }

            row--;column++;
            while(row > turn){
                list.add(matrix[row--][column]);
                count++;
            }

            row++;column++;

            if(count == all) return list;

            turn++;
        }

        return list;
    }
}
