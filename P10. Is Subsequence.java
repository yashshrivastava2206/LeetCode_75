/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some 
(can be none) of the characters without disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/
class Solution {
    public boolean isSubsequence(String s, String t) {
        int prev=0;
        for(int i=0;i<s.length() ;i++){
            if((prev=t.indexOf(s.charAt(i),prev))!=-1){
                prev+=1;
                // System.out.println(prev);
            }
            else return false;
        }
        return true;
    }
}
