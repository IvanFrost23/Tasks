class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        unordered_map <int, int> ans_map;
        vector <int> ans;
        vector <int> stack;
        
        for (int i = nums2.size() - 1; i >= 0; i--)
        {
            if (stack.size() == 0) {
                stack.push_back(nums2[i]);
                ans_map[nums2[i]] = -1;
            } else {
                while (stack.size() > 0 && stack.back() <= nums2[i]) {
                    stack.pop_back();
                }
                if (stack.size() == 0) {
                    stack.push_back(nums2[i]);
                    ans_map[nums2[i]] = -1;
                } else {
                    ans_map[nums2[i]] = stack.back();
                    stack.push_back(nums2[i]);
                }
            }
        }
        
        for (auto i : nums1) {
            ans.push_back(ans_map[i]);
        }
        
        return ans;
    }
};