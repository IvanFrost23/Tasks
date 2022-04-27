class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int check = 0;
        int copy = x;
        while (x != 0) {
            check = check * 10 + x % 10;
            x /= 10;
        }
        return copy == check;
    }
}