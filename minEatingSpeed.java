class Solution {

    boolean check(int[] piles, int h, int mid) {
        int reqTime = 0;
        for(int i = 0; i < piles.length; i++) {
            reqTime += (piles[i] + mid - 1) / mid;
        }
        return reqTime <= h;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        
        for(int pile : piles) {
            max = Math.max(max, pile);
        }

        int start = 1, end = max;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(check(piles, h, mid)) {
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return end;
    }
}
