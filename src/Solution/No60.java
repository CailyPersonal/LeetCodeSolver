package Solution;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by caily on 6/22/17.
 */
public class No60 {
    public String getPermutation(int n, int k) {

        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < n; list.add(i+1), i++);

        char[] str = new char[n];
        int[] values = new int[n];
        values[n - 1] = 1;

        // The first num is no use, so ignore it.
        for(int i = 1; i < n - 1; i++){
            values[n - 1 - i] = values[n - i]*(i+1);
        }

        k--;
        for(int i = 0, index = 0; i < n - 1; i++){

            index = k / values[i + 1];

            str[i] = (char)(list.get(index) + '0');
            list.remove(index);

            k %= values[i + 1];
        }

        str[n-1]=(char)('0'+list.get(0));

        return new String(str);
    }
}
