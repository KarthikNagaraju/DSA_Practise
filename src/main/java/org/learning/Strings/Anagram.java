package org.learning.Strings;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s, String t) {

        //optimized approach
        //Time Complexity : O(n)
        //Space Complexity : O(1)
        //Logic : Create a frequency array of size 26 for each character in the string
        // Increment the frequency for each character in the first string
        // Decrement the frequency for each character in the second string
        // If the frequency of any character is not zero then return false
        // Else return true
        // This approach works only for lowercase letters
        //

        s.toLowerCase();
        t.toLowerCase();
        int[] freq = new int[26];

        if(s.length() != t.length()) return false;

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            if(freq[t.charAt(i)-'a'] ==0){
                return false;
            }
            freq[t.charAt(i)-'a']--;
        }

        return true;

    }
}
