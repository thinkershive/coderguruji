package org.coderguruji.interview.leetcode.mostLiked.twoDimen.medium;

import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();

    //set boundaries
    int rowBegin=0;
    int rowEnd= matrix.length-1;
    int colBegin =0;
    int colEnd = matrix[0].length-1;


    while (rowBegin <= rowEnd && colBegin <= colEnd){
      // Traverse from left to right.
      for (int i = colBegin; i <=colEnd ; i++) {
        result.add(matrix[rowBegin][i]);
      }
      rowBegin++;
      // Traverse downwards.
      for (int i = rowBegin; i <rowEnd ; i++) {
        result.add(matrix[i][colEnd]);
      }
      colEnd--;

      if(rowBegin<=rowEnd){
        for (int i = colEnd; i <=colBegin ; i--) {
        result.add(matrix[rowEnd][i]);
        }
      }
      rowEnd--;

      if (colBegin<=colEnd){
        for (int i = rowEnd ; i < rowBegin; i--) {
          result.add(matrix[i][colBegin]);
        }
      }
      colBegin++;
    }


    return result;

  }

}
