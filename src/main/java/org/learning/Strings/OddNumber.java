package org.learning.Strings;

public class OddNumber {

    public static String largestOddNumber(String num) {

        String ans = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            int n = num.charAt(i) - '0';
            if (n % 2 == 1) {

                ans = new String(num.toCharArray(), 0, i-0+1);
                break;
            }
        }
        return ans;
    }
}
