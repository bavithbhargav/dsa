package com.bavithbhargav.dsa.leetcode.arrays.easy;

public class MissingNumber {

    // https://leetcode.com/problems/missing-number/

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for(int i=0; i<n; i++) {
            totalSum += nums[i];
        }

        int requiredSum = (n*(n+1))/2;
        return requiredSum-totalSum;
    }

}
