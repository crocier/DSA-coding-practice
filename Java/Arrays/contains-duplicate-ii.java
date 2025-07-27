/**
 * LeetCode Problem 219. Contains Duplicate II
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/contains-duplicate-ii
 *
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // Always update the index
        }

        return false;
    }
}