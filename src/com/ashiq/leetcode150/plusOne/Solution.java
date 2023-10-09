package com.ashiq.leetcode150.plusOne;

class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        for(int i = size - 1; i >= 0; --i){
            ++digits[i];
            digits[i] %= 10;
            if (digits[i] != 0) return digits;
        }

        digits = new int[size + 1];
        digits[0] = 1;
        return digits;
    }
}
