class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int max = 0;
        for(int n : nums){
            max = Math.max(max, n);
        }
        int[] freq = new int[max + 1];
        for(int n : nums){
            freq[n]++;
            if(freq[n] > 2){
                return false;
            }
        }
        return true;
    }
}