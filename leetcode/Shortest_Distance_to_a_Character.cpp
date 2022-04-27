class Solution {
public:
    vector<int> shortestToChar(string s, char c) {
        vector <int> a;
        
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == c) {
                a.push_back(i);
            }
        }
        
        vector <int> ans;
        int ind = -1;
        
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == c) {
                ans.push_back(0);
                ind++;
                continue;
            }
            int mi = 2e9;
            if (ind >= 0) {
                mi = abs(i - a[ind]);
            }
            if (ind + 1 < a.size()) {
                mi = min(mi, abs(a[ind + 1] - i));
            }
            ans.push_back(mi);
        }
        return ans;
    }
};