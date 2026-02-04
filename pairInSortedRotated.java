
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n = arr.length;
        int i = 0;
        for(i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) {
                break;
            }
        }
        int left = (i+1) % n;
        int right = i;
        
        while(left != right) {
            if(arr[left] + arr[right] == target) {
                return true;
            }
            
            if(arr[left] + arr[right] < target) {
                left = (left + 1) % n;
            }
            
            if(arr[left] + arr[right] > target) {
                right = (right + n - 1) % n;
            }
        }
        return false;
    }
}
