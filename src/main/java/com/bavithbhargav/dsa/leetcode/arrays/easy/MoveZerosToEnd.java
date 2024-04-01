package com.bavithbhargav.dsa.leetcode.arrays.easy;

public class MoveZerosToEnd {

    // https://leetcode.com/problems/move-zeroes/

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int insertIndex = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] != 0) {
                nums[insertIndex++] = nums[i];
            }
        }

        for(int i=insertIndex; i<n; i++) {
            nums[i] = 0;
        }
    }

}
