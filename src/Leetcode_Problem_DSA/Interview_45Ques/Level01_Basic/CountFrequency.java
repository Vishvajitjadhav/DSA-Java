package Leetcode_Problem_DSA.Interview_45Ques.Level01_Basic;

public class CountFrequency {

    public static int countFreq(int[] arr, int x){
        int count = 0;
        for(int num : arr){
            if(num == x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 4, 2};
        System.out.println(countFreq(arr, 2));
    }

}

// Pattern : counting logic
// Logic : whenever element == x , count++
// TC : O(n)
// SC : O(1)
