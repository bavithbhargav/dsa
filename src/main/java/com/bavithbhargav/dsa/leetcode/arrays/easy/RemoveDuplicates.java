package com.bavithbhargav.dsa.leetcode.arrays.easy;

public class RemoveDuplicates {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;


        int insertIndex = 0;

        int left = 0;
        int right = left + 1;

        while(left < n) {
            right = left + 1;
            while(right < n && nums[right] == nums[left]) {
                right++;
            }
            nums[insertIndex++] = nums[left];
            left = right;
        }

        return insertIndex;
    }

}
