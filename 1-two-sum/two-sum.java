class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {        // First element
            for (int j = i + 1; j < nums.length; j++) {    // Second element
                if (nums[i] + nums[j] == target) {         // Check condition
                    return new int[] { i, j };             // Return indices
                }
            }
        }
        return new int[] { -1, -1 }; // If no pair found
    }
}