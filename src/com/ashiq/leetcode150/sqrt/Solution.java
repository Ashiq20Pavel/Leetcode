package com.ashiq.leetcode150.sqrt;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int min = 1, max = x, mid = 0;
        while(true){
            mid = min + (max - min) / 2;
            if (mid > x / mid){
                max = mid - 1;
            }
            else{
                if ((mid + 1) > (x / (mid + 1))){
                    return mid;
                }
                else
                    min = mid + 1;
            }
        }

    }
}
