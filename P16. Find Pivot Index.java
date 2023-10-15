/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
*/
class Solution {
    public int pivotIndex(int[] nums) {
        int pivot=0,sum=0,sumR=0;
        for(int i=1;i<nums.length;i++){
            sumR+=nums[i];
        }
        while(pivot<nums.length-1){
            if(sum==sumR)
            return pivot;
            
            sum+=nums[pivot];
            pivot++;
            sumR-=nums[pivot];
            
        }
        if(sum==sumR)
            return pivot;
        return -1;
    }
}
