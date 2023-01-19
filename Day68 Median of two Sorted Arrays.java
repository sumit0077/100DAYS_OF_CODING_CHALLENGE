import java.util.*;
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] arr = new int[m+n];
        for(int i=0 ; i<m ; i++){
            arr[i]=nums1[i];
        }
        int k=0;
        for(int i=m; i<arr.length ; i++){
            arr[i]=nums2[k];
            k++;
        } 
        Arrays.sort(arr);
        int lo=0 , hi= arr.length, mid =0;
        mid = (lo+hi/2);
        // if(arr.length==1){
        //     return arr[0];
        // }
        //  else if(arr.length==2){
        //     double l =(arr[0]+arr[1]);
        //     l /=2;
        //     return l;
        // }
       
         if(arr.length%2 !=0){
             double e = (arr[mid]); //+arr[mid+1])/2;
             return e;
        }
        else{
            double f =  ((arr[mid])+(arr[mid-1]));
            f /=2;
            return f;
        } 
    } 
}
