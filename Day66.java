Q- leetcode(35)
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
class Solution {
    public int searchInsert(int[] nums, int target) {
      //int j=0;
      int lo=0;
      int hi=nums.length-1;
      while (lo<=hi){
      int mid= lo +(hi-lo)/2;
      if(nums[mid]<target)
     {
         lo=mid+1;
     }
     else if(nums[mid]>target)
     {
         hi=mid-1;
     }
     else
     {
         return mid;
     }

    }
    return lo;
}
}
