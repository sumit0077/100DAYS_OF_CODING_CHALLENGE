You are given an array, arr of length N, and also a single integer K . Your task is to split the array arr into K non-overlapping, non-empty subarrays.
For each of the subarrays, you calculate the sum of the elements in it. Let us denote these sums as S1, S2, S3, ..., SK. Where Si denotes the sum of the elements in the ith 
subarray from left.
Let G = GCD( S1, S2 ,S3 , ..., SK).
Find the maximum value of G that can be obtained. 
The array may contain duplicate elements.
class Solution {
    public static int solve(int N, int K, int[] arr) {
        // code here
        if(N==1) return arr[0];
        int ans=1;
        for(int i=1;i<N;i++){
            arr[i]+=arr[i-1];
        }
        if(K==1) return arr[N-1];
        for(int i=2; i*i<=arr[N-1]; i++){
            if(arr[N-1]%i==0){
                int c=0, d=0, z=arr[N-1]/i;
                for(int j : arr){
                    if(j%i==0) c++;
                    if(j%z==0) d++;
                    
                }
                if(c>=K) ans=Math.max(ans,i);
                if(d>=K) ans=Math.max(ans,z);
            }
        }
        return ans;
    }
}
        
