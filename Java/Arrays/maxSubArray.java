/**
 * LeetCode Problem 53. Maximum Subarray
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/maximum-subarray
 *
 */
class Solution {
    public int maxSubArray(int[] nums) {
        
        //kadane's algorithm
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for(int num : nums){
            int sumValue = currentSum + num;
            if(sumValue < num){
                currentSum = num;
            }
            else{
                currentSum = sumValue;
            }
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
        
    }
}