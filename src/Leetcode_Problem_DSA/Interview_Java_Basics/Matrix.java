package Leetcode_Problem_DSA.Interview_Java_Basics;
import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int rows = 4;
        int cols = 3;
        System.out.println(matrix[2][1]);

        for(int i=0; i<rows;i++){
            for(int j=0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }



    }
}
