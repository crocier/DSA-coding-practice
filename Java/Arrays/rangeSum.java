/**
 * Problem : Range Sum Query
 * Link: https://www.scaler.com/academy/mentee-dashboard/class/236032/assignment/problems/15991
 *
 */
public class Solution {
  public long[] rangeSum(int[] A, int[][] B) {
    long[] pSum = prefixSum(A);
    long[] ans = new long[B.length];
    for (int i = 0; i < B.length; i++) {
      int L = B[i][0];
      int R = B[i][1];
      long val;
      if (L != 0) {
        val = pSum[R] - pSum[L - 1];
      } else {
        val = pSum[R];
      }
      ans[i] = val;
    }

    return ans;
  }

  long[] prefixSum(int[] A) {
    long[] pSum = new long[A.length];
    pSum[0] = A[0];
    for (int i = 1; i < A.length; i++) {
      pSum[i] = pSum[i - 1] + A[i];
    }
    return pSum;
  }
}
