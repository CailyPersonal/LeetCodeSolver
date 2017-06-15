package Solution;

/**
 * Created by caily on 6/15/17.
 */
public class No43 {
    public String multiply(String num1, String num2) {

        int l1 = num1.length(), l2 = num2.length();

        if (l1 + l2 < 2) return "";
        if(num1.equals("0") || num2.equals("0")) return "0";

        char[] array = new char[l1 + l2];

        int carry = 0;

        boolean OK = false;

        for(int i = 0; i < l1 + l2 - 1;i++) {

            for (int j = i > l2 -1 ? i - l2 + 1 : 0; j <= i && j < l1 && i - j < l2; j++) {
                carry += (num1.charAt(l1 - 1 - j) - '0') * (num2.charAt(l2 - 1 - i + j) - '0');
            }

            array[l1+l2-1-i] = (char) ((carry % 10) + '0');
            carry /= 10;
        }

        for(int i=l1+l2-1; carry!=0;i++){
            array[l1+l2-1-i] = (char) ((carry % 10) + '0');
            carry /= 10;
        }

        String s = new String(array);

        return 0 == s.charAt(0) ? s.substring(1) : s;
    }
}
