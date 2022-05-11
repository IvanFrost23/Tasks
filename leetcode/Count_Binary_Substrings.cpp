class Solution {
public:
    int countBinarySubstrings(string s) {
        int now = 1;
        int old = -1;
        int ans = 0;
        for (int i = 1; i < s.length(); i++)
        {
            if (s[i] == s[i - 1])
            {
                now++;
            }
            else
            {
                if (old == -1)
                {
                    old = now;
                    now = 1;
                }
                else
                {
                    ans += min(now, old);
                    old = now;
                    now = 1;
                }
            }
        }
        ans += max(0, min(now, old));
        return ans;
    }
};
