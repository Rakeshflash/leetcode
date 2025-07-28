class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length; // Get the length first
        int[] result = new int[n]; // Result array
        int left = 0;
        int right = n - 1;
        int pos = n - 1; // Position to insert from the end

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;
            } else {
                result[pos] = rightSq;
                right--;
            }
            pos--; // Move to the next position on the left
        }

        return result;
    }
}
