package Leetcode_Problem_DSA.Interview_45Ques.Level02_ArraysAndStrings;

public class MissingNumber {
    public int missingNum(int[] nums){
        int n = nums.length;
        int expectedSum = n*(n+1) / 2;
        int actualSum = 0;

        for(int num : nums){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1};
        MissingNumber n = new MissingNumber();
        System.out.println(n.missingNum(arr));



    }
}
