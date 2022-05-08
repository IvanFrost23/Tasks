class Solution {
public:
    vector<int> fairCandySwap(const vector<int>& aliceSizes, const vector<int>& bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;
        unordered_set <int> a;
        for (auto i : aliceSizes) {
            sumAlice += i;
        }
        for (auto i : bobSizes) {
            sumBob += i;
            a.insert(i);
        }
        int diff = (sumAlice - sumBob) / 2;
        for (auto i : aliceSizes) {
            if (a.count(i - diff)) {
                return {i, i - diff};
            }
        }
        return {0, 0};
    }
};
