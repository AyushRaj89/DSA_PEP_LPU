class Solution {
    boolean check(int[] arr, int k, int mid) {
        int count = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(sum+arr[i] > mid) {
                count++;
                sum=arr[i];
            }else {
                sum+=arr[i];
            }
        }
        return count<=k;
    }
    
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length < k) return -1;
        int low = 0;
        int high = 0;
        for(int i : arr) {
            low = Math.max(low, i);
            high += i;
        }
        
        int res = -1; 
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(check(arr, k , mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}
