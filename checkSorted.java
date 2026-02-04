class Solution {
    boolean checkSorted(int[] arr, int left, int right) {
        if(right >= arr.length) return true;
        if(arr[left] > arr[right]) return false;
        return checkSorted(arr, left+1, right+1);
    }
    
    public boolean isSorted(int[] arr) {
        // code here
        return checkSorted(arr, 0, 1);
    }
}
