class Solution {
    public int missingNumber(int[] nums) {
      int  n = nums.length;
      int d=0;
       for(int i =0;i<n;i++){
        d +=nums[i]; 
    }
 int c = n*(n+1)/2;
 int f = c-d;
return f;}}


