package Leetcode_Problem_DSA.Interview_45Ques.Level02_ArraysAndStrings;

public class MoveZeros {

    public static void moveZero(int[] arr) {
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZero(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}

// Pattern : Two Pointer (same direction)
// TC : O(n)
// SC : O(1)