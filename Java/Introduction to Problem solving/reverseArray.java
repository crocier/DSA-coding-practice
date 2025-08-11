/**
 * Problem : Reverse Array for given range
 *
 */
public class Solution {
    public int[] reverseArray(int[] A, int B, int C) {
        while(B < C){
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }

        return A;
    }
}
