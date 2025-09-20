package org.learning;

import org.learning.BinarySearch.HigherBound;
import org.learning.BinarySearch.LowerBound;
import org.learning.Strings.*;


public class Main {
    public static void main(String[] args) {

       System.out.println(ValidateParanthesis.removeOuterParentheses(""));

        ReverseString.reverseWords("a good good  example");

        OddNumber.largestOddNumber("35427");

        IsoMorphic.isIsomorphic("egg","add");

        NestedDepth.maxDepth("8*((1*(5+6))*(8/6))");

        RoamnInteger.romanToInt("LVIII");
        System.out.println(Atoi.myAtoi("+-12"));

        LongestPalindrome.longestPalindrome("babad");

        //Substring always 0,end+1;
        String s = "raceca";
        String part = s.substring(0,6);
        System.out.println(part);

        //length of string
        //shift one step past the last index
        System.out.println(s.length());

        BeautySum.beautySum("aabcb");

        ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama");

        RemoveAllOccurance.removeOccurrences("daabcbaabcbc","abc");

        LowerBound.lowerBound(new int[]{3,5,8,9,15,19},9);

        HigherBound.higherBound(new int[]{3,5,8,9,15,19},9);

    }
}