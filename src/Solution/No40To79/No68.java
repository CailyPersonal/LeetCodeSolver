package Solution.No40To79;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by caily on 6/22/17.
 */
public class No68 {

    public List<String> fullJustify(String[] words, int maxWidth) {

        int[] lengthArray = new int[words.length];

        // Find suitable items form list.
        int i = 0, count = 0, sum = 0;
        while (i < words.length && sum + lengthArray[i] <= maxWidth) {
            sum += lengthArray[i];
            ++i;
            ++count;
        }

        int space = maxWidth - sum, single = space / count, offset = space % count;




        return new LinkedList<String>();
    }
}
