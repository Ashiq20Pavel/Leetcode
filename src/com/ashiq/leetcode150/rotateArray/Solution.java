package com.ashiq.leetcode150.rotateArray;

class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        rotate(nums, 0, len - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, len - 1);
    }

    private void rotate(int[] nums, int left, int right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
