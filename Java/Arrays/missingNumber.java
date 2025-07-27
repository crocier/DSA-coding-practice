/**
 * LeetCode Problem 268. Missing Number
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/missing-number
 *
 */
class Solution {
    public int missingNumber(int[] nums) {
        //find total sum of the numbers 
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        //expected sum
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int missingNumber = expectedSum - actualSum;
        return missingNumber;
    }
}