package Leetcode_Problem_DSA.Interview_45Ques.Level01_Basic;

public class FindMaxMin {

    public static void findMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i < arr.length - 1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            else if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    public static void main(String[] args){
        int[] arr = {3, 1, 9, 5, 2};
        findMaxMin(arr);
    }
}

// Pattern : traversal + comparison
// Logic : First element is both mean and max, then travels array, then update max and mean.
// TC : O(n)
// SC : O(1)
