class Solution {
    int findFrequency(int arr[], int x) {
        // code here
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int val : arr) {
            freq.put(val, getOrDefalut(val, 0) + 1);
        }
        
        
    }
}
