package Leetcode_Problem_DSA.Interview_Java_Basics;

public class MatrixPrintDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int rows = 4;
        int cols = 3;

        for(int i=0; i<rows;i++){
            for(int j=0; j < cols; j++){
                if(i==j){
                    System.out.print(matrix[i][j] + " ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }



    }
}
