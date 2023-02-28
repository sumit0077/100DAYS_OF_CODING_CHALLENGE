Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
A subarray is a contiguous subsequence of the array.
  
  class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       
        int win=1,ans=0;
        while(win<=arr.length){
            for(int i=0;i<=arr.length-win;i++){
                for(int j=i;j<i+win;j++){
                    ans+=arr[j];
                }
            }
            win+=2;
        }
        return ans;
    }
}
