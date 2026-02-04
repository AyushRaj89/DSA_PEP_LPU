class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        int i = 0, j = 0;
        while(i < s.length() && j < t.length()) {
            if(S[i] == T[j]) {
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i == S.length;
    }
}
