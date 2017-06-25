package Solution;

/**
 * Created by Caily on 6/25/2017.
 */

/**
 * @No. 72
 * @title Edit Distance
 * @link https://leetcode.com/problems/edit-distance/#/description
 * @level hard
 */
public class No72 {

    public int minDistance(String word1, String word2) {

        int m = word1.length(), n = word2.length();

        if (0 == m) return n;
        if (0 == n) return m;

        char[] w1 = word1.toCharArray(), w2 = word2.toCharArray();

        /**
         * Obviously, this problem need use DP to solve it. So, we need a map to contain the result of each step. And
         * map[i][j] means for words1 from 0 to i, it needs map[j][j] steps to be words2 from 0 to j (i and j are
         * included).
         * We can get follow rules:
         *  1. if words1[i] == words2[j], which means map[i][j] = map[i-1][j-1]. (two string add the same letter)
         *  2. else map[i+1][j+1] = min(map[i][j-1], map[i-1][j], map[i-1][j-1]).
         *     A. map[i][j-1] and map[i-1][j] is OK, but u want to add a letter on words1 or words2, so an extra
         *        operation is needed.
         *     B. Although map[i][j-1] and map[i-1][j] is OK, but it maybe just a kind of operation waste(insert +
         *        replace from min(map[i][j-1], map[i-1][j]) and a simple replace is from map[i][j] directly.
         */

        int[][] map = new int[m + 1][n + 1];

        // Initilize the map for single direction(0 ~ m and 0 ~ n).
        for (int i = 0; i <= m; map[i][0] = i, i++) ;
        for (int i = 1; i <= n; map[0][i] = i, i++) ;

        // Now do the map here. The scan direction is from top to bottom and from left to right.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (w1[i] == w2[j]) map[i + 1][j + 1] = map[i][j];
                else
                    map[i + 1][j + 1] = Math.min(map[i][j], Math.min(map[i + 1][j], map[i][j + 1])) + 1;
            }
        }

        return map[m][n];
    }
}
