class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] S = s.toCharArray();
        for(int i = 0;i < s.length(); i++) {
            freq[S[i] - 'a']++;
        }

        for(int i = 0; i < S.length; i++) {
            if(freq[S[i] - 'a'] == 1) return i;
        }
        return -1;
    }
}
