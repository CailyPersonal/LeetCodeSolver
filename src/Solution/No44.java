package Solution;

/**
 * Created by caily on 6/15/17.
 */

/**
 * @No. 44
 * @title Wildcard Matching
 * @link https://leetcode.com/problems/wildcard-matching/#/description
 */
public class No44 {

    public boolean isMatch(String s, String p) {

        return isMatch(s.toCharArray(), p.toCharArray(), 0, 0);
    }

    private boolean isMatch(char[] s, char[] p, int sStart, int pStart) {

        if (pStart != p.length && p[pStart] == '*') for (; pStart < p.length - 1 && p[pStart + 1] == '*'; pStart++) ;

        if (pStart == p.length - 1 && '*' == p[pStart]) return true;

        if (sStart == s.length - 1 && pStart == p.length - 1) {
            if ('?' == p[pStart] || s[sStart] == p[pStart]) return true;
        }

        if (s.length == sStart && p.length == pStart) return true;


        if (pStart == p.length) return false;
        else switch (p[pStart]) {
            case '*':

                if (s.length == sStart) return isMatch(s, p, sStart, pStart + 1);
                boolean OK = false;
                for (int i = sStart; !OK && i < s.length; i++) {
                    OK = isMatch(s, p, i, pStart + 1);
                }
                return OK;
            case '?':
                if (sStart == s.length) return false;
                else return isMatch(s, p, sStart + 1, pStart + 1);
            default:
                if (sStart == s.length) return false;
                else if (s[sStart] == p[pStart]) return isMatch(s, p, sStart + 1, pStart + 1);
                else return false;
        }

    }
}
