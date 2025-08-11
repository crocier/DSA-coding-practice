/**
 * Problem : Rotate Array
 *
 */
public class Solution {
  public int[] rotateArray(int[] A, int B) {
    // step 1 : reverse entire array
    // step 2 : reverse 1st B elements
    // step 3 : reverse remaining N-B elements

    int N = A.length;
    if (B > N) {
      B = B % N;
    }
    reverse(A, 0, N - 1);
    reverse(A, 0, B - 1);
    reverse(A, B, N - 1);

    return A;
  }

  void reverse(int[] A, int start, int end) {
    while (start < end) {
      int temp = A[start];
      A[start] = A[end];
      A[end] = temp;
      start++;
      end--;
    }
  }
}
