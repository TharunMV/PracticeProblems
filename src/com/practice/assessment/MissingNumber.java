package com.practice.assessment;

import java.util.Arrays;

public class MissingNumber {

    private final int[] nums;

    public MissingNumber() {
        this.nums = new int[]{0,7,6,5,4,3,1};
    }

    public int missingNumber() {
        Arrays.sort(nums);
        int l = 0, r = nums.length;
        while(l < r){
            int m = (l+r)/2;
            if(nums[m] > m){
                r = m;
            }else{
                l = m+1;
            }
        }
        return r;
    }
}
