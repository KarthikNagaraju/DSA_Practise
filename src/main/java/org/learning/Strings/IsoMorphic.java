package org.learning.Strings;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphic {

    public static boolean isIsomorphic(String s, String t) {

        //Time Complexity : O(n)
        //Space Complexity : O(1)
        //Logic : 2 HashMap to store the mapping of characters
        // If already mapped check if the mapping is same or not
        // If not mapped check if the value is already mapped or not
        // If not mapped and value is not mapped then map it
        // If all characters are mapped correctly then return true

        int n = s.length();

        Map<Character,Character> ans = new HashMap<>();

        for(int i=0 ;i<n;i++){

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!ans.containsKey(original)){
                if(!ans.containsValue(replacement)){
                    ans.put(original,replacement);
                }else{
                    return false;
                }

            }else if(ans.get(original) != replacement){
                return false;
            }
        }

        return true;



    }


    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;
        return (s+s).contains(goal);

    }
}
