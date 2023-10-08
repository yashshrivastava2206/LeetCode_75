/*
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

*/
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str2+str1).equals(str1+str2))
        return "";
        int gcd=Math.min(str1.length(),str2.length());
        
        for(;gcd>=1;gcd--){
            if(str1.length()%gcd==0 && str2.length()%gcd==0)
            break;
        }
        return str1.substring(0,gcd);
        
    }
}
