package org.coderguruji.interview.leetcode.topFrequency.twoDimen.easy;

public class TransposeMatrix {
  public int[][] transpose(int[][] matrix) {
    int[][] newMatrix = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        newMatrix[j][i] = matrix[i][j];
      }
    }
    return matrix;
  }

}
