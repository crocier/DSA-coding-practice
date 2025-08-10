/**
 * Problem : Check prime Number 
 *
 */
public class Solution {
  public int isPrime(int A) {
    // Number which has exactly 2 factors are prime numbers
    if (countFactors(A) == 2) {
      return 1;
    } else {
      return 0;
    }
  }

  public int countFactors(int A) {
    int count = 0;
    for (int i = 1; i <= Math.sqrt(A); i++) {
      if (i == Math.sqrt(A)) {
        count++;
      } else if (A % i == 0) {
        count += 2;
      }
    }
    return count;
  }
}
