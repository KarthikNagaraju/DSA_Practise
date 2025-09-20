package org.learning.Strings;

public class LongestPalindrome {

    public static  String longestPalindrome(String s) {



        //Substring -> start index , end index+1
        //Substring always 0,end+1;
        /*String str = "raceca";
        String part = s.substring(0,5);
        System.out.println(part);*/


        //Length of String - shift one step past the last index
        // r-l-1;

        //Formulas
        //odd length -> (maxlen-1)/2
        //even length -> maxlen/2

        //start = i - (maxlen-1)/2
        //end = i + maxlen/2
        //TC -> O(n^2)
        //SC -> O(1)

        int i = 0;
        int n = s.length();
        int maxlen = 0;
        int start = 0, end = 0;



        while (i < n) {

            //odd 1element will expand;
            //i -> i-1,i+1;
            int len = expandAtCenter(s, i, i);


            //even 2 elements will expand
            //i , i+1 = i-1,i+2;
            int len1 = expandAtCenter(s, i, i + 1);

            maxlen = Math.max(len, len1);

            if (maxlen > end - start) {
                start = i - (maxlen - 1) / 2;
                end = i + maxlen / 2;
            }


            i++;

        }

        return s.substring(start, end+1);


    }

    private static int expandAtCenter(String s, int i, int j) {

        while(i >= 0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }

        return j-i-1;
    }


}
