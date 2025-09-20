package org.learning.Strings;

import java.util.Stack;

public class RemoveAllOccurance {

    public static String removeOccurrences(String s, String part) {

    StringBuilder ans = new StringBuilder();


    //Logic
        //Iterate over string s
        //Append each character to ans
        //Check if ans length is greater than part length
        //If yes, extract substring from ans of length part from the end
        //If substring equals part, remove that part from ans
        //Continue until all characters in s are processed
        //Return ans as string
        //Time complexity O(n*m) where n is length of s and m is length of part in worst case
        //Space complexity O(n) for ans

    for(int i =0;i<s.length(); i++){
        ans.append(s.charAt(i));
        if(ans.length() >= part.length()){
            //Start = ans.length() - part.length()
            // 5-3 = 2 = starting index
            String sub = ans.substring(ans.length()-part.length());
            if(sub.equals(part)){
                //delete part from ans i.e remove last part.length() characters
                ans.setLength(ans.length()-part.length());
            }
        }
    }

    return new String(ans);

    }
}
