class Solution {
    void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public void sortColors(int[] nums) {
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i+1; j < nums.length; j++) {
        //         if(nums[i] > nums[j]) {
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] == 0){
        //         count0++;
        //     }else if(nums[i] == 1) {
        //         count1++;
        //     } else{
        //         count2++;
        //     }
        // }

        // int i = 0;
        // while(count0 > 0){
        //     nums[i++] = 0;
        //     count0--;
        // }

        // while(count1 > 0) {
        //     nums[i++] = 1;
        //     count1--;
        // }

        // while(count2 > 0) {
        //     nums[i++] = 2;
        //     count2--;
        // }

        int start = 0;
        int end = nums.length-1;
        for(int i = 0; i <= end; i++) {
            if(nums[i] == 2){
                swap(nums[i], nums[end]);
                end--;
                i--;
            }else if(nums[i] == 0) {
                swap(nums[i], nums[start]);
                start++;
            }
        }
    }
}
