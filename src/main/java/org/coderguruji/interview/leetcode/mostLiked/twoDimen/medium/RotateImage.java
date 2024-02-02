package org.coderguruji.interview.leetcode.mostLiked.twoDimen.medium;

public class RotateImage {
  public static void rotate(int[][] matrix){
    //transpose matrix in place
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
//        int temp = matrix[i][j];
//        matrix[i][j] = matrix[j][i];
//        matrix[j][i] = temp;
        swap(matrix,i,j,j,i);
      }
    }

    // reverse from 1 to last in each rows.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n/2; j++) {
//        int temp = matrix[i][j];
//        matrix[i][j] = matrix[i][n-j-1];
//        matrix[i][n-j-1] = temp;
        swap(matrix,i,j,i,n-j-1);
      }
  }
  }

  public static void swap(int[][] matrix, int i1,int j1 , int i2, int j2){
    int temp = matrix[i1][j1];
    matrix[i1][j1]= matrix[i2][j2];
    matrix[i2][j2] = temp;
  }

}
