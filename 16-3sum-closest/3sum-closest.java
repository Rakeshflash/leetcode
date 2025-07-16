class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Step 1: Sort the array to use two-pointer approach
        Arrays.sort(nums);

        // Step 2: Initialize the closestSum with the first 3 elements
        // This handles the base case and gives a starting point
        int closestSum = nums[0] + nums[1] + nums[2];

        // Step 3: Loop through the array, fixing one element each time
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;                // Second pointer just after i
            int right = nums.length - 1;     // Third pointer at the end

            // Two-pointer traversal
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Step 4: If currentSum is closer to target, update closestSum
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                // Step 5: Move pointers based on comparison with target
                if (currentSum < target) {
                    left++; // Increase sum by moving left to right
                } else {
                    right--; // Decrease sum by moving right to left
                }
            }
        }

        // Step 6: Return the closest sum found
        return closestSum;
    }
}