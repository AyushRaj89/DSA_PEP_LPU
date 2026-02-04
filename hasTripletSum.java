class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
    //   for(int i = 0; i < arr.length-2; i++) {
    //       HashSet<Integer> set = new HashSet<>();
    //       int newtarget = target - arr[i];
    //       for(int j = i+1; j < arr.length; j++) {
    //           int complement = newtarget - arr[j];
    //           if(set.contains(complement)) {
    //               return true;
    //           }
    //           set.add(arr[j]);
    //       }
    //   }
    //   return false;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n-2; i++) {
            int left = i + 1, right = n-1;
            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target) {
                    return true;
                }
                
                if(sum < target) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
}
