// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int totalK = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= k) {
                totalK++;
            }
        }
        
        if(totalK == 0 || totalK == arr.length ) return 0;
        
        int currKs = 0;
        for(int i = 0; i < totalK; i++) {
            if(arr[i] <= k) {
                currKs++;
            }
        }
        
        int maxKs = currKs;
        for(int i = totalK ; i < arr.length; i++) {
            if(arr[i-totalK] <= k) currKs--;
            if(arr[i] <= k) currKs++;
            maxKs = Math.max(maxKs, currKs);
        }
        return totalK - maxKs;
    }
}

