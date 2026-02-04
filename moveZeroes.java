class Solution {
    public void moveZeroes(int[] nums) {
        int startpos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){ 
                nums[startpos] = nums[i];
                startpos++;
            }
        }
        while(startpos < nums.length) {
            nums[startpos] = 0;
            startpos++;
        }
    }
}
