/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
*/
class Solution {
    public static int findMax(int[] nums , int size){
        if(size==0) return -1;
        int max=nums[0];
        for(int num : nums){
            if(num>max)
            max=num;
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int size=candies.length;
        List<Boolean> maxCandies = new ArrayList<>();
        int max= findMax(candies,size);
        for(int candy : candies){
            maxCandies.add((candy+extraCandies)>=max?true:false); 
        }
        return maxCandies;
    }
}
