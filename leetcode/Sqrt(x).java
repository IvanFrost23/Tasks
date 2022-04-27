class Solution {
    public int mySqrt(int x) {
        Long left = Long.valueOf(0);
        Long right = Long.valueOf(x);
        
        if (x == 1) {
            return 1;
        }
        
        if (x == 0) {
            return 0;
        }
        
        while (left + 1 < right) {
            Long middle = (left + right) / 2;
            if (middle * middle > Long.valueOf(x)) {
                right = middle;
            } else {
                left = middle;
            }
        }
        int ans = (int)left.intValue();
        return ans;
    }
}