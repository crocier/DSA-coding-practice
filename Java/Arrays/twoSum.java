/**
 * LeetCode Problem 1. Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum
 *
 */
class Solution {
    public int[] twoSum(int[] A, int target) {
        //hash map approach
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<A.length;i++){
            int comp = target - A[i];
            if(map.containsKey(comp)){
                ans[0]=map.get(comp);
                ans[1]=i;
                return ans;
            }
            else{
                map.put(A[i], i);
            }
        }

        return ans;
        
    }
}