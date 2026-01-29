package Leetcode_Problem_DSA.Interview_45Ques.Level02_ArraysAndStrings;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] arr){
        if(arr.length == 0) return 0;

        int index = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[index] = arr[i];
                index++;


            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,  1, 2, 2, 3};
        int k = removeDuplicates(arr);
        System.out.println(k);
         for(int i =0; i < k; i++){
             System.out.print(arr[i] + " ");
        }
    }
}
