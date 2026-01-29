package Leetcode_Problem_DSA.Interview_45Ques.Level01_Basic;

public class LinearSearch {
    public static int searchElement(int[] arr, int target){

        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return i; // found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args){
        int[] arr = {4, 1, 7, 3, 9};
        int target = 7;
        System.out.println(searchElement(arr, target));

    }
}
