package org.learning.Strings;

public class NestedDepth {

    public static int maxDepth(String s) {

        int depth = 0,count = 0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                count++;
                depth = Math.max(depth,count);
            } else if (s.charAt(i)==')'){
                {
                count--;
                }
            }
        }

        return depth;
    }
}
