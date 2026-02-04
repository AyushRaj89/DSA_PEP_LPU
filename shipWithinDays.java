class Solution {
    boolean check(int[] weights, int days, int mid) {
        int count = 1;
        int sum = 0;
        for(int i = 0; i < weights.length; i++) {
            if(sum+weights[i] > mid) {
                count++;
                sum = weights[i];
            } else{
                sum+=weights[i];
            }
        }
        return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        int ans = -1;
        for(int i : weights){
            start = Math.max(start, i);
            end += i;
        }
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(check(weights, days, mid)) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}
