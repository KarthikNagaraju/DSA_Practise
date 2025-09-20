package org.learning.BinarySearch;

public class HigherBound {

    public static int higherBound(int[] nums, int target){

        int si =0 , ei = nums.length-1;
        int ans = 0;

        while(si<=ei){

            int mid = si + (ei-si)/2;

            if(target<nums[mid]){
                ei = mid-1;
                ans = mid;
            }else{
                si = mid+1;
            }
        }

        return ans;
    }
}
