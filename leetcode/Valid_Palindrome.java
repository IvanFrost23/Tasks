class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (true) {
            while (left < right && !(Character.isLetter(s.charAt(left)) || Character.isDigit(s.charAt(left)))) {
                left++;
            }
            while (left < right && !(Character.isLetter(s.charAt(right)) || Character.isDigit(s.charAt(right)))) {
                right--;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                    left++;
                    right--;
                    continue;
                } else {
                    return false;
                }
            } else {
                break;
            }
        }
        return true;
    }
}