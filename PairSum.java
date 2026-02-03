//Pair Sum in a Sorted and Rotated Array

// Given an array of positive elements arr[] that is sorted and then
// rotated around an unknown point, the task is to check if the array
//  has a pair with sum equals to a given target.

// Input: arr[] = [7, 9, 1, 3, 5], target = 6
// Output: true
// Explanation: arr[2] and arr[4] has sum equals to 6 which is equal to the target.

import java.util.Scanner;

public class PairSum {
    static boolean pairSum(int[] arr, int target) {
        int n = arr.length;
        int i = 0;
        for(i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]){
                break;
            }
        }

        int left = (i+1) % n; //Smallest element
        int right = i; //largest element

        while (left != right) {
            if(arr[left] + arr[right] == target) {
                return true;
            }

            if(arr[left] + arr[right] > target) {
                right = (right + n - 1) % n; //move (backward) right
            }

            if(arr[left] + arr[right] < target) {
                left = (left + 1) % n; //move (forward) left
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size]; 
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();
        
        System.out.println(pairSum(arr, target));
        sc.close();
    }
}
