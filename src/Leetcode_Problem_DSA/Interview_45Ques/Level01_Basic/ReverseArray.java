package Leetcode_Problem_DSA.Interview_45Ques.Level01_Basic;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] nums){
         int left = 0;
         int right = nums.length - 1;

         while(left < right){
             int temp = nums[left];
             nums[left] = nums[right];
             nums[right] = temp;
             left++;
             right--;
         }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
        // or
        System.out.println(Arrays.toString(arr));
    }
}

// Pattern : Two Pointer (opposite direction)
// LOGIC : Swap left right, left++ right--
// TC : O(n)
// SC : O(1)
