/*
You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

The input will be generated such that the operation is always possible.
It can be shown that the resulting string will always be unique.
*/

//Solution 1 :Without Stack
class Solution {
    public String removeStars(String s) {
        StringBuffer str = new StringBuffer();
        int length=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                length++;
                str.append(s.charAt(i)+"");
            }
            else{
                str.replace(length-1,length,"");
                length--;
            }
        }
        return str.toString();
    }
}

//Solution 2 : Using Stack
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='*')
            stack.pop();
            else
            stack.push(s.charAt(i));
        }
        String str="";
        while(!stack.isEmpty()){
            str=stack.pop()+str;
        }
        return str;
    }
}
