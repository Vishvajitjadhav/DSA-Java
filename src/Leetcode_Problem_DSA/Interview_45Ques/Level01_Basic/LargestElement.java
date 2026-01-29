package Leetcode_Problem_DSA.Interview_45Ques.Level01_Basic;

public class LargestElement {

    public static int FindLargest(int[] arr){
        int largest = arr[0];
        for(int i=1; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int[] arr = {3, 10, 5, 7, 9};
        System.out.println(FindLargest(arr));
    }

}

// Output : 10

// TC : O(n)
// SC : O(1)
