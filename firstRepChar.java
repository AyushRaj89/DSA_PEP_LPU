// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        int[] freq = new int[26];
        char[] S = s.toCharArray();
        for(int i = 0; i < S.length; i++){
            freq[S[i] - 'a']++;
            if(freq[S[i] - 'a'] > 1) return String.valueOf(S[i]);
        }
        return "-1";
    }
}
