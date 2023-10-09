/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.
*/
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int size= s.length();
        int j=0;
        StringBuffer str = new StringBuffer();
        for(int i=0;i<size;i++){
            if(i>0 && s.charAt(i)==' ' && s.charAt(i-1)==' ') 
            {
                j=i+1;
                continue;
            }
            if(s.charAt(i)==' '){
                str.insert(0,' '+s.substring(j,i));
                j=i+1;

            }
            
        }
        str.insert(0,s.substring(j));
        return str.toString();
    }
}
