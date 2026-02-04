class Solution {
    
    int binarySearch(int[] arr, int target, boolean isFirst){
        int left = 0;
        int right = arr.length-1;
        int pos = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                pos = mid;
                if(isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return pos;
    }
    
    int countFreq(int[] arr, int target) {
        // code here
        int first = binarySearch(arr, target, true);
        if(first == -1) return 0;
        int last = binarySearch(arr, target, false);
        
        return last - first + 1;
    }
}
