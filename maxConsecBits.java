class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count1 = 0;
        int count0 = 0;
        
        int maax1 = 0;
        int maax0 = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count1++;
                maax1 = Math.max(maax1, count1);
            } else {
                count1 = 0;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count0++;
                maax0 = Math.max(count0, maax0);
            } else {
                count0 = 0;
            }
        }
        
        return Math.max(maax0, maax1);
    }
}
