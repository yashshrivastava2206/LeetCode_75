/*
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
*/
class Solution {
    public int longestSubarray(int[] nums) {
        int count=0,size=nums.length,i=0,zeros=0;
        int start=0,end=0;
        while(end<size){
            if(nums[end]==0){
                zeros++;
            }
            end++;
            if(zeros>1) {
                if (nums[start] == 0)
                    zeros--;
                start++;
            }
        }
        return end-start-1;
    }
}
