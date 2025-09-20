package org.learning.Strings;

import java.util.Arrays;
import java.util.Collections;

public class LargestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String firstElement = strs[0];
        String lastElement = strs[strs.length-1];
        StringBuilder str = new StringBuilder();

        for(int i=0;i<firstElement.length();i++){
           if( firstElement.charAt(i) != lastElement.charAt(i)){
               break;
           }
            str.append(firstElement.charAt(i));

        }

        return new String(str);
    }
}
