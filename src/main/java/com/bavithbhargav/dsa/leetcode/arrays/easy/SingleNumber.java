package com.bavithbhargav.dsa.leetcode.arrays.easy;

public class SingleNumber {

    // https://leetcode.com/problems/single-number/

    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }

}
