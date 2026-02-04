class Solution {
    boolean checkPalindrom(char[] S, int left, int right) {
        while(left <= right) {
            if(S[left] != S[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        char[] S = s.toCharArray();
        int left = 0;
        int right = S.length - 1;
        while(left <= right) {
            if(S[left] != S[right]) {
                return checkPalindrom(S, left+1, right) || checkPalindrom(S, left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }
}
