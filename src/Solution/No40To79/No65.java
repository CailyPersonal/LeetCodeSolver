package Solution.No40To79;

/**
 * Created by caily on 6/22/17.
 */
public class No65 {
    public boolean isNumber(String s) {


        char[] array = s.toCharArray();

        // Remove the block from left and right.
        int start = 0, end = s.length() - 1;
        while (start < array.length && ' ' == array[start]) start++;
        while (end > -1 && ' ' == array[end]) end--;

        if (end < start) return false;

        int index = start;
        while (index <= end && array[index] != 'e') index++;


        if (index == start || index == end) return false;
        else if (index == end + 1) return validNumber(start, end, array, false);
        else return (validNumber(start, index - 1, array, false) && validNumber(index + 1, end, array, true));
    }

    private boolean validNumber(int start, int end, char[] array, boolean right) {

        if (end < start) return false;
        int numCount = 0, dotCount = 0, otherCount = 0;

        // Can only accept at most 1 dotCount, at most 1 otherCount and unlimit others.
        for (int i = start; i <= end; i++) {

            if (array[i] == '.') dotCount++;
            else if (array[i] == '+' || array[i] == '-') otherCount++;
            else if (array[i] > 47 && array[i] < 58) numCount++;
            else return false;
        }

        // Right part of e can not hold a dot!
        if (true == right) {
            if (dotCount > 0) return false;
        }

        if (otherCount > 1 || dotCount > 1) return false;
        if (1 == otherCount) return ('+' == array[start] || '-' == array[start]) && numCount > 0;
        if (1 == dotCount) return numCount > 0;
        return true;
    }
}
