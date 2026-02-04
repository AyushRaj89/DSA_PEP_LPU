class Solution {
    int minSum(int[] nums) {
        int curr = nums[0];
        int minSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            curr = Math.min(nums[i], curr + nums[i]);
            minSum = Math.min(minSum, curr);
        }
        return minSum;
    }

    int maxSum(int[] nums) {
        int curr = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            maxSum = Math.max(maxSum, curr);
        }
        return maxSum;
    }

    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        for(int i : nums) {
            totalSum += i;
        }
        int maxSum = maxSum(nums);
        int minSum = minSum(nums);

        if(maxSum < 0) {
            return maxSum;
        }

        int circularSum = totalSum - minSum;
        return Math.max(circularSum, maxSum);
    }
}
