package Leetcode_Problem_DSA.Interview_45Ques.Level01_Basic;

public class SecondLargest {

    public static int FindSecondLargest(int[] arr){
        if(arr.length < 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }

    public static void main(String[] args){
        int[] arr = {3, 10, 5, 7, 9};
        System.out.println(FindSecondLargest(arr));
    }
}

// TC : O(n)
// SC : O(1)
