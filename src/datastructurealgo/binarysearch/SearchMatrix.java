package datastructurealgo.binarysearch;

/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7,},
                {10, 11, 16, 20,},
                {23, 30, 34, 60,}
        };
        int target = 3;
        boolean result = new SearchMatrix().searchMatrix(matrix, target);
        System.out.println(result);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
