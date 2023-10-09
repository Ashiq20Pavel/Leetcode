package com.ashiq.leetcode150.hIndex;

class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] counter = new int[len + 1];

        for (int c : citations){
            counter[Math.min(len, c)]++;
        }

        int k = len;
        for(int s = counter[len]; k > s; s+= counter[k]){
            k--;
        }
        return k;
    }
}