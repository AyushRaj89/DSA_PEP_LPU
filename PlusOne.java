import java.util.*;

public class PlusOne {
    static int[] plusOne(int[] nums) {
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] result = new int[nums.length+1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1]; 
        for(int i = 0; i < 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(plusOne(arr)));
        sc.close();
    }
}
