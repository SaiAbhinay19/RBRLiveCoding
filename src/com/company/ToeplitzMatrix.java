package com.company;

/**
 *  Given a nxm matrix, I want to find out whether it is Toeplitz matrix or not
 *  Ravindrababu Youtube link on this problem
 *  https://www.youtube.com/watch?v=hrmtEgfpfu8&list=PLEbnTDJUr_IeOytpV7bQrpQMuxe2hVtFa&index=1
 */
public class ToeplitzMatrix {
    public boolean isToplitzMatrix(int[][] matrix) {
        for (int row = 0 ; row < matrix.length-1 ; row++) {
            for (int col = 0 ; col < matrix[row].length -1 ; col++) {
                if (matrix[row][col] != matrix[row + 1][col + 1])
                    return false;
            }
        }
        return true;
    }

    private static void print2DMatrix(int[][] matrix) {
        System.out.println("Test Matrix:");
        for (int[] row : matrix) {
            for (int valInRow : row) {
                System.out.print(valInRow + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();

        int[][] testcase1 = {{1,2,3},{4,5,6},{7,8,9}};
        print2DMatrix(testcase1);
        System.out.println("Testcase1 is Toplitz Matrix : " + toeplitzMatrix.isToplitzMatrix(testcase1));

        int[][] testcase2 = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        print2DMatrix(testcase2);
        System.out.println("Testcase2 is Toplitz Matrix : " + toeplitzMatrix.isToplitzMatrix(testcase2));
    }
}