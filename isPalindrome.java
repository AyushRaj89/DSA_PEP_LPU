class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] S = s.toCharArray();
        int left = 0;
        int right = S.length-1;
        while(left < right) {
            if(S[left] != S[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
