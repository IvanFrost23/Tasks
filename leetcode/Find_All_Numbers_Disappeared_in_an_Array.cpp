class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n = (int)nums.size();
        for (int i = 0; i < n; i++)
        {
            int val = abs(nums[i]) - 1;
            if (nums[val] > 0)
                nums[val] = -nums[val];
        }
        vector <int> ans;
        for (int i = 1; i <= nums.size(); i++)
        {
            int v = i - 1;
            if (nums[v] > 0)
                ans.push_back(i);
        }
        return ans;
    }
};