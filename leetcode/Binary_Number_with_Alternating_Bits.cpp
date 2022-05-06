class Solution {
public:
    bool hasAlternatingBits(int n) {
        int old = -1;
        while (n != 0) {
            if (old == -1) {
                old = n % 2;
                n /= 2;
                continue;
            }
            if (old == n % 2) {
                return false;
            }
            old = n % 2;
            n /= 2;
        }
        return true;
    }
};