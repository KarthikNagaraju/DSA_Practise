package org.learning.Strings;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        if(s == null) return false;


        StringBuilder str = new StringBuilder();

        for (Character ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(ch);
            }
        }

        if(str.isEmpty())return true;

        int i =0;
        int j = str.length()-1;
        while(i<=j){

            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                return false;
            }else{
                i++;
                j--;
            }

        }

        return true;
    }


}
