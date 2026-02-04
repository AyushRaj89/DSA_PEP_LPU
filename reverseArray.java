class Solution {
    void reverse(int[] arr, int start, int end) {
        if(start >= end) return;
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        reverse(arr, start+1, end-1);
    }
    
    public void reverseArray(int arr[]) {
        // code here
        
    int start = 0;
    int end = arr.length-1;
      
    //   while(start < end) {
    //       int temp = arr[start];
    //       arr[start] = arr[end];
    //       arr[end] = temp;
          
    //       start++;
    //       end--;
    //   }
    
    reverse(arr, start, end);
    
    }
}
