package Leetcode_Problem_DSA.Interview_45Ques.Level02_ArraysAndStrings;

public class MajorityElement {
    public int majorityElement(int[] nums){
        int candidate = 0;
        int count = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;

    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        MajorityElement m = new MajorityElement();
        System.out.println(m.majorityElement(nums));

    }
}
