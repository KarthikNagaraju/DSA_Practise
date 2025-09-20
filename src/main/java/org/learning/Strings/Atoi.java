package org.learning.Strings;

public class Atoi {

    public static int myAtoi(String s) {
        long ans = 0;
        int i = 0;
        int n = s.length();
        int sign = 1;

        //Check for Spaces
        while(i<n && s.charAt(i)==' ')i++;


        //Check only for one Symbol
        if (i<n && (s.charAt(i) == '+' || s.charAt(i) == '-') ) {
            sign= s.charAt(i) == '-' ?(-1) : 1;
            i++;
        }

        while(i<n && Character.isDigit(s.charAt(i))){

            int digit = s.charAt(i) - '0';

            if(ans > (Integer.MAX_VALUE - digit)/10)
            {
                return sign ==-1 ?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            ans= ans*10 + digit;

            i++;
        }

        //Always sign first
        return (int)(sign*ans);


    }
}
