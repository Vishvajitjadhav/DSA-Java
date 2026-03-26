package DataStructure.Sorting;
import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] arr){

        for(int i = arr.length-1; i > 0; i--){
            int didSwap = 0;

            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            // edge case if arr is already  sorted
            if(didSwap == 0){
                break;
            }

            // Just to visualize
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.print("Final Bubble Sort : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

//Approach : Compare to adjacent number and if j > j+1, then Swap the number.
// TC : O(n^2)
// SC : O(1)