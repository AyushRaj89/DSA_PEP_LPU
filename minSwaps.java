class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1){
                totalOnes++;
            }
        }
        if(totalOnes == 0 || totalOnes == n) {
            return 0;
        }
        int currOnes = 0;
        for(int i = 0; i < totalOnes; i++) {
            if(nums[i] == 1) {
                currOnes++;
            }
        }
        int maxOnes = 0;
        
        for(int  i = 0; i < n ; i++) {
            currOnes -= nums[i];
            currOnes += nums[(i+totalOnes)%n];
            maxOnes = Math.max(maxOnes, currOnes);
        }
        return totalOnes - maxOnes;
    }
}
