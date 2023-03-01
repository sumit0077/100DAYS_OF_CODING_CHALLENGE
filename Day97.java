Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0) low++;
        if(high%2==0) high--;
        return ((high-low)/2)+1;
   
    }
}
