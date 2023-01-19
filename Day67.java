58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
consisting of non-space characters only.




class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr=s.toCharArray();
        int len=0;
        boolean flag=false;
        for(int i=arr.length-1; i>=0;i--)
        {
           if(arr[i] != ' ' && flag != true)
           {
               flag= true;
           }
           if(flag && arr[i] != ' ') len++;
           else if (flag && arr[i] == ' ') break;
        }
        return len;
    }
}
