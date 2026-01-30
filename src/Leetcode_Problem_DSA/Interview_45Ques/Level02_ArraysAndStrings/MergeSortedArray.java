package Leetcode_Problem_DSA.Interview_45Ques.Level02_ArraysAndStrings;

public class MergeSortedArray {
    public static void merge(int[] num1, int m, int[] num2, int n){
        int i = m-1; //2
        int j = n-1; //2
        int k = m+n-1; // 5

        while(i >= 0 && j >= 0){
            if(num1[i] > num2[j]){
                num1[k] = num1[i];
                i--;
            }
            else{
                num1[k] = num2[j];
                j--;
            }
            k--;
        }

        // copy remaining element of num2
        while(j >= 0){
            num1[k] = num2[j];
            j--;
            k--;
        }

    }

    public static void main(String[] args) {
        int[] num1 = {1, 3, 5, 0, 0, 0 };
        int[] num2 = {2, 4, 6};
        merge(num1, 3, num2,3);
        for(int num : num1){
            System.out.print(num + " ");
        }
    }
}

// Pattern : Two Pointer (same direction, two array)
// TC : O(m+n)
// SC : O(1)