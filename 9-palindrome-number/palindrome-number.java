class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x); // Convert number to string
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}