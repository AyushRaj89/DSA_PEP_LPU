// User function Template for Java

class Solution {
    public int countWords(String list[], int n) {
        // code here
       Map<String, Integer> freq = new HashMap<>();
       
       for(String val : list) {
           freq.put(val, freq.getOrDefault(val, 0) + 1);
       }
       
       int twiceCounter = 0;
       for(int count : freq.values()) {
           if(count == 2) {
               twiceCounter++;
           }
       }
       
       return twiceCounter;
    }
}
