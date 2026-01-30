package Leetcode_Problem_DSA.Interview_45Ques.Level02_ArraysAndStrings;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int find = target - arr[i];

            if(map.containsKey(find)){
                return new int[] {map.get(find), i};
            }

            map.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
