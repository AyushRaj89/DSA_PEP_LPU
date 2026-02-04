class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int windowSum = 0;
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            
            if(i >= k) {
                windowSum -= arr[i-k];
            }
            
            if(i >= k-1) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }
}
