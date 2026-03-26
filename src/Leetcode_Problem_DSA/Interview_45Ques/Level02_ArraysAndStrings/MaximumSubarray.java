package Leetcode_Problem_DSA.Interview_45Ques.Level02_ArraysAndStrings;

public class MaximumSubarray {
    public static int maxSubArraySum(int[] nums){
        int currSum = 0;
        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++){
            currSum = currSum + nums[i];
            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0){
                currSum = 0;
            }
        }
         return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {3, -4, 5, 4, -1, 7, -8};
        int[] arr2 = {5,4,-1,7,8};
        System.out.println(maxSubArraySum(arr));
        System.out.println(maxSubArraySum(arr2));

    }
}
