// User function Template for Java

class Solution {
    
    int sum(int[] arr, int n) {
        if(n <= 0) return 0;
        return arr[n-1] + sum(arr, n-1);
    }
    
    int arraySum(int arr[]) {
        // code here
        int n = arr.length;
        return sum(arr, n);
    }
}
