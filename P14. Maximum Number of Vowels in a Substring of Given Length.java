/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
*/
class Solution {
    public int maxVowels(String s, int k) {
        String vowelSet="aeiou";
        int count=0;
        int size=s.length();
        if(k==1){
            for(int i=0;i<size;i++){
                if(vowelSet.contains(s.charAt(i)+""))
                return 1; 
            }
        }
        int i;
        for(i=0;i<k;i++){
            if(vowelSet.contains(s.charAt(i)+""))
            count++;
        }
        
        int max=count;
        for(int j=0;i<size;i++,j++){
                // System.out.println(s.charAt(j)+" "+s.charAt(i));
                if(vowelSet.contains(s.charAt(j)+""))
                count--;
                if(vowelSet.contains(s.charAt(i)+""))
                count++;
                if(count>max)
                max=count;
                // System.out.println(count+" "+max);
        }
        return max;
    }
}
