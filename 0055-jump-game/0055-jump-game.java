class Solution {
    public boolean canJump(int[] nums) {
        int fast =0;
         for (int i=0;i<nums.length;i++){
            if(i>fast)return false;
            fast=Math.max(fast,i+nums[i]);
            if(fast>=nums.length-1)return true;
         }
         return false;
    }}