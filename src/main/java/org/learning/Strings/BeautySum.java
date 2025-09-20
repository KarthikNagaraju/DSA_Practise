package org.learning.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeautySum {

    public static int beautySum(String s) {
        List<String> ls = new ArrayList<>();
        int beauty = 0;
        for(int i =0 ; i< s.length();i++){
            for(int j=i;j<s.length();j++){
                String word = s.substring(i,j+1);
                beauty+= beautySumWord(word);

            }


        }

        return beauty;

    }

    private static int beautySumWord(String word ) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 0;

        int[] freq = new int[26];

        while (i < word.length()) {
            freq[word.charAt(i) - 'a']++;
            i++;
        }

        for (int fr : freq) {
            if(fr>0) {
                min = Math.min(fr, min);
                max = Math.max(fr, max);
            }
        }
        return max - min;

    }

}
