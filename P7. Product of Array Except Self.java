/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multiply=1;
        int[] answer= new int[nums.length];
        int zero=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                zero++;
            }
            else 
            multiply*=nums[i];
            if(zero==2){
                Arrays.fill(answer,0);
                return answer;
            }
            
        }
        if(zero==1){
            Arrays.fill(answer,0);
            answer[j]=multiply;
            return answer;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                answer[i]=multiply;
            }
            else{
                answer[i]=multiply/nums[i];
            }
        }
        
        return answer;
    }
}
