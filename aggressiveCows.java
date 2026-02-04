class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        int start = 1;
        int end = stalls[n-1] - stalls[0];
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(check(stalls, mid, k)) {
                end = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
