package Solution.No40To79;

/**
 * Created by caily on 6/22/17.
 */
public class No67 {
    public String addBinary(String a, String b) {

        int toAdd = 0;

        char[] a1 = a.toCharArray(), a2 = b.toCharArray();
        int[] array = new int[Math.max(a1.length, a2.length)];


        for (int i = 0; i < Math.min(a1.length, a2.length); i++) {

            array[array.length - 1 - i] = a1[a1.length - 1 - i] + a2[a2.length - 1 - i] - 96 + toAdd;

            toAdd = array[array.length - 1 - i] / 2;
            array[array.length - 1 - i] %= 2;
        }

        char[] lg = a1.length > a2.length ? a1 : a2;

        for (int i = Math.min(a1.length, a2.length); i < lg.length; i++) {
            array[array.length - 1 - i] = lg[lg.length - 1 - i] + toAdd - 48;
            toAdd = array[array.length - 1 - i] / 2;
            array[array.length - 1 - i] %= 2;

            if (0 == toAdd) {
                for(++i;i<lg.length;i++) array[array.length - 1 - i] = lg[lg.length - 1 - i] -48;
                break;
            }
        }


        char[] result;

        if (0 == toAdd) {
            result = new char[lg.length];
            for (int i = 0; i < lg.length; i++) result[i] = (char) (array[i] + '0');
        } else {
            result = new char[lg.length + 1];
            result[0] = (char) (toAdd + '0');
            for (int i = 0; i < lg.length; i++) result[i + 1] = (char) (array[i] + '0');
        }

        return new String(result);
    }
}
