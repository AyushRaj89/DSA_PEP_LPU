class Solution {
    boolean twoSum(int[] arr, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
       
       for(int i = 0; i < arr.length; i++) {
           int num = arr[i];
           int complement = target - num;
           
           if(map.containsKey(complement)) {
               return true;
           }
           map.put(num, i);
       }
       return false;
    }
}
