class Solution {
public:
    int binaryGap(int n) {
        int prev_one = -1;
        int now_one = -1;
        int ind = 0;
        int ans = 0;
        while (n != 0)
        {
            if (n % 2 == 1 && prev_one == -1)
            {
                prev_one = ind;
            }
            else
            {
                if (n % 2 == 1)
                {
                    ans = max(ans, ind - prev_one);
                    prev_one = ind;
                }
            }
            ind++;
            
            n /= 2;
        }
        return ans;
    }
};