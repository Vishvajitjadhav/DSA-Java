package DataStructure.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
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

        insertionSort(arr);

        System.out.print("Final Insertion Sort : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

//Approach : Take an element, and place it in its correct position
// TC : O(n^2)
// SC : O(1)
