class Solution {
    int check(int n, int m, int mid) {
        long ans = 1;
        for(int i = 1; i <= n; i++) {
            ans *= mid;
            if(ans > m) {
                return 2;
            }
        }
        if(ans == m) return 1;
        return 0;
    }
    public int nthRoot(int n, int m) {
        // code here
        if(m == 0) return 0;
        int start = 1;
        int end = m;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int ans = check(n, m, mid);
            if(ans == 2) {
                end = mid - 1;
            } else if(ans == 1) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
