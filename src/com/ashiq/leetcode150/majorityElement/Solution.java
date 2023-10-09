package com.ashiq.leetcode150.majorityElement;

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length / 2];
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int res =  nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == res) count++;
            else{
                count--;
                if(count == 0){
                    res = nums[i];
                    count = 1;
                }
            }
        }
        return res;
    }
}