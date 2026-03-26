package DataStructure.Sorting;
import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            int min = i;

            for(int j = i; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            // Just to visualize
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        // Output
        System.out.print("Final Selection Sort : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

//Approach : Find minimum and swap it.
// TC : O(n^2)
// SC : O(1)