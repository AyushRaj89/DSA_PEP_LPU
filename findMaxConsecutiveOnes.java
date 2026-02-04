class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maax = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                maax = Math.max(maax, count);
            } else{
                count = 0;
            }
        }
        return maax;
    }
}
