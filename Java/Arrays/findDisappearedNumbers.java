/**
 * LeetCode Problem 448. Find All Numbers Disappeared in an Array
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
 *
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] A) {
        List<Integer> ansList = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            int index = Math.abs(A[i])-1;
            if(A[index] > 0){
                A[index] = -A[index];    
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i] > 0){
                ansList.add(i+1);
            }
        }
        return ansList;
    }
}