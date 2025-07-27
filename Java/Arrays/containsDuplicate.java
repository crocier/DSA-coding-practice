/**
 * LeetCode Problem 217: Contains Duplicate
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/contains-duplicate
 *
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //freq map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entryMap : freqMap.entrySet()) {
            if (entryMap.getValue() > 1) {
                return true;
            }
        }

        return false;
    }
}