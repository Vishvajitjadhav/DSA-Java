package Infosys_DSA_Practice.Block1;

public class MissingNumber {
    public static int missingNumber(int[] nums){
        int n = nums.length;

        int expectedValue = n*(n+1) / 2;
        int actualValue = 0;

        for(int num : nums){
            actualValue += num;
        }

        return expectedValue - actualValue;
    }
    public static void main(String[] args) {
        int[] arr = {3, 0 , 1};
        System.out.println(missingNumber(arr));

    }
}
