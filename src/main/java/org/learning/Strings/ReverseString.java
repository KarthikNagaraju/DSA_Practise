package org.learning.Strings;

import java.util.*;
import java.util.stream.IntStream;

public class ReverseString {

    public static String reverseWords(String s) {

        //Algo
        //Reverse complete string
        //Reverse word
        //trim spaces

        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        int start = 0, end = 0;

        StringBuilder str = new StringBuilder();
        Set<String> strSet = new HashSet<>();

        reverseString(ch, i, j);
        System.out.println(new String(ch));

        //Always String / Char starts from 0 - n-1;
        //Reverse Each Word
        //Remove Duplicates
        //Trim Spaces
        //Time Complexity O(n)
        // Space Complexity O(n)
        while (i <= j) {

            while (i <= j && ch[i] == ' ') i++;
            if (i > j) break;

            start = i;
            while (i <= j && ch[i] != ' ') i++;
            end = i - 1;

            //Reverse Each Word
            reverseString(ch, start, end);
            System.out.println(new String(ch));

            int len = end - start + 1;

            String word = new String(ch, start, len);

            //Check Duplicates
            if (!strSet.contains(word)) {
                if (!str.isEmpty()) str.append(" ");
                str.append(word);
                strSet.add(word);
            }


        }

        System.out.println(new String(str));
        return new String(str);
    }

    private static void reverseString(char[] ch, int i, int j) {

        while (i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }

    public static String reverseWordsEasy(String s) {
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
       return  String.join("", words);
    }


}
