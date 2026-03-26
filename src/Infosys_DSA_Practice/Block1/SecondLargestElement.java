package Infosys_DSA_Practice.Block1;

public class SecondLargestElement {
    public static int secondLargest(int[] arr){
        if(arr.length < 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];

            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20};
        System.out.println("SecondLargest : " + secondLargest(arr));

    }
}
