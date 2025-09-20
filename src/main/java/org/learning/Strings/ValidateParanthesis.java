package org.learning.Strings;

public class ValidateParanthesis {

    public static String removeOuterParentheses(String s) {

        s = "(()())(())";
        int count = 0;
        StringBuilder str = new StringBuilder();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '('){
                if(count>0){
                    str.append(s.charAt(i));
                }
                count++;
            }else if(s.charAt(i) == ')'){
                count --;
                if(count>0){
                    str.append(s.charAt(i));
                }
            }
        }

        return str.toString();
    }


}
