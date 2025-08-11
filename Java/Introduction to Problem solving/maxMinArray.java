/**
 * Problem : Max Min of an Array
 *
 */
public class Solution {
	public int maxMinArray(int[] A) {
		int max = findMax(A);
		int min = findMin(A);
		return max + min;
	}

	int findMax(int[] A) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			max = Math.max(max, A[i]);
		}
    return max;
	}

	int findMin(int[] A) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			min = Math.min(min, A[i]);
		}
    return min;
	}
}
