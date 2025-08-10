/**
 * Introduction to Problem solving
 * Question: Count factors
 *
 */
public class Solution {
  public int factorCount(int N) {
    int count = 0;

    for (int i = 1; i <= Math.sqrt(N); i++) {
      if (i == Math.sqrt(N)) {
        count++;
      }

      else if (N % i == 0) {
        count += 2;
      }
    }

    return count;
  }
}