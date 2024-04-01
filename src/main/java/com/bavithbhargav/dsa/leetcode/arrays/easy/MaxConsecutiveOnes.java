package com.bavithbhargav.dsa.leetcode.arrays.easy;

public class MaxConsecutiveOnes {

    // https://leetcode.com/problems/max-consecutive-ones/

    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int currCount = 0;
        int maxCountSoFar = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                maxCountSoFar = Math.max(maxCountSoFar, currCount);
                currCount = 0;
            }
            else {
                currCount++;
            }
        }

        maxCountSoFar = Math.max(maxCountSoFar, currCount);
        return maxCountSoFar;
    }

}
