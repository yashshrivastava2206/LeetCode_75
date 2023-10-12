/*
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
*/
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer= new ArrayList<>();
        Set one = new HashSet<>();
        Set two = new HashSet<>();
        int nums1Size=nums1.length;
        int nums2Size=nums2.length;
        int size= nums1Size>nums2Size?nums1Size:nums2Size;
        for(int i=0;i<size;i++){
            if(i<nums1Size)
            one.add(nums1[i]);
            if(i<nums2Size)
            two.add(nums2[i]);
        }

        Set<Integer> temp= new HashSet<>(one);
        one.removeAll(two);
        two.removeAll(temp);
        answer.add(new ArrayList(one));
        answer.add(new ArrayList(two));
        return answer;
    }
}
